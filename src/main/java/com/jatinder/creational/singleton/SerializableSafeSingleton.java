package com.jatinder.creational.singleton;

import java.io.Serializable;

public class SerializableSafeSingleton implements Serializable {

    private static SerializableSafeSingleton singleton = null;
    private SerializableSafeSingleton(){

    }

    public static SerializableSafeSingleton getInstance() {
        if(singleton == null){
            singleton = new SerializableSafeSingleton();
        }
        return singleton;
    }

    public Object readResolve(){
        return singleton;
    }
}
