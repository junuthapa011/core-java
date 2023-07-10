// Task 11: Take the input of DOB as LocalDate and calculate the age.

package localdate;

import java.time.LocalDate;

public class AgeCalculator {
    private LocalDate dateOfBirth;

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
}
