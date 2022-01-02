package com.ascentpro;

/**
 * Count the number of Vowels, consonant and Special Symbols in given string
 */
public class StringVowels {
    public static void main(String[] args) {
        String testString="Good  Morning";
        char [] arr = testString.toCharArray();
        int size = arr.length;
        int i=0,vowels=0,consonant=0,spl=0;
        while(i!=size){
            if((arr[i]>='A' && arr[i]<='Z') || (arr[i]>='a' && arr[i]<='z') )
            {
                if(arr[i]=='A' || arr[i]=='a' || arr[i]=='E' ||arr[i]=='e' || arr[i]=='I' || arr[i]=='i' || arr[i]=='O' ||arr[i]=='o' || arr[i]=='U' || arr[i]=='u' )
                {
                    vowels++;
                }
                else
                {
                    consonant++;
                }
            }
            else
            {
                spl++;
            }
            i++;
        }
        System.out.println("Original String is: "+testString);
        System.out.println("String Length is: "+size);
        System.out.println("Total Vowels are: "+vowels);
        System.out.println("Total Consonants are: "+consonant);
        System.out.println("Total special symbols are: "+spl);
    }
}
