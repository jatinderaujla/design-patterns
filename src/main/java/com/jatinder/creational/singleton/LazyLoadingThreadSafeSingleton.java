package com.jatinder.creational.singleton;

public final class LazyLoadingThreadSafeSingleton {
    private static LazyLoadingThreadSafeSingleton singleton = null;

    private LazyLoadingThreadSafeSingleton(){

    }

    public static LazyLoadingThreadSafeSingleton getInstance() {
        if(singleton == null){
            synchronized (LazyLoadingThreadSafeSingleton.class){
                if(singleton == null){
                    singleton = new LazyLoadingThreadSafeSingleton();
                }
            }
        }
        return singleton;
    }
}
