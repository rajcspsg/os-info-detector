package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(System.getProperty("os.name"));
        //System.out.println("Hello world!");
        System.out.println();
        System.getProperties().entrySet().stream().filter(e -> e.getKey().toString().startsWith("os")).forEach(System.out::println);
    }
}