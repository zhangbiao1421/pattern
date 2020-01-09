package com.imooc.lazy.innerclass;

import java.lang.reflect.Constructor;

/**
 * Created by IntelliJ IDEA.
 * User: zhangbiao
 * Date: 2020/1/7
 * Time: 15:41
 * To change this template use File | Settings | File Templates.
 */
public class LazyInnerClassSingletonTest {

    public static void main(String[] args) {
//        Thread t = new Thread(new LazyInnerExectorThread());
//        Thread t1 = new Thread(new LazyInnerExectorThread());
//        t.start();
//        t1.start();
//        System.out.println("结束了");

        Object o1 = LazyInnerClassSingleton.getInstance();
        Object o2 = null;
        // 反射破坏单例
        Class clazz = LazyInnerClassSingleton.class;
        try {
            // 获得无参构造方法
            //getConstructor()  返回public 的构造方法
            // getDeclaredConstructor()   指定参数类型的构造器 包括private/ public 的
            Constructor constructor = clazz.getDeclaredConstructor();
            // 设置强制访问
            constructor.setAccessible(true);
            o2 = constructor.newInstance();
            System.out.println("o1 :" + o1);
            System.out.println("o2 :" + o2);
            System.out.println("o1 == o2 " +o1 == o2);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
