package com.nhsoft.neptune.api.internal.util;

/**
 * 操作系统检测工具类
 * 用于检测当前运行的操作系统类型
 */
public class OperatingSystemDetector {
    
    /**
     * 操作系统类型枚举
     */
    public enum OSType {
        WINDOWS, MAC, LINUX, UNKNOWN
    }
    
    /**
     * 获取当前操作系统类型
     * @return OSType 操作系统类型
     */
    public static OSType getCurrentOS() {
        String osName = System.getProperty("os.name").toLowerCase();
        
        if (osName.contains("win")) {
            return OSType.WINDOWS;
        } else if (osName.contains("mac")) {
            return OSType.MAC;
        } else if (osName.contains("nix") || osName.contains("nux") || osName.contains("aix")) {
            return OSType.LINUX;
        } else {
            return OSType.UNKNOWN;
        }
    }
    
    /**
     * 获取当前操作系统类型的字符串表示
     * @return String 操作系统名称
     */
    public static String getCurrentOSName() {
        OSType osType = getCurrentOS();
        switch (osType) {
            case WINDOWS:
                return "Windows";
            case MAC:
                return "Mac";
            case LINUX:
                return "Linux";
            default:
                return "Unknown";
        }
    }
    
    /**
     * 判断是否为Windows系统
     * @return boolean 是否为Windows系统
     */
    public static boolean isWindows() {
        return getCurrentOS() == OSType.WINDOWS;
    }
    
    /**
     * 判断是否为Mac系统
     * @return boolean 是否为Mac系统
     */
    public static boolean isMac() {
        return getCurrentOS() == OSType.MAC;
    }
    
    /**
     * 判断是否为Linux系统
     * @return boolean 是否为Linux系统
     */
    public static boolean isLinux() {
        return getCurrentOS() == OSType.LINUX;
    }
}