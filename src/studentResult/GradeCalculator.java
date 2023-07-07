package studentResult;

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        StudentResult student = new StudentResult();
        Scanner scan = new Scanner(System.in);

        // Asking for user input
        System.out.print("Enter your Name: ");
        String name = scan.nextLine();
        student.setName(name);

        System.out.print("Enter Science marks: ");
        float scienceMarks = scan.nextFloat();
        student.setScienceMarks(scienceMarks);

        System.out.print("Enter Maths marks: ");
        float mathsMarks = scan.nextFloat();
        student.setMathsMarks(mathsMarks);

        System.out.print("Enter English marks: ");
        float englishMarks = scan.nextFloat();
        student.setEnglishMarks(englishMarks);

        System.out.print("Enter History marks: ");
        float historyMarks = scan.nextFloat();
        student.setHistoryMarks(historyMarks);

        System.out.print("Enter Health marks: ");
        float healthMarks = scan.nextFloat();
        student.setHealthMarks(healthMarks);

        // Calculating the percentage of all the user input marks
        float total = (student.getScienceMarks() + student.getMathsMarks() + student.getEnglishMarks() + student.getHistoryMarks() + student.getHealthMarks());
        float percentage = (total/ 500) * 100;

        System.out.println(String.format(("%s got a total of %f"),student.getName(), percentage));
        String grade= "";

        // Condition to check Grades letter
        if (percentage >= 90 && percentage < 101) {
            grade = "A";
        }
        else if (percentage >= 80.0 && percentage < 90.0) {
            grade = "B";
        }
        else if (percentage >= 70.0 && percentage < 80.0) {
            grade = "C";
        }
        else if (percentage >= 60.0 && percentage < 70.0) {
            grade = "D";
        }
        else if (percentage < 60) {
            grade = "F";
        }
        else {
            grade = "Invalid";
        }

// Switch case statement to print messages for students with different grades
        switch(grade) {
            case "A":
                System.out.println("Congratulations!!! You have aced the exam. Keep it up!!!");
                break;
            case "B":
                System.out.println("Congratulations!!! You passed with grade B. Very good!!!");
                break;
            case "C":
                System.out.println("Congratulation!!! You passed with grade C. Good job!!! Continue working hard!!!");
                break;
            case "D":
                System.out.println("Congratulations!!! You passed with grade D. Keep trying harder!!!");
                break;
            case "F":
                System.out.println("Sorry!!! You failed. Keep trying!!!");
                break;
            default:
                System.out.println("Invalid grade.");

        }








    }
}
