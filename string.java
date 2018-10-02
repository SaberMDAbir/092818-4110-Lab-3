/*
MD Abir A. Choudhury
092818 - Strings
Lab 3 - Problem 2
Write a full Java program that asks the user to type in 5 words, prompting the 
user for each word with a number. The program then reports the longest and the 
shortest word the user typed in. 
*/

import java.util.*;
import java.lang.String;

class string {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        String[] stringArray = new String[5];

        // user enters 5 words
        for(int i = 0; i < 5; i++) {
            int temp = i + 1;
            System.out.println("Input a word for the word #" + temp);
            stringArray[i] = S.next();
        }

        // find the longest word
        int indexForLong = 0;
        int elementLength = stringArray[0].length();
        for(int i = 1; i < 5; i++) {
            if(stringArray[i].length() > elementLength) {
                indexForLong = i;
                elementLength = stringArray[i].length();
            }
        }
        System.out.println("The longest word you entered is: " + stringArray[indexForLong]);

        // find the shortest word
        int indexForShort = 0;
        elementLength = stringArray[0].length();
        for(int i = 1; i < 5; i++) {
            if(stringArray[i].length() < elementLength) {
                indexForShort = i;
                elementLength = stringArray[i].length();
            }
        }
        System.out.println("The longest word you entered is: " + stringArray[indexForShort]);
    }
}