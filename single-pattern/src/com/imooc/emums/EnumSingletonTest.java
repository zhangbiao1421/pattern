package com.imooc.emums;

import java.lang.reflect.Constructor;

/**
 * Created by IntelliJ IDEA.
 * User: zhangbiao
 * Date: 2020/1/9
 * Time: 17:40
 * To change this template use File | Settings | File Templates.
 */
public class EnumSingletonTest {

    public static void main(String[] args) {
        /**
         * 在jdk底层代码逻辑中，  枚举类型其实通过类名和 Class 对象类找到一个唯一的枚举对象
         * 枚举对象不可能被类加载器加载多次。
         */
//        EnumSingleton s1 = null;
//        EnumSingleton s2 = EnumSingleton.getInstance();
//
//        FileOutputStream fos = null;
//        try {
//            fos = new FileOutputStream("EnumSingleton.obj");
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeObject(s2);
//            oos.flush();
//            fos.close();
//
//            FileInputStream fis = new FileInputStream("EnumSingleton.obj");
//            ObjectInputStream ois = new ObjectInputStream(fis);
//            s1 = (EnumSingleton) ois.readObject();
//            fis.close();
//
//            System.out.println(s1 == s2);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        // 反射
        Class clazz = EnumSingleton.class;
        try {
            /**
             * 使用jad 命令编译后
             *    private EnumSingleton(String s, int i)
             *     {
             *         super(s, i);
             *     }
             *     有一个私有得构造方法
             */
            Constructor constructor = clazz.getDeclaredConstructor(String.class, int.class);
            constructor.setAccessible(true);
            constructor.newInstance("zhangbiao", 123);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
