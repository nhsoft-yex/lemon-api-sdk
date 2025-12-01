package com.nhsoft.neptune.api.internal.util;

import com.nhsoft.neptune.ApiCloudConstants;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author: xin.ye
 * @description:
 * @Date: 2025/11/5 21:24
 */
public class ApiCloudHashMap extends HashMap<String, String> {
    public ApiCloudHashMap() {
        super();
    }

    public ApiCloudHashMap(Map<? extends String, ? extends String> m) {
        super(m);
    }

    public void put(String key, Object value) {
        String strValue;

        if (value == null) {
            strValue = null;
        } else if (value instanceof String) {
            strValue = (String) value;
        } else if (value instanceof Integer) {
            strValue = ((Integer) value).toString();
        } else if (value instanceof Long) {
            strValue = ((Long) value).toString();
        } else if (value instanceof Float) {
            strValue = ((Float) value).toString();
        } else if (value instanceof Double) {
            strValue = ((Double) value).toString();
        } else if (value instanceof Boolean) {
            strValue = ((Boolean) value).toString();
        } else if (value instanceof Date) {
            DateFormat format = new SimpleDateFormat(ApiCloudConstants.DATE_TIME_FORMAT);
            format.setTimeZone(TimeZone.getTimeZone(ApiCloudConstants.DATE_TIMEZONE));
            strValue = format.format((Date) value);
        } else if (value instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) value;
            strValue = localDateTime.format(DateTimeFormatter.ofPattern(ApiCloudConstants.DATE_TIME_FORMAT));
        } else if (value instanceof LocalDate) {
            LocalDate localDate = (LocalDate) value;
            strValue = localDate.format(DateTimeFormatter.ofPattern(ApiCloudConstants.DATE_FORMAT));
        } else if (value instanceof BigDecimal) {
            BigDecimal bigDecimal = (BigDecimal) value;
            strValue = bigDecimal.toString();
        } else if (Collection.class.isAssignableFrom(value.getClass())) {
            Collection<?> collection = (Collection<?>) value;
            List<String> strList = collection.stream().map(String::valueOf).collect(Collectors.toList());
            strValue = String.join(",", strList);
        } else {
            strValue = value.toString();
        }

        this.put(key, strValue);
    }

    public String put(String key, String value) {
        if (StringUtils.areNotEmpty(key, value)) {
            return super.put(key, value);
        } else {
            return null;
        }
    }
}
