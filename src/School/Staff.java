package School;


public class Staff extends Person {

    private String faculty;

    /**
     * This default constructor helps us make object with new Staff()
     */
    public Staff(){

    }

    /**
     * This function returns the faculty
     * @return the stored String value in the name variable
     */

    public String getFaculty() {
        return faculty;
    }

    /**
     * This function sets the faculty, returns void and takes String as a parameter
     * @param faculty the faculty String value to set
     */
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}
