package com.ascentpro;

/**
 * Copy one String into another without using String class Methods
 */
public class StringCopy {
    public static void main(String[] args) {
        String testString = "Hello";
        char arrTestString[] = testString.toCharArray();
        int size =arrTestString.length;
        char arrCpyString[]= new char[size];
        int i=0;
        while(i!=size){
            arrCpyString[i]=arrTestString[i];
            i++;
        }
        System.out.println("Original String is :");
        for(i=0;i<size;i++)
            System.out.print(arrTestString[i]);
        System.out.println();
        System.out.println("Copied String is :");
        for(i=0;i<size;i++)
            System.out.print(arrCpyString[i]);
    }
}
