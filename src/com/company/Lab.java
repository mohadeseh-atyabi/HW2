package com.company;

/**
 * The Lab class represents a laboratory in a laboratory
administration system.
 */
public class Lab {

    // array of students
    private Student[] students;

    // the average of students' grades
    private int avg;

    // the day of the week in which the lab is held
    private String day;

    // capacity of lab for students
    private int capacity;

    // number of students exist in lab
    private int currentSize;

    /**
     * Creat a new lab with a given capacity and day
     * @param cap capacity of the lab
     * @param d day of the week in which lab is held
     */
    public Lab(int cap , String d){
        capacity = cap;
        day = d;
        currentSize = 0;
        avg = 0;
        students = new Student[capacity];
    }

    /**
     * It checks if the lab still has capacity, adds new student to the lab.
     * @param std the student that enrolls for the lab
     */
    public void enrollStudent(Student std){
        if( currentSize < capacity ){
            students[currentSize] = std;
            currentSize++;
        }
        else
            System.out.println("Lab is full!!!");
    }

    /**
     *  prints the students informations and their average grade.
     */
    public void print(){
        for(int i=0 ; i<currentSize ; i++){
            students[i].print();
        }
        //System.out.println(getAvg());
    }

    /**
     * get the list of students
     * @return students list
     */
    public Student[] getStudents(){
        return students;
    }

    /**
     * set the list of students
     * @param students set list of students of the lab
     */
    public void setStudents(Student[] students){
        if( students.length > capacity ){
            System.out.println("The capacity of the lab is less than what you want!");
            System.out.printf("Enter utmost %d students\n" , capacity);
            return;
        }
        this.students = students;
        currentSize = this.students.length;
    }

    /**
     * get the average of grades
     * @return average of grades
     */
    public int getAvg(){
        return avg;
    }

    /**
     * calculates average of grades
     */
    public void calculateAvg(){
        int sum = 0;
        for(int i=0 ; i<currentSize ; i++){
            sum += students[i].getGrade();
        }
        avg = sum/currentSize ;
    }

    /**
     *
     * @return the day of the lab
     */
    public String getDay(){
        return day;
    }

    /**
     * set the day of the lab
     * @param day set the day of the lab
     */
    public void setDay(String day){
        this.day = day;
    }

    /**
     * get capacity of the lab
     * @return capacity of the lab
     */
    public int getCapacity(){
        return capacity;
    }

    /**
     *
     * @param capacity set the capacity of lab
     */
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public int getCurrentSize(){ return currentSize; }
}
