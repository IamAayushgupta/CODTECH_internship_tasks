import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {

    static class Subject {
        String name;
        double grade;

        Subject(String name, double grade) {
            this.name = name;
            this.grade = grade;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Subject> subjects = new ArrayList<>();

        System.out.println("Enter grades for different subjects (type 'done' when finished):");
        while (true) {
            System.out.print("Enter subject name (or 'done' to finish): ");
            String subjectName = scanner.next();
            if (subjectName.equalsIgnoreCase("done")) {
                break;
            }

            System.out.print("Enter grade for " + subjectName + ": ");
            double grade = scanner.nextDouble();

            subjects.add(new Subject(subjectName, grade));
        }

        double total = 0;
        for (Subject subject : subjects) {
            total += subject.grade;
        }
        double average = total / subjects.size();

        String letterGrade;
        if (average >= 90) {
            letterGrade = "A";
        } else if (average >= 80) {
            letterGrade = "B";
        } else if (average >= 70) {
            letterGrade = "C";
        } else if (average >= 60) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }

        // Calculate GPA (on a 4.0 scale)
        double gpa;
        if (average >= 90) {
            gpa = 4.0;
        } else if (average >= 80) {
            gpa = 3.0;
        } else if (average >= 70) {
            gpa = 2.0;
        } else if (average >= 60) {
            gpa = 1.0;
        } else {
            gpa = 0.0;
        }

        System.out.println("\n--- Grade Summary ---");
        for (Subject subject : subjects) {
            System.out.println(subject.name + ": " + subject.grade);
        }
        System.out.println("Average Grade: " + average);
        System.out.println("Letter Grade: " + letterGrade);
        System.out.println("GPA: " + gpa);

        scanner.close();
    }
}

