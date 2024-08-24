package com.aug24;

import java.util.Arrays;
import java.util.List;

public class test1 {
    public static void main(String[] args) {

        List<Integer> listOfNumbers = Arrays.asList(34,67,89,123);

        System.out.println("first ..."+listOfNumbers
        .stream()
        .findFirst().get());
        
    }
    
}
