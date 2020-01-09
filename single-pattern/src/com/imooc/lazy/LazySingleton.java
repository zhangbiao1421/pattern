package com.imooc.lazy;

/**
 * Created by IntelliJ IDEA.
 * User: zhangbiao
 * Date: 2020/1/7
 * Time: 15:23
 * To change this template use File | Settings | File Templates.
 */
public class LazySingleton {

    private static LazySingleton instance = null;

    private LazySingleton(){

    }

    public static LazySingleton getInstance(){
        if(instance == null){
            synchronized (LazySingleton.class){
                if(instance == null){
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
