package com.hezron;

public class ReverseString {
    public static String reverse(String str){
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        String original = "Hello World";
        System.out.println("Original: " + original);

        System.out.println("Reverse string: " + reverse(original));
    }
}
