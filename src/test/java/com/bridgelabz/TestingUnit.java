package com.bridgelabz;

import org.junit.jupiter.api.Test;
public class TestingUnit {


    @Test
    public void firstNames() {

        UserRegistration userReg = new UserRegistration("vishal");

        try {
            boolean result = userReg.validateFirstName();
        } catch (UserRegistrationException e) {

            System.out.println(e);
        }

    }


    @Test
    public void lastName() {
        UserRegistration userReg = new UserRegistration("juneja");
        try {
            boolean result = userReg.validateLastName();
        } catch (UserRegistrationException e) {

            // e.printStackTrace();

            System.out.println(e);
        }
    }


    @Test
    public void phoneNumber() {
        UserRegistration userReg = new UserRegistration("1234567890");
        try {
            boolean result = userReg.validatePhoneNumber();
        } catch (UserRegistrationException e) {

            // e.printStackTrace();

            System.out.println(e);
        }
    }


    @Test
    public void password() {
        UserRegistration userReg = new UserRegistration("Vish@123");
        try {
            boolean result = userReg.validatePassword();
        } catch (UserRegistrationException e) {

            // e.printStackTrace();

            System.out.println(e);
        }
    }


    @Test
    public void email() {
        UserRegistration userReg = new UserRegistration("vishaljuneja198l@gmail.com");
        try {
            boolean result = userReg.validateEmail();
        } catch (UserRegistrationException e) {

            // e.printStackTrace();

            System.out.println(e);
        }
    }

}