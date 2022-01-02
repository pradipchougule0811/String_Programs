package com.ascentpro;

/**
 * Convert a Sting to Lower case without using String Class Methods
 */
public class StringLower
{
    public static void main(String[] args) {
        String testString = "GOOGLE";
        char [] arr = testString.toCharArray();
        int size = arr.length;
        char [] newArr = new char[size];
        int i=0;
        while(i!=size)
        {
            newArr[i] = (char) (arr[i]+32);
            i++;
        }
        System.out.println("Lower Case: ");
        for(i=0;i<size;i++)
            System.out.print(newArr[i]);
    }
}
