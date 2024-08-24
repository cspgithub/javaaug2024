package com.aug24.StringLearn;

import java.util.HashMap;

public class Test2 {

    public static void main(String[] args) {

        // 3. Find the First Non-Repeated Character

        String a = "babcab";

        System.out.println("first char ---" + findFirstNonRepeatedChar (a));

    }

    private static Character findFirstNonRepeatedChar (String a) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : a.toCharArray()) {

            Integer count = map.get(c);
            if (count == null) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }

        }

        for (char c : a.toCharArray()) {
            if (map.get(c) ==1) {
                return c;
            }
        }

        // Return null if no non-repeated character is found
        return null;

    }

}
