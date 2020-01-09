package com.imooc.lazy.innerclass;

/**
 * Created by IntelliJ IDEA.
 * User: zhangbiao
 * Date: 2020/1/7
 * Time: 15:39
 * To change this template use File | Settings | File Templates.
 */
public class LazyInnerExectorThread implements Runnable {

    @Override
    public void run() {
        LazyInnerClassSingleton singleton = LazyInnerClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() +"  " + singleton);
    }
}
