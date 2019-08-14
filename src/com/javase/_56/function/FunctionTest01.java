package com.javase._56.function;

import java.util.function.Function;

public class FunctionTest01 {

    // java.util.function.Function<T, R>
    // R apply(T t);

    public static void main(String[] args) {

        Function<String, Integer> lengthFunciton = e -> e.length();
        Function<String, Integer> lengthFunctionV2 = (String str) -> str.length();

        Integer result1 = lengthFunciton.apply("java");
        Integer result2 = lengthFunciton.apply("functional");
        Integer result3 = lengthFunciton.apply("integer");

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        // java.util.stream.Stream
        // <R> Stream<R> map(Function<? super T, ? extends R> mapper);
    }
}