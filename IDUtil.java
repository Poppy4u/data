package com.itheima.config.util;

/**
 * @description: id生成器-不适合集群
 * @author: tangxiaocheng
 * @create: 2021-02-13 10:21
 */
public class IDUtil {
    public static Long startTime = System.currentTimeMillis();

    public static synchronized String getID(){
        startTime = startTime + 1;
        return startTime+"";
    }
}
