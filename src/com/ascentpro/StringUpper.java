package com.ascentpro;
/**
 * Convert a Sting to Upper case without using String Class Methods
 */
public class StringUpper
{
    public static void main(String[] args) {
        String testString = "google";
        char [] arr = testString.toCharArray();
        int size = arr.length;
        char [] newArr = new char[size];
        int i=0;
        while(i!=size)
        {
            newArr[i] = (char) (arr[i] - 32);
            i++;
        }
        System.out.println("Upper Case: ");
        for(i=0;i<size;i++)
            System.out.print(newArr[i]);
    }
}
