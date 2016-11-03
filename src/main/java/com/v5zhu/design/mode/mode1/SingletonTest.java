package com.v5zhu.design.mode.mode1;

/**
 * Created by zhuxl@paxsz.com on 2016/11/2.
 */
public class SingletonTest {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();
        Singleton s4 = Singleton.getInstance();
    }
}
