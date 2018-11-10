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
