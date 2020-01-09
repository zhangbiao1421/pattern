package com.imooc.emums;

/**
 * Created by IntelliJ IDEA.
 * User: zhangbiao
 * Date: 2020/1/9
 * Time: 17:36
 * To change this template use File | Settings | File Templates.
 */
public enum EnumSingleton {
    INSTANCE;

    private Object data;

    public Object getDate(){
        return data;
    }

    public void setDate(Object data){
        this.data = data;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
