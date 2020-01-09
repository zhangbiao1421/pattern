package com.imooc.lazy;

/**
 * Created by IntelliJ IDEA.
 * User: zhangbiao
 * Date: 2020/1/7
 * Time: 15:22
 * To change this template use File | Settings | File Templates.
 */
public class LazySingletonTest {

    public static void main(String[] args) {

        Thread t = new Thread(new ExectorThread());
        Thread t1 = new Thread(new ExectorThread());
        t.start();
        t1.start();
    }
}
