package com.java8.behaviour;

public class Runner {



    static void perform(IAnimal animal){
        animal.run();
    }

    public static void main(String[] args) {

      perform(new Dog());

    }
}
