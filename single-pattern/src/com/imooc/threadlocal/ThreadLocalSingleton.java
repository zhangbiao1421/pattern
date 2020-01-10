package com.imooc.threadlocal;

/**
 * Created by IntelliJ IDEA.
 * User: zhangbiao
 * Date: 2020/1/10
 * Time: 17:03
 * To change this template use File | Settings | File Templates.
 */
public class ThreadLocalSingleton {

    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance = new ThreadLocal<ThreadLocalSingleton>() {
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    private ThreadLocalSingleton() {
    }

    public static ThreadLocalSingleton getInstance() {
        return threadLocalInstance.get();
    }
}
