package com.aug24.StringLearn;

public class Test1 {

    public static void main(String[] args) {

        // 1. Reverse a String

        String a = "hio";

        System.out.println("revered string---"+reverse(a));

       
        System.out.println(checkpalindrom(a,reverse(a)) ? "yes its a palindorm": "not a palindrom");
        

    }

    private static boolean checkpalindrom(String a,String b) {

        return a.equals(b);
    }

    private static String reverse(String a) {

        char[] arrayOfChar = a.toCharArray();

        StringBuilder sb = new StringBuilder();

        for (int i = arrayOfChar.length - 1; i >= 0; --i) {

            sb.append(arrayOfChar[i]);

        }

        return sb.toString();

    }

}
