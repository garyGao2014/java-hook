package com.github.gary.hook.core.utils;

/**
 * Created by gaozhicheng on 2017/3/13.
 */
public class PropertiesUtil {
    /**
     * 返回文件绝对路径
     *
     * @return
     */
    public static String getAbsFilePath(String pathUrl) {
        if (pathUrl != null && !pathUrl.isEmpty()) {
            String tempPathUrl = pathUrl;
            if (pathUrl.startsWith("/")){
                tempPathUrl = pathUrl.substring("/".length());
            }
            String path = Thread.currentThread().getContextClassLoader().getResource("").getPath();
            if (path != null && !path.equals("")) {
                tempPathUrl = path + tempPathUrl;
            }
            return tempPathUrl;
        }
        return "";

    }
}
