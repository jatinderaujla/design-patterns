package com.jatinder.creational.singleton;

public final class EagerLoadingThreadSafeSingleton {
    private static final EagerLoadingThreadSafeSingleton singleton = new EagerLoadingThreadSafeSingleton();

    private EagerLoadingThreadSafeSingleton(){

    }
    public static EagerLoadingThreadSafeSingleton getInstance() {
        return singleton;
    }
}
