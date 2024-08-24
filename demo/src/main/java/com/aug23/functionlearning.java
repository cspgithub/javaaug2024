package com.aug23;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class functionlearning {

    public static void main(String[] args) {

        // Transform a String to an Integer:

        Function<String, Integer> obj1 = (str) -> {

            return str.length();

        };

        System.out.println(obj1.apply("yu"));

        // Square a Number:

        Function<Integer, Integer> obj2 = (num) -> {

            return num * num;

        };
        System.out.println(obj2.apply(2));

        // compose

        Function<Integer, Integer> multiplyby2 = (a) -> {
            return a * 2;
        };// 4

        Function<Integer, Integer> add3 = (b) -> {
            return b + 3;
        };// 4+3

        Function<Integer, Integer> combined = multiplyby2.andThen(add3);

        System.out.println(combined.apply(2));

        List<Integer> listOfInt = Arrays.asList(33, 4, 5, 8);

        // multipli each number and resturn new list--function
        System.out.println("final result:  " + listOfInt.stream()
                .map(multiplyby2)
                .collect(Collectors.toList()));

        Comparator<Integer> comapreTwoNumbers =   (a,b)->{return a.compareTo(b);};
        Consumer<Integer> consumerNum = (num)->System.out.println("smallest............"+num);
        listOfInt
        .stream()
        .min(comapreTwoNumbers)
        .ifPresent(consumerNum);

    }

}
