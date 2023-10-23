package com.jatinder.creational.singleton;

import java.io.Serializable;

public final class AllSafeSingleton implements Serializable {
    private static AllSafeSingleton singleton = null;

    private AllSafeSingleton(){
        if(singleton != null) throw new IllegalCallerException();
    }

    public static AllSafeSingleton getInstance() {
        if(singleton == null){
            synchronized (AllSafeSingleton.class){
                if (singleton == null) {
                    singleton = new AllSafeSingleton();
                }
            }
        }
        return singleton;
    }

    public Object readResolve(){
        return singleton;
    }
}
