package com.bridgelabz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestingUnit {

    UserRegistration userReg = new UserRegistration();

    public String[] validemail = { "abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com",
            "abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com" };

    public String[] unvalidemail = { "abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com",
            "..abc@abc.com", ".abc()@gmail.com", "abc@%.com", "abc.@gmail.com", "abc@abc@gmail.com", "abc@gmail.com.1a",
            "abc@gmail.com.aa.au" };


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

    @Test
    public void validEmailTest() {
        for (String sample : validemail) {

            String checker1 = sample;

            Boolean email = userReg.validateEmail(checker1);
            assertEquals(true, email);
        }

    }


    @Test
    public void unvalidEmailTest() {

        for (String sample : unvalidemail) {
            String checker1 = sample;

            Boolean email = userReg.validateEmail(checker1);
            assertEquals(false, email);
        }
    }




}

