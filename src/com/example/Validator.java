package com.example;

// package-private helper class
class Validator {
    private static boolean isValid(String s){
        return s != null && !s.isBlank();
    }
}
