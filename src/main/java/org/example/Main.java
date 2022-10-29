package org.example;

import Lesson5.Dog;

public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        System.out.println("Dog name: " + dog1.getName() + " dog age:" + dog1.getAge() + " dog color: " + dog1.getColor() + " dog height: " + dog1.getHeight());

        dog1.setName("obik");

        System.out.println("Dog name: " + dog1.getName() + " dog age:" + dog1.getAge() + " dog color: " + dog1.getColor() + " dog height: " + dog1.getHeight());

        Dog dog2 = new Dog("sharik", 5);

        System.out.println("Dog name: " + dog2.getName() + " dog age:" + dog2.getAge() + " dog color: " + dog2.getColor() + " dog height: " + dog2.getHeight());

        Dog dog3 = new Dog("laska", 2, "white", 75);

        System.out.println("Dog name: " + dog3.getName() + " dog age:" + dog3.getAge() + " dog color: " + dog3.getColor() + " dog height: " + dog3.getHeight());

        System.out.println(dog1.toString());
    }
}