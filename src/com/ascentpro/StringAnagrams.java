package com.ascentpro;

import java.util.Arrays;

/**
 * Find the two strings are anagrams or Not
 */
public class StringAnagrams {
    public static void main(String[] args) {
        String testString1="SILENT";
        String testString2="LISTEN";
        char[] x = testString1.toCharArray();
        char[] y = testString2.toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        boolean a = Arrays.equals(x,y);
        if(a)
        {
            System.out.println("Given Strings are Anagrams");
        }
        else
        {
            System.out.println("Given Strings are not anagrams");
        }

    }
}
