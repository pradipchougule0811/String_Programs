package com.ascentpro;

/**
 * Converting first character of each word to capital
 */
public class StringCapitalize {
    public static void main(String[] args) {
        String testString = "good morning world";
        char[] arr = testString.toCharArray();
        int size = arr.length;
        char[] newArr = new char[size];
        int i=1;
        newArr[0]=(char)(arr[0]-32);
        while(i!=size)
        {
            if(arr[i] ==' '){
                newArr[i]=' ';
                i++;
                newArr[i] = (char) (arr[i] - 32);
                i++;
            }
            else {
                newArr[i] = arr[i];
                i++;
            }
        }
        System.out.println();
        for (int j = 0; j < size; j++) {
            System.out.print(newArr[j]);
        }
    }
}
