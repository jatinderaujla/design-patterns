package com.jatinder.creational.singleton;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SingletonPatternTest {
    @Test
    void singleThreadSingletonPatternTest() {
        SingleThreadSingleton instance = SingleThreadSingleton.getInstance();
        SingleThreadSingleton instance2 = SingleThreadSingleton.getInstance();
        assertEquals(instance.hashCode(), instance2.hashCode());
    }

    @Test
    void eagerLoadingSingletonPatternTest() {
        EagerLoadingThreadSafeSingleton instance = EagerLoadingThreadSafeSingleton.getInstance();
        EagerLoadingThreadSafeSingleton instance2 = EagerLoadingThreadSafeSingleton.getInstance();
        assertEquals(instance.hashCode(), instance2.hashCode());
    }

    @Test
    void lazyLoadingSingletonPatternTest() {
        LazyLoadingThreadSafeSingleton instance = LazyLoadingThreadSafeSingleton.getInstance();
        LazyLoadingThreadSafeSingleton instance2 = LazyLoadingThreadSafeSingleton.getInstance();
        assertEquals(instance.hashCode(), instance2.hashCode());
    }

    @Test
    void reflectionSafeSingletonPatternTest() throws InvocationTargetException, InstantiationException, IllegalAccessException {
        ReflectionSafeSingleton instance = ReflectionSafeSingleton.getInstance();

        ReflectionSafeSingleton instance2 = ReflectionSafeSingleton.getInstance();
        assertEquals(instance.hashCode(), instance2.hashCode());

        Constructor<?> declaredConstructor = ReflectionSafeSingleton.class.getDeclaredConstructors()[0];
        declaredConstructor.setAccessible(true);
        assertThrows(InvocationTargetException.class, declaredConstructor::newInstance);
    }
}
