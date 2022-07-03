package com.bridgelabz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestingUnit {

    UserRegistration userReg = new UserRegistration();


    @Test
    public void firstName() {
        boolean result = userReg.validateFirstName("vishal");
        assertEquals(true, result);
    }

    @Test
    public void lastName() {
        boolean result = userReg.validateLastName("juneja ");
        assertEquals(true, result);
    }

    @Test
    public void phoneNumber() {
        boolean result = userReg.validatePhoneNumber("1234567890");
        assertEquals(true, result);
    }

    @Test
    public void password() {
        boolean result = userReg.validatePassword("xxxxxxxx");
        assertEquals(true, result);
    }

    @Test
    public void email() {
        boolean result = userReg.validateEmail("yahhoo@123.com");
        assertEquals(true, result);
    }



}

