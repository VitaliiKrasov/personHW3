/**
 * Create Console Application project in Java.
 * Add class Person to the project.
 * Class Person should consists of
 * two private fields: name and birthYear (the birthday year)
 * properties for access to these fields
 * default constructor and constructor with 2 parameters
 * methods:
 * age - to calculate the age of person
 * input - to input information about person
 * output - to output information about person
 * changeName - to change the name of person
 * In the method main() create 5 objects of Person type and input information about them
 */

package com.soft;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Person p1 = new Person();
        p1.input();

        Person p2 = new Person();
        p2.setName("Eva Pupkina");
        p2.setBirtYear(1998);

        Person p3 = new Person("Bob Marley", 1945);
        Person p4 = new Person("Vombat", 1990);
        Person p5 = new Person("Kapitoshka", 1980);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(p5.toString());

    }
}
