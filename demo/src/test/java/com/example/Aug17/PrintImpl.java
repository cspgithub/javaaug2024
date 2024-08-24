package com.example.Aug17;

public class PrintImpl {

    public static void main(String[] args) {
        // inner class way
        Iprintable obj = new Iprintable() {
            public void print() {
                System.out.println("print anonumus inner clas....");
            }
        };

        obj.print();

        System.out.println("-------------------fucntio lambda way---");

        Iprintable obj2 = () -> System.out.println("lamda way access fucntional inertface");
        obj2.print();
    }

}
