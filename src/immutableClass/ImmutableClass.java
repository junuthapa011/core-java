package immutableClass;

import java.time.LocalDate;
import java.time.LocalTime;

final class ImmutableClass {

    //initializing states or variables
    private final long id;
    private final String name;
    private final int rollNum;

    //parameterized constructor
    public ImmutableClass(long id, String name, int rollNum) {
        this.id = id;
        this.name = name;
        this.rollNum = rollNum;
    }

    //Getter method

    public long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getRollNum(){
        return rollNum;
    }

    @Override
    public String toString() {
        return "ImmutableClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rollNum=" + rollNum +
                '}';
    }
}

