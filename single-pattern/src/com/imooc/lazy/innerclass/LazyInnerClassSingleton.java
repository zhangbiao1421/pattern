package com.imooc.lazy.innerclass;

/**
 * 内部类的方式，兼顾了饿汉式的内存浪费，也兼顾synchronize的性能问题
 * Created by IntelliJ IDEA.
 * User: zhangbiao
 * Date: 2020/1/7
 * Time: 15:32
 * To change this template use File | Settings | File Templates.
 */
public class LazyInnerClassSingleton {


    private LazyInnerClassSingleton(){
        if(LazyInnerClass.instance != null){
            throw new RuntimeException("已有实例，不能继续创建");
        }
    }

    /**
     * static 关键字：使单例的空间共享
     * final  关键字： 无法被重载
     * @return
     */
    public static final LazyInnerClassSingleton getInstance(){
        // 在返回结果以前一定先加载内部类
        return LazyInnerClass.instance;
    }

    // 默认不加载
    private static class LazyInnerClass{
        private static final LazyInnerClassSingleton instance = new LazyInnerClassSingleton();
    }
}
