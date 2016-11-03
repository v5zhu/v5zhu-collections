package com.v5zhu.design.mode.mode2;

/**
 * Created by zhuxl@paxsz.com on 2016/11/3.
 */
public class SourceTest {
    public static void main(String[] args) {
        SourceWrapper1 s1=new SourceWrapper1();
        SourceWrapper2 s2=new SourceWrapper2();
        s1.method1();
        s1.method2();
        s2.method1();
        s2.method2();
    }
}
