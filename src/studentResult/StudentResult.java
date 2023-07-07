package studentResult;

import java.util.Scanner;

public class StudentResult {

    // Declaring states
    private String name;
    private float scienceMarks;
    private float mathsMarks;
    private float englishMarks;
    private float historyMarks;
    private float healthMarks;

    // Constructor
    public StudentResult() {
    }

    // Setters & Getters
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setScienceMarks(float scienceMarks) {
        this.scienceMarks = scienceMarks;
    }

    public float getScienceMarks() {
        return scienceMarks;
    }

    public void setMathsMarks(float mathsMarks) {
        this.mathsMarks = mathsMarks;
    }

    public float getMathsMarks() {
        return mathsMarks;
    }

    public void setEnglishMarks(float englishMarks) {
        this.englishMarks = englishMarks;
    }

    public float getEnglishMarks() {
        return englishMarks;
    }

    public void setHistoryMarks(float historyMarks) {
        this.historyMarks = historyMarks;
    }

    public float getHistoryMarks() {
        return historyMarks;
    }

    public void setHealthMarks(float healthMarks) {
        this.healthMarks = healthMarks;
    }

    public float getHealthMarks() {
        return healthMarks;
    }


}
