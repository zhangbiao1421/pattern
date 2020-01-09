package com.imooc.hungry;

/**
 * Created by IntelliJ IDEA.
 * User: zhangbiao
 * Date: 2020/1/7
 * Time: 15:16
 * To change this template use File | Settings | File Templates.
 */
public class HungrySingle {

    // 先静态 后动态
    // 先属性  后方法
    // 先上后下
    private static final HungrySingle hungrySingle = new HungrySingle();

    private HungrySingle(){

    }

    public static HungrySingle getInstance(){
        return hungrySingle;
    }
}
