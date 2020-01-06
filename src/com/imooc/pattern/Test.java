package com.company.singleton;

import java.lang.reflect.Constructor;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: zhangbiao
 * @DateTime: 14:05 2019/11/21
 */
public class Test {

    public static void main(String[] args) {
//        Thread t1 = new Thread(new ExectorThread());
//        Thread t2 = new Thread(new ExectorThread());
//        t1.start();
//        t2.start();
//        System.out.println("end");
        Object a1 = LazyInnerSingleton.getInstance();
        Object a2 = null;
        Class clazz = LazyInnerSingleton.class;
        try {
            Constructor constructor = clazz.getDeclaredConstructor(null);
            constructor.setAccessible(true);
            a2 = constructor.newInstance();
            System.out.println( a1 == a2);
            System.out.println("a1 :" + a1);
            System.out.println("a2 :" + a2);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
