package com.Test;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by DanLongChen on 2019/6/3
 **/
public class Test implements MethodInterceptor {
    private Object target;
    public Object getInstance(Object target){
        this.target=target;
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("代理方法启动之前");
        Object object=methodProxy.invokeSuper(o,objects);
        System.out.println("代理方法执行之后");
        return object;
    }

    public static void main(String[] args) {
        mm a=new mm();
        mm proxy=(mm) new Test().getInstance(a);
        proxy.play();
        System.out.println(proxy.getClass());
    }
}
class mm{
    public void play(){
        System.out.println("play");
    }
}
