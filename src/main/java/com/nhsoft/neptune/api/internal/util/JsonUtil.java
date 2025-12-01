package com.nhsoft.neptune.api.internal.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * JSON工具类，提供各种类型的JSON序列化和反序列化操作
 */
public class JsonUtil {

    private static final ObjectMapper DEFAULT_MAPPER = ObjectMapperFactory.getInstance();

    /**
     * 将对象序列化为JSON字符串
     *
     * @param obj 待序列化的对象
     * @return JSON字符串
     * @throws JacksonException 序列化异常
     */
    public static String toJson(Object obj) throws JacksonException {
        try {
            return DEFAULT_MAPPER.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            throw new JacksonException(e);
        }
    }

    /**
     * 将对象序列化为格式化的JSON字符串
     *
     * @param obj 待序列化的对象
     * @return 格式化的JSON字符串
     * @throws JacksonException 序列化异常
     */
    public static String toPrettyJson(Object obj) throws JacksonException {
        try {
            return DEFAULT_MAPPER.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            throw new JacksonException(e);
        }
    }

    /**
     * 将JSON字符串反序列化为指定类型的对象
     *
     * @param json  JSON字符串
     * @param clazz 目标类型Class
     * @param <T>   泛型类型
     * @return 反序列化后的对象
     * @throws JacksonException 反序列化异常
     */
    public static <T> T fromJson(String json, Class<T> clazz) throws JacksonException {
        try {
            return DEFAULT_MAPPER.readValue(json, clazz);
        } catch (IOException e) {
            throw new JacksonException(e);
        }
    }

    /**
     * 将JSON字符串反序列化为复杂泛型类型
     *
     * @param json         JSON字符串
     * @param typeReference 目标类型引用
     * @param <T>          泛型类型
     * @return 反序列化后的对象
     * @throws JacksonException 反序列化异常
     */
    public static <T> T fromJson(String json, TypeReference<T> typeReference) throws JacksonException {
        try {
            return DEFAULT_MAPPER.readValue(json, typeReference);
        } catch (IOException e) {
            throw new JacksonException(e);
        }
    }

    /**
     * 将JSON字符串反序列化为复杂泛型类型
     *
     * @param json JSON字符串
     * @param type 目标类型
     * @param <T>  泛型类型
     * @return 反序列化后的对象
     * @throws JacksonException 反序列化异常
     */
    public static <T> T fromJson(String json, Type type) throws JacksonException {
        try {
            return DEFAULT_MAPPER.readValue(json, DEFAULT_MAPPER.constructType(type));
        } catch (IOException e) {
            throw new JacksonException(e);
        }
    }

    /**
     * 将字节数组反序列化为指定类型的对象
     *
     * @param bytes 字节数组
     * @param clazz 目标类型Class
     * @param <T>   泛型类型
     * @return 反序列化后的对象
     * @throws JacksonException 反序列化异常
     */
    public static <T> T fromJson(byte[] bytes, Class<T> clazz) throws JacksonException {
        try {
            return DEFAULT_MAPPER.readValue(bytes, clazz);
        } catch (IOException e) {
            throw new JacksonException(e);
        }
    }

    /**
     * 将字节数组反序列化为复杂泛型类型
     *
     * @param bytes        字节数组
     * @param typeReference 目标类型引用
     * @param <T>          泛型类型
     * @return 反序列化后的对象
     * @throws JacksonException 反序列化异常
     */
    public static <T> T fromJson(byte[] bytes, TypeReference<T> typeReference) throws JacksonException {
        try {
            return DEFAULT_MAPPER.readValue(bytes, typeReference);
        } catch (IOException e) {
            throw new JacksonException(e);
        }
    }

    /**
     * 将对象转换为Map
     *
     * @param obj 待转换的对象
     * @return Map表示
     * @throws JacksonException 转换异常
     */
    @SuppressWarnings("unchecked")
    public static Map<String, Object> toMap(Object obj) throws JacksonException {
        return DEFAULT_MAPPER.convertValue(obj, Map.class);
    }

    /**
     * 将JSON字符串转换为Map
     *
     * @param json JSON字符串
     * @return Map表示
     * @throws JacksonException 转换异常
     */
    public static Map<String, Object> jsonToMap(String json) throws JacksonException {
        return fromJson(json, new TypeReference<Map<String, Object>>() {});
    }

    /**
     * 将对象转换为List
     *
     * @param obj 待转换的对象
     * @return List表示
     * @throws JacksonException 转换异常
     */
    @SuppressWarnings("unchecked")
    public static List<Object> toList(Object obj) throws JacksonException {
        return DEFAULT_MAPPER.convertValue(obj, List.class);
    }

    /**
     * 将JSON字符串转换为List
     *
     * @param json JSON字符串
     * @return List表示
     * @throws JacksonException 转换异常
     */
    public static List<Object> jsonToList(String json) throws JacksonException {
        return fromJson(json, new TypeReference<List<Object>>() {});
    }

    /**
     * 将JSON字符串转换为指定元素类型的List
     *
     * @param json      JSON字符串
     * @param clazz     元素类型Class
     * @param <T>       泛型类型
     * @return 指定元素类型的List
     * @throws JacksonException 转换异常
     */
    public static <T> List<T> jsonToList(String json, Class<T> clazz) throws JacksonException {
        try {
            return DEFAULT_MAPPER.readValue(json, DEFAULT_MAPPER.getTypeFactory()
                    .constructCollectionType(List.class, clazz));
        } catch (IOException e) {
            throw new JacksonException(e);
        }
    }

    /**
     * 将对象转换为Set
     *
     * @param obj 待转换的对象
     * @return Set表示
     * @throws JacksonException 转换异常
     */
    @SuppressWarnings("unchecked")
    public static Set<Object> toSet(Object obj) throws JacksonException {
        return DEFAULT_MAPPER.convertValue(obj, Set.class);
    }

    /**
     * 将JSON字符串转换为Set
     *
     * @param json JSON字符串
     * @return Set表示
     * @throws JacksonException 转换异常
     */
    public static Set<Object> jsonToSet(String json) throws JacksonException {
        return fromJson(json, new TypeReference<Set<Object>>() {});
    }

    /**
     * 将JSON字符串转换为指定元素类型的Set
     *
     * @param json  JSON字符串
     * @param clazz 元素类型Class
     * @param <T>   泛型类型
     * @return 指定元素类型的Set
     * @throws JacksonException 转换异常
     */
    public static <T> Set<T> jsonToSet(String json, Class<T> clazz) throws JacksonException {
        try {
            return DEFAULT_MAPPER.readValue(json, DEFAULT_MAPPER.getTypeFactory()
                    .constructCollectionType(Set.class, clazz));
        } catch (IOException e) {
            throw new JacksonException(e);
        }
    }

    /**
     * 创建新的ObjectNode（空JSON对象）
     *
     * @return ObjectNode实例
     */
    public static ObjectNode newObjectNode() {
        return DEFAULT_MAPPER.createObjectNode();
    }

    /**
     * 创建新的ArrayNode（空JSON数组）
     *
     * @return ArrayNode实例
     */
    public static ArrayNode newArrayNode() {
        return DEFAULT_MAPPER.createArrayNode();
    }

    /**
     * 解析JSON字符串为JsonNode
     *
     * @param json JSON字符串
     * @return JsonNode实例
     * @throws JacksonException 解析异常
     */
    public static JsonNode parseJson(String json) throws JacksonException {
        try {
            return DEFAULT_MAPPER.readTree(json);
        } catch (IOException e) {
            throw new JacksonException(e);
        }
    }

    /**
     * 将JsonNode转换为指定类型的对象
     *
     * @param node  JsonNode节点
     * @param clazz 目标类型Class
     * @param <T>   泛型类型
     * @return 转换后的对象
     * @throws JacksonException 转换异常
     */
    public static <T> T fromJsonNode(JsonNode node, Class<T> clazz) throws JacksonException {
        return DEFAULT_MAPPER.convertValue(node, clazz);
    }

    /**
     * 将JsonNode转换为复杂泛型类型
     *
     * @param node         JsonNode节点
     * @param typeReference 目标类型引用
     * @param <T>          泛型类型
     * @return 转换后的对象
     * @throws JacksonException 转换异常
     */
    public static <T> T fromJsonNode(JsonNode node, TypeReference<T> typeReference) throws JacksonException {
        return DEFAULT_MAPPER.convertValue(node, typeReference);
    }

    /**
     * 检查字符串是否为有效的JSON
     *
     * @param json 待检查的字符串
     * @return 是否为有效JSON
     */
    public static boolean isValidJson(String json) {
        try {
            DEFAULT_MAPPER.readTree(json);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * 合并两个JSON对象
     *
     * @param json1 第一个JSON字符串
     * @param json2 第二个JSON字符串
     * @return 合并后的JSON字符串
     * @throws JacksonException 处理异常
     */
    public static String merge(String json1, String json2) throws JacksonException {
        try {
            JsonNode node1 = DEFAULT_MAPPER.readTree(json1);
            JsonNode node2 = DEFAULT_MAPPER.readTree(json2);
            JsonNode merged = merge(node1, node2);
            return DEFAULT_MAPPER.writeValueAsString(merged);
        } catch (IOException e) {
            throw new JacksonException(e);
        }
    }

    /**
     * 合并两个JsonNode
     *
     * @param node1 第一个节点
     * @param node2 第二个节点
     * @return 合并后的节点
     */
    private static JsonNode merge(JsonNode node1, JsonNode node2) {
        if (node1 == null) {
            return node2;
        }
        if (node2 == null) {
            return node1;
        }

        if (node1.isObject() && node2.isObject()) {
            ObjectNode result = node1.deepCopy();
            node2.fields().forEachRemaining(entry -> 
                result.set(entry.getKey(), merge(result.get(entry.getKey()), entry.getValue()))
            );
            return result;
        }

        if (node1.isArray() && node2.isArray()) {
            ArrayNode result = node1.deepCopy();
            node2.forEach(result::add);
            return result;
        }

        return node2;
    }

    /**
     * 设置自定义ObjectMapper
     *
     * @param mapper 自定义ObjectMapper
     */
    public static void setObjectMapper(ObjectMapper mapper) {
        if (mapper != null) {
            // 使用反射绕过final限制更新DEFAULT_MAPPER
            try {
                java.lang.reflect.Field field = JsonUtil.class.getDeclaredField("DEFAULT_MAPPER");
                field.setAccessible(true);
                java.lang.reflect.Field modifiersField = java.lang.reflect.Field.class.getDeclaredField("modifiers");
                modifiersField.setAccessible(true);
                modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
                field.set(null, mapper);
            } catch (Exception e) {
                throw new RuntimeException("Failed to set custom ObjectMapper", e);
            }
        }
    }

    /**
     * 获取当前使用的ObjectMapper实例
     *
     * @return ObjectMapper实例
     */
    public static ObjectMapper getObjectMapper() {
        return DEFAULT_MAPPER;
    }
}