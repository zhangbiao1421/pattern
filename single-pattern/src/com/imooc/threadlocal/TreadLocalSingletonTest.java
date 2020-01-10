package com.imooc.threadlocal;

import com.imooc.lazy.ExectorThread;

/**
 * Created by IntelliJ IDEA.
 * User: zhangbiao
 * Date: 2020/1/10
 * Time: 17:04
 * To change this template use File | Settings | File Templates.
 */
public class TreadLocalSingletonTest {
    public static void main(String[] args) {
        /**
         * 在主线程 main 中无论调用多少次，获取到的实例都是同一个，
         * 都在两个子线程中分别获取到了不同的实例。
         * 那么 ThreadLocal 是如果实现这样的效果的呢？我们知 道上面的单例模式为了达到线程安全的目的，给方法上锁，
         * 以时间换空间。ThreadLocal 将所有的对象全部放在 ThreadLocalMap 中，为每个线程都提供一个对象，
         * 实际上是以 空间换时间来实现线程间隔离的。
         */
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());
        t1.start();
        t2.start();
        System.out.println("End");
    }
}
