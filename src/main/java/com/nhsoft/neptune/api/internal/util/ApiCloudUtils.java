package com.nhsoft.neptune.api.internal.util;

import java.lang.reflect.Field;

/**
 * @auther nhsoft.yex
 */
public class ApiCloudUtils {

    public static ApiCloudHashMap buildTextParams(Object bizModel) {
        ApiCloudHashMap map = new ApiCloudHashMap();
        if (bizModel == null) {
            return map;
        }
        Field[] fields = bizModel.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            String key = camelToSnake(field.getName());
            try {
                map.put(key, field.get(bizModel));
            } catch (IllegalAccessException e) {
                //todo
            }
        }
        return map;
    }


    /**
     * 驼峰命名转蛇形命名
     * 例如：userName -> user_name
     * firstName -> first_name
     */
    private static String camelToSnake(String camelCase) {
        if (camelCase == null || camelCase.isEmpty()) {
            return camelCase;
        }

        StringBuilder result = new StringBuilder();
        char[] chars = camelCase.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            // 如果是大写字母且不是第一个字符，则在前面加下划线
            if (Character.isUpperCase(c) && i > 0) {
                result.append('_');
            }
            result.append(Character.toLowerCase(c));
        }

        return result.toString();
    }
}
