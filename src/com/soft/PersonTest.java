package com.soft;

import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {
//  Given
    Person p = new Person("Liolik", 2000);
    int currentYear = Calendar.getInstance().get(Calendar.YEAR);
//  When
    int actual = p.age();
    int expected = currentYear - 2000;
//  Then
    @Test
    void age() {
        assertEquals(expected, actual);
    }
}