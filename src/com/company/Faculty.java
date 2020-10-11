package com.company;

public class Faculty {
    //name of the faculty
    private String name;

    //groups of academic departments in this faculty
    private AcademicDepartment[] acDepartments;

    //capacity of academic departments
    private int capOfDepartments;

    //number of academic departmentso
    private int numOfDepartments;

    /**
     * creat a new faculty with given properties
     * @param name name of faculty
     * @param capOfDepartments capacity of faculty for academic departments
     */
    public Faculty(String name , int capOfDepartments){
        this.name = name;
        this.capOfDepartments = capOfDepartments;
        numOfDepartments = 0;
        acDepartments = new AcademicDepartment[capOfDepartments];
    }

    /**
     * get the name of faculty
     * @return name of faculty
     */
    public String getName(){ return name; }

    /**
     * set group of acdemin departments
     * @param  acDepartments departments of faculty
     */
    public void setDepartments(AcademicDepartment[] acDepartments){
        if(acDepartments.length > capOfDepartments ){
            System.out.println("The number of laboratories is less than what you want!");
            System.out.printf("Enter utmost %d laboratories\n" , capOfDepartments);
            return;
        }
        this.acDepartments = acDepartments;
        numOfDepartments = acDepartments.length;
    }

    /**
     * adds one department if there is space
     * @param dep department which wants to be added
     */
    public void addDepartments(AcademicDepartment dep){
        if( numOfDepartments < capOfDepartments ){
            acDepartments[numOfDepartments] = dep;
            numOfDepartments++;
        }
        else
            System.out.println("Lab is full!!!");
    }

    /**
     * set the capacity of departments
     * @param cap capacity of departments
     */
    public void setCapOfDeps(int cap){ capOfDepartments = cap; }

    /**
     * get capacity of departments
     * @return capacity of departments
     */
    public int getCapOfDeps(){ return capOfDepartments; }

    /**
     * prints name of the departments
     */
    public void printDepartments(){
        if(numOfDepartments == 0){
            System.out.println("There is no department in this faculty.");
            return;
        }
        System.out.println(getName());
        for(int i=0 ; i<numOfDepartments ; i++){
            System.out.printf("Academic department:%s  \n" , acDepartments[i].getName());
        }
    }

    /**
     * prints information of laboratories of given department
     * @param name name of department we want to know it's laboratories
     */
    public void printLaboratories(String name){
        for(int i=0 ; i<numOfDepartments ; i++){
            if(acDepartments[i].getName() == name){
                acDepartments[i].printListOfLabs();
                return;
            }
        }
        System.out.println("There is no department with this name!");
    }

    /**
     * prints list of students in the laboratory which index is received
     * @param depName name of department that includes asked library
     * @param labIndex index of the library which students are needed
     */
    public void printStudentsOfLab(String depName , int labIndex){
        for(int i=0 ; i<numOfDepartments ; i++){
            if(acDepartments[i].getName() == depName){
                System.out.println("The students are:");
                acDepartments[i].returnLab(labIndex-1).print();
                return;
            }
        }
        System.out.println("Inputs are not valid!");
    }
}
