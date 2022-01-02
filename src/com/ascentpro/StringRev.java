
package com.ascentpro;

/**
 * Reverse a String into without using String class Methods
 */
public class StringRev {
    public static void main(String[] args) {
        String testString = "Hello";
        char[] arrTestString = testString.toCharArray();
        int size =arrTestString.length;
        char[] arrRevString = new char[size];
        int i=0;
        while(i!=size){
            arrRevString[size -1-i]=arrTestString[i];
            i++;
        }
        System.out.println("Original String is :");
        for(i=0;i<size;i++)
            System.out.print(arrTestString[i]);
        System.out.println();
        System.out.println("Reversed String is :");
        for(i=0;i<size;i++)
            System.out.print(arrRevString[i]);
    }
}
