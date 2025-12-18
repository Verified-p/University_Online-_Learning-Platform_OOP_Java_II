package main;

import model.*;
import interfaces.Payable;
import exceptions.GradeNotFoundException;
import io.FileProcessor;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== UNIVERSITY PLATFORM TEST ===");

        // Dynamic Binding
        Course course = new OnlineCourse("COMP305", "Object Oriented Programming Java II", "Moodle");
        course.showDetails();

        // Payable Interface
        Payable fullTime = new FullTimeLecturer("Dr. John");
        Payable partTime = new PartTimeLecturer("Ms. Jane", 20, 1000);

        System.out.println("Full-time Salary: " + fullTime.calculatePayment());
        System.out.println("Part-time Salary: " + partTime.calculatePayment());

        // HashMap + Custom Exception
        HashMap<String, Integer> grades = new HashMap<>();
        grades.put("Andrew", 78);
        grades.put("Brian", 65);
        grades.put("Cynthia", 82);

        try {
            if (!grades.containsKey("David")) {
                throw new GradeNotFoundException("Grade for David not found!");
            }
        } catch (GradeNotFoundException e) {
            System.out.println(e.getMessage());
        }

        // File I/O
        FileProcessor.processFile();

        System.out.println("=== PROGRAM EXECUTED SUCCESSFULLY ===");
    }
}
