/*
MD Abir A. Choudhury
092818 - Arrays with GUI
Lab 3 - Problem 3
Write a Java GUI Program that will store student ID, names and gpa in arrays, 
Then ask the user to enter a student ID, then search and display the student 
Info if it is found in the arrays, display an error otherwise
*/

import java.util.*;
import javax.swing.JOptionPane;

class arrays {  
    public static void main(String[] args) {
        // declare and initialize the arrays
        int[] studentID = new int[] {1,2,3,4,5};
        String[] names = new String[] {"Bob","Karry","Karen","Sid","Megan"};
        double[] studentGpa = new double[] {3.4,4.0,1.4,2.0,4.0};

        int userStudentID = 0;
        // ask the users to enter a student ID
        userStudentID = Integer.parseInt(JOptionPane.showInputDialog(null, "Input a student ID"));
        // conditional to see if the studentID is found in array
        for(int i = 0; i < studentID.length; i++) {
            if(userStudentID == studentID[i]) {
                JOptionPane.showMessageDialog(null, "The student info is as follows: " + names[i]);
                JOptionPane.showMessageDialog(null, "Name: " + names[i]);
                JOptionPane.showMessageDialog(null, "GPA: " + studentGpa[i]);
                JOptionPane.showMessageDialog(null, "ID: " + studentID[i]);
            }
            else if(studentID[i] == studentID.length - 1) {
                JOptionPane.showMessageDialog(null, "Error: Unable to find student ID");
            }
        }
    }
}