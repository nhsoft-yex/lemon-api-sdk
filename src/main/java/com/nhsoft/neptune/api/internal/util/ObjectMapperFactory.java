package com.nhsoft.neptune.api.internal.util;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.json.JsonReadFeature;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalTimeSerializer;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Optional;
import java.util.function.Function;

public final class ObjectMapperFactory {

    private static final ObjectMapper UNMODIFIABLE_OBJECT_MAPPER = createModifiableObjectMapper();

    // 常用日期时间格式
    public static final String DATE_FORMAT = "yyyy-MM-dd";
    public static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
    public static final String TIME_FORMAT = "HH:mm:ss";

    private ObjectMapperFactory() {
    }

    /**
     * 创建一个配置了标准设置的新 {@link ObjectMapper} ，调用方可以安全地定制新实例
     *
     * @return 可修改 {@link ObjectMapper} 实例
     */
    public static ObjectMapper createInstance() {
        return createModifiableObjectMapper();
    }

    /**
     * 创建一个配置了标准设置的新 {@link ObjectMapper} ，调用方可以安全地定制新实例
     *
     * @param jsonFactory {@link JsonFactory} 实例
     * @return 可修改 {@link ObjectMapper} 实例
     */
    public static ObjectMapper createInstance(JsonFactory jsonFactory) {
        return createModifiableObjectMapper(new ObjectMapper(jsonFactory));
    }

    /**
     * 获取使用标准设置配置的 ObjectMapper 实例。这些实例被认为是共享的并且是不可变的。
     *
     * @return 不可变 {@link ObjectMapper} 实例
     */
    public static ObjectMapper getInstance() {
        return UNMODIFIABLE_OBJECT_MAPPER;
    }


    private static ObjectMapper createModifiableObjectMapper() {
        return createModifiableObjectMapper(new ObjectMapper());
    }

    private static ObjectMapper createModifiableObjectMapper(final ObjectMapper objectMapper) {
        SimpleModule module = new SimpleModule();
        module.addSerializer(Long.TYPE, ToStringSerializer.instance);
        module.addSerializer(Long.class, ToStringSerializer.instance);

        objectMapper.setPropertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE);
        registerModule(objectMapper, "com.fasterxml.jackson.datatype.guava.GuavaModule");
        registerModule(objectMapper, "com.fasterxml.jackson.datatype.jdk8.Jdk8Module");
        registerAdditionalModules(objectMapper, System::getProperty);
        objectMapper.registerModule(module);
        objectMapper.configure(DeserializationFeature.FAIL_ON_TRAILING_TOKENS, true);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.configure(DeserializationFeature.ADJUST_DATES_TO_CONTEXT_TIME_ZONE, false);
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        objectMapper.configure(SerializationFeature.WRITE_DURATIONS_AS_TIMESTAMPS, false);
        objectMapper.configure(JsonReadFeature.ALLOW_UNESCAPED_CONTROL_CHARS.mappedFeature(), true);
        
        // 配置传统日期格式
        SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_TIME_FORMAT);
        objectMapper.setDateFormat(dateFormat);
        objectMapper.getDeserializationConfig().with(dateFormat);
        objectMapper.getSerializationConfig().with(dateFormat);
        
        // 配置时间格式
        JavaTimeModule javaTimeModule = new JavaTimeModule();
        
        // LocalDateTime序列化和反序列化
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(DATE_TIME_FORMAT);
        javaTimeModule.addSerializer(LocalDateTime.class, new LocalDateTimeSerializer(dateTimeFormatter));
        javaTimeModule.addDeserializer(LocalDateTime.class, new LocalDateTimeDeserializer(dateTimeFormatter));
        
        // LocalDate序列化和反序列化
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(DATE_FORMAT);
        javaTimeModule.addSerializer(LocalDate.class, new LocalDateSerializer(dateFormatter));
        javaTimeModule.addDeserializer(LocalDate.class, new LocalDateDeserializer(dateFormatter));
        
        // LocalTime序列化和反序列化
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern(TIME_FORMAT);
        javaTimeModule.addSerializer(LocalTime.class, new LocalTimeSerializer(timeFormatter));
        javaTimeModule.addDeserializer(LocalTime.class, new LocalTimeDeserializer(timeFormatter));
        
        // Date类型序列化
        module.addSerializer(Date.class, new DateSerializer(false, dateFormat));
        
        objectMapper.registerModule(javaTimeModule);

        return objectMapper;
    }

    private static void registerAdditionalModules(final ObjectMapper objectMapper,
                                                  final Function<String, String> propertyAccessor) {
        final String moduleClassNames = propertyAccessor.apply("common.object-mapper-additional-module-class-names");
        if (moduleClassNames != null) {
            for (final String moduleClassName : moduleClassNames.split(",")) {
                registerModule(objectMapper, moduleClassName);
            }
        }
    }

    private static void registerModule(final ObjectMapper objectMapper, final String className) {
        final Optional<Class<? extends Module>> moduleClass = getClass(className);
        if (moduleClass.isPresent()) {
            try {
                final Module module = moduleClass.get().getDeclaredConstructor().newInstance();
                objectMapper.registerModule(module);
            } catch (final Exception e) {
//                LOGGER.warn(String.format("Unable to instantiate module; module=%s", moduleClass.get()), e);
            }
        }
    }

    private static <T> Optional<Class<? extends T>> getClass(final String className) {
        try {
            @SuppressWarnings("unchecked") final Optional<Class<? extends T>> clazz =
                    Optional.of((Class<T>) Class.forName(className));
            return clazz;
        } catch (final ClassNotFoundException e) {
            return Optional.empty();
        }
    }
}