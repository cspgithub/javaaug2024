package com.aug23;

public class test1 {

    public static void main(String[] args) {

        // 1. conventional way
        IStringToInteger obj = new hello();
        Integer b = obj.apply("123");
        System.out.println(b);

        // 2. anonymus way

        IStringToInteger obj1 = new IStringToInteger() {

            @Override
            public Integer apply(String s) {

                return Integer.valueOf(s);
            }

        };

        System.out.println("anaonumus way........." + obj1.apply("678"));

        // 3. lambda way

        IStringToInteger obj2 = (s) -> {
            return Integer.valueOf(s);
        };

        Integer c = obj2.apply("890");
        System.out.println("lambda way............" + c);

    }

    static class hello implements IStringToInteger {
        @Override
        public Integer apply(String a) {

            return Integer.valueOf(a);
        }

    }

}
