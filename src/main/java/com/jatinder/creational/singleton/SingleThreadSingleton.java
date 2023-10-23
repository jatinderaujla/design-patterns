package com.jatinder.creational.singleton;

public final class SingleThreadSingleton {
    private static SingleThreadSingleton singleton = null;

    private SingleThreadSingleton(){

    }

    public static SingleThreadSingleton getInstance(){
        if(singleton == null){
            singleton = new SingleThreadSingleton();
        }
        return singleton;
    }
}
