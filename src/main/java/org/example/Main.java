package org.example;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            Class<?>  stringClass = Class.forName("java.lang.String");
            Arrays.stream(stringClass.getClass().getDeclaredMethods()).forEach(System.out::println);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}