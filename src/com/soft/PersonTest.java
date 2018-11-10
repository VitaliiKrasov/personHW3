package com.soft;

import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person p = new Person("", 2000);
    int currentYear = Calendar.getInstance().get(Calendar.YEAR);
    int actual = p.age();
    int expected = currentYear - 2000;

    @Test
    void age() {
        assertEquals(expected, actual);
    }
}