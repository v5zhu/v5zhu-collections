package com.v5zhu.design.mode.mode1;

/**
 * Created by zhuxl@paxsz.com on 2016/11/2.
 */
public class Singleton {
    private Singleton() {
        System.out.println("single created !");
    }

    private static class SingletonFactory {
        private static Singleton singleton = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonFactory.singleton;
    }

}
