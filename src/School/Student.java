package School;

public class Student extends Person {
    private int stdClass;
    private String section;
    private int rollNum;


    /**
     * This default constructor helps us make object with new Student()
     */
    public Student(){

    }

    /**
     * This function returns the student class
     * @return the stored int value in the stdClass variable
     */
    public int getStdClass() {
        return stdClass;
    }

    /**
     * This function sets the stdClass, returns void and takes integer as a parameter
     * @param stdClass the faculty String value to set
     */
    public void setStdClass(int stdClass) {
        this.stdClass = stdClass;
    }

    /**
     * This function returns the section
     * @return the stored String value in the section variable
     */
    public String getSection() {
        return section;
    }

    /**
     * This function sets the section, returns void and takes String as a parameter
     * @param section the section String value to set
     */
    public void setSection(String section) {
        this.section = section;
    }

    /**
     * This function returns the roll number
     * @return the stored integer value in the rollNum variable
     */
    public int getRollNum() {
        return rollNum;
    }

    /**
     * This function sets the rollNum, returns void and takes integer as a parameter
     * @param rollNum the rollNum integer value to set
     */
    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }
}
