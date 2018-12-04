package com.wjk.java.design.singleton;

/**
 * 双检锁/双重校验锁
 * @author h
 *
 */
public class Singleton4 {  
    private volatile static Singleton4 singleton;  
    private Singleton4 (){}  
    public static Singleton4 getSingleton() {  
    if (singleton == null) {  
        synchronized (Singleton4.class) {  
        if (singleton == null) {  
            singleton = new Singleton4();  
        }  
        }  
    }  
    return singleton;  
    }  
}  