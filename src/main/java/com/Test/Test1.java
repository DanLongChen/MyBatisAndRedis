package com.Test;

/**
 * Created by DanLongChen on 2019/6/10
 **/
public class Test1 {
    private Test1(){}
    private static class holder{
        public static Test1 danli=new Test1();
    }
    public static Test1 getInstance(){
        return holder.danli;
    }
}
class person{
    public static void play(){
        System.out.println("person");
    }
}
class man extends person{
    public static void play(){
        System.out.println("man");
    }
}
