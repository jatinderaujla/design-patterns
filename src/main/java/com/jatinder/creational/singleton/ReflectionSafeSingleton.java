package com.jatinder.creational.singleton;

public final class ReflectionSafeSingleton {
    private static ReflectionSafeSingleton singleton;

    private ReflectionSafeSingleton() {
        if (singleton != null) throw new IllegalCallerException("Multiple instances are not allowed");
    }

    public static ReflectionSafeSingleton getInstance() {
        if (singleton == null) {
            singleton = new ReflectionSafeSingleton();
        }
        return singleton;
    }

}
