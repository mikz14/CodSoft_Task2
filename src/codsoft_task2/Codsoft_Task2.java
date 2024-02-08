/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codsoft_task2;

/**
 *
 * @author haris
 */

import java.util.Scanner;

public class Codsoft_Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Take marks obtained (out of 100) in each subject.
        System.out.print("Enter the number of subjects: ");
        int NumberOfSubjects = scanner.nextInt();

        int[] marks = new int[NumberOfSubjects];
        for (int i = 0; i < NumberOfSubjects; i++) {
            do {
                System.out.print("Enter marks obtained in subject " + (i + 1) + ": ");
                marks[i] = scanner.nextInt();

                if (marks[i] < 0 || marks[i] > 100) {
                    System.out.println("Invalid input! Marks should be between 0 and 100. Please try again.");
                }
            } while (marks[i] < 0 || marks[i] > 100);

        }

        // Calculate Total Marks
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }

        // Calculate Average Percentage
        double averagePercentage = (double) totalMarks / NumberOfSubjects;

        // Grade Calculation
        char grade = calculateGrade(averagePercentage);

        // Display Results
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);

        scanner.close();
    }

    private static char calculateGrade(double averagePercentage) {
        if (averagePercentage >= 80 && averagePercentage <= 100) {
            return 'A';
        } else if (averagePercentage >= 70 && averagePercentage < 80) {
            return 'B';
        } else if (averagePercentage >= 60 && averagePercentage < 70) {
            return 'C';
        } else if (averagePercentage >= 50 && averagePercentage < 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

}
