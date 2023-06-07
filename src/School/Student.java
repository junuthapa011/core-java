package School;

public class Student extends Person {
    private int stdClass;
    private String section;
    private int rollNum;


    public int getStdClass() {
        return stdClass;
    }

    public void setStdClass(int stdClass) {
        this.stdClass = stdClass;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }
}
