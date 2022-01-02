package com.ascentpro;

/**
 * Calculate string length without using build in method of String Class
 */
public class StringLen
{
    public static void main(String[] args) {
        String a = "Hello";
        a= a.concat("\0");
        char b[] = a.toCharArray();
        int i=0;
        int count=0;
        while(b[i] != '\0'){
            count ++;
            i++;
        }
        System.out.println("String Length is : "+count);
    }
}
