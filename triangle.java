/*
MD Abir A. Choudhury
092818 - Question 1 - Nested Loops
Lab 3
Write a Java Console applications that asks the user to enter an integer 
between 1 and 20. (check by using an if statement if out of the range). 
The program should displays a triangle that contains rows of  “ *”. It displays 
1 asterisk on the first row, 2 on the second, 3 on the third row and so on...
up to the number entered by the user.  Then it goes in the reverse order by 
decreasing the number of asterisks by one per line back down to 1.
*/

import java.util.*;

class triangle{
    public static int errorCheck(int num) {
        Scanner S = new Scanner(System.in);
        if(num <= 0 || num > 20) {
            System.out.print("Please input a valid number: ");
            num = S.nextInt();
            errorCheck(num);
        }
        return num;
    }

    public static int printTriangle(int num) {
        num = errorCheck(num);

        // print top half of isoceles triangle
        for(int i = 1; i <= num; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // print bottom half of isoceles triangle 
        // which is a mirror of the top half minus one
        for(int i = num-1; i > 0; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter an integer from 1 to 20: ");
        int num = 0;
        // get user input for number between 1 and 50

        try{
            num = S.nextInt();
            printTriangle(num);
        }
        catch (InputMismatchException e) {
            num = errorCheck(num);
            printTriangle(num);
        }
    }
}