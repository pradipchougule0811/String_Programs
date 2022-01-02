package com.ascentpro;

import static java.lang.System.exit;

/**
 * Check given String is Palindrome or Not
 */
public class StringPalind {
    public static void main(String[] args) {
        String testString = "LEVEL";
        char arrTestString[] = testString.toCharArray();
        int size =arrTestString.length;
        char arrCpyString[]= new char[size];
        int i=0;
        while(i!=size){
            arrCpyString[size -1-i]=arrTestString[i];
            i++;
        }
        i=0;
        while(i!=size){
            if(arrCpyString[i]!=arrTestString[i])
            {
                System.out.println("Given String is not Palindrome");
                exit(0);
            }
            else
            {
                i++;
                continue;
            }

        }
        System.out.println("Given String is Palindrome");
        System.out.println("Original String is :");
        for(i=0;i<size;i++)
            System.out.print(arrTestString[i]);
        System.out.println();
        System.out.println("Reversed String is :");
        for(i=0;i<size;i++)
            System.out.print(arrCpyString[i]);
    }
}
