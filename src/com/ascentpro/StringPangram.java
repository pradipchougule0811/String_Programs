package com.ascentpro;

import static java.lang.System.exit;

/**
 * Check the string is Pangram or not
 * This program works for only the String in Upper Case
 */
public class StringPangram {
    public static void main(String[] args) {
        String testString ="THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        //String testString="I AM AT HOME"; //Not Pangram String
        String x = testString.replace(" ","");
        char[] arr = x.toCharArray();
        int size = arr.length;
        int [] check = new int[26];
        int i=0,k=0;
        for(k=0;k<26;k++) check[k]=0;
        while(i!=size)
        {
            int index = arr[i] - 65;
            check[index]=1;
            i++;
        }
        for (int j = 0; j < 26; j++)
        {
            if(check[j]==0) {
                System.out.println("The Given String is not a Pangram");
                exit(0);
            }
        }
        System.out.println("The Given String is Pangram");

    }
}
