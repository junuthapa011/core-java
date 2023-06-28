package School;

/**
 * @author JunuThapa
 */
public class Person {
    private String name;
    private int age;
    private String address;

    /**
     * This default constructor helps us make object with new Person()
     */
    public Person(){

    }

    /**
     * This function returns the name
     * @return the stored String value in the name variable
     */

    public String getName() {
        return name;
    }

    /**
     * This function sets the name, returns void and takes String as a parameter
     * @param name the name String value to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This function returns the Age
     * @return the stored integer value in the Age variable
     */
    public int getAge() {
        return age;
    }

    /**
     * This function sets the name, returns void and takes String as a parameter
     * @param age the age integer value to set
     */

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * This function returns the address
     * @return the stored String value in the address variable
     */
    public String getAddress() {
        return address;
    }

    /**
     * This function sets the address, returns void and takes String as a parameter
     * @param address the address String value to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

}
