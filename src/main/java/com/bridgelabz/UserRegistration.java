package com.bridgelabz;

import java.util.ArrayList;
import java.util.regex.Pattern;




    public class UserRegistration {

        private static final String namePattern = "^[A-Z]{1}[a-z]{2,}$";
        private static final String emailPattern = "^[a-z0-9]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+(.[a-z]{2,3}){0,1}$";
        private static final String phonePattern = "^[0-9]{2}[ ]?[6-9]{1}[0-9]{9}$";
        private static final String passwordPattern = "^(?=.{8,}$)(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*\\W).*$";


        public boolean validateFirstName(String fname){
            Pattern pattern = Pattern.compile(namePattern);

            return pattern.matches(namePattern,fname);

        }


        public boolean validateLastName(String lName) {
            Pattern pattern = Pattern.compile(namePattern);

            return pattern.matches(namePattern,lName);

        }

        public boolean validateEmail(String email) {
            Pattern pattern = Pattern.compile(emailPattern);
            return pattern.matches(emailPattern,email);
        }


        public boolean validatePhoneNumber(String phNumber) {

            Pattern pattern = Pattern.compile(phonePattern);
            return pattern.matches(phonePattern,phNumber);
        }


        public boolean validatePassword(String password) {
            Pattern pattern = Pattern.compile(passwordPattern);
            return pattern.matches(passwordPattern,password);

        }
    }