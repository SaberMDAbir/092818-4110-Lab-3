/*
MD Abir A. Choudhury
092818 - Bubble Sort Array
Lab 3 - Problem 4
Write a Java Program that ask the user to enter the size of an integer array 
then all the elements of the array, then apply the Bubble sort algorithm, 
the Program should display the array before and after the sort.
*/

import java.util.*;

class bubbleSort {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        
        // Get user input for the size of the array
        int sizeOfArray = 0;
        System.out.print("What is the size of the array going to be: ");
        sizeOfArray = S.nextInt();
        
        // declare the array of size of user input
        int[] bubbleArray = new int[sizeOfArray];
        // run through the array for user input
        for(int i = 0; i < sizeOfArray; i++) {
            System.out.println("Enter an integer number: ");
            bubbleArray[i] = S.nextInt();
        }
        // display the array by running through it
        for(int i = 0; i < sizeOfArray; i++) {
            if(i == sizeOfArray - 1) {
                System.out.print(bubbleArray[i] + " ");
            }
            else{
                System.out.print(bubbleArray[i] + ", ");
            }
        }
        // run through the bubble sort algorithm
        int temp = 0;
        for (int i = 0; i < sizeOfArray; i++) {
            for (int j = 1; j < (sizeOfArray - i); j++) {
                if (bubbleArray[j - 1] > bubbleArray[j]) {
                    temp = bubbleArray[j - 1];
                    bubbleArray[j - 1] = bubbleArray[j];
                    bubbleArray[j] = temp;
                }
            }
        }
        System.out.println();
        // display the new sorted algorithm
        for(int i = 0; i < sizeOfArray; i++) {
            if(i == sizeOfArray - 1) {
                System.out.print(bubbleArray[i] + " ");
            }
            else{
                System.out.print(bubbleArray[i] + ", ");
            }
        }
        System.out.println();
    } 
}