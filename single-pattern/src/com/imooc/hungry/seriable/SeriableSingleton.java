package com.imooc.hungry.seriable;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: zhangbiao
 * Date: 2020/1/7
 * Time: 15:58
 * To change this template use File | Settings | File Templates.
 */
public class SeriableSingleton implements Serializable {

    /**
     * 序列化: 把内存中的状态转化为字节码的形式，从而转换成一个IO流，
     * 然后写入到其他地方， 内存中的状态永久的保存下来了
     *
     * 反序列化：已经持久化的字节码内容，转换为IO流
     * 通过io流的读取，进而将读取的内容转换为java 对象
     * 在转换过程中重新创建java对象
     *
     */
    private static SeriableSingleton instance = new SeriableSingleton();

    private SeriableSingleton (){

    }
    public static SeriableSingleton getInstance(){
        return instance;
    }

    public Object readResolve(){
        return instance;
    }

}
