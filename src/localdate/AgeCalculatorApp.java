// Task 11: Take the input of DOB as LocalDate and calculate the age.

package localdate;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AgeCalculatorApp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        AgeCalculator DOB = new AgeCalculator();

        System.out.print("Enter date of birth(yyyy-mm-dd): ");
        String birthdate = scan.next();

        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DOB.setDateOfBirth(LocalDate.parse(birthdate, formatter));

        LocalDate currentday = LocalDate.now();

        Period age = Period.between(DOB.getDateOfBirth(),currentday);
        System.out.println(age.getYears());





    }
}
