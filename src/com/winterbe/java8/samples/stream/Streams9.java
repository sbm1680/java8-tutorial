package com.winterbe.java8.samples.stream;

import java.util.Arrays;

/**
 * @author Benjamin Winterberg
 */
public class Streams9 {

    public static void main(String[] args) {
    	//test comments
        Arrays.asList("a1", "a2", "b1", "c2", "c1")
            .stream()
            .filter(s -> s.startsWith("c"))
            .map(String::toUpperCase)
            .sorted()
            .forEach(System.out::println);//cccccccccccccccccc

        // C1
        // C2
    }
}
