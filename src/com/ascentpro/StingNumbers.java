package com.ascentpro;

import static java.lang.System.exit;

/**
 * Find the string contains all numbers or not
 */
public class StingNumbers {
    public static void main(String[] args) {
        String testString="1234";
        char [] arr = testString.toCharArray();
        int size = arr.length;
        int i=0;
        while(i!=size)
        {
            if(arr[i]>='0' && arr[i]<='9')
            {
            }
            else
            {
                System.out.println("The given string is contains characters");
                exit(0);
            }
            i++;
        }
        System.out.println("Given String is of Numbers");
    }
}
