package com.jatinder.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    private static final Map<String, Student> studentRegistryMap = new HashMap<>();

    public static void register(String key, Student student){
        studentRegistryMap.put(key, student);
    }

    public static Student get(String key){
       return studentRegistryMap.get(key).clone();
    }
}
