package com.imooc.lazy;

/**
 * Created by IntelliJ IDEA.
 * User: zhangbiao
 * Date: 2020/1/7
 * Time: 15:21
 * To change this template use File | Settings | File Templates.
 */
public class ExectorThread extends Thread {

    @Override
    public void run() {
        LazySingleton single = LazySingleton.getInstance();
        System.out.println(single);
    }
}
