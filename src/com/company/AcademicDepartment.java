package com.company;

/**
 * The AcademicDepartment class represents a department in a department
 administration system.
 */
public class AcademicDepartment {
    //name of the department
    private String name;

    //groups of laboratories of this departmant
    private Lab[] laboratories;

    //keeps capacity of laboratories
    private int capOfLabs;

    //number of available laboratories in this department
    private int numOfLabs;

    /**
     * creat a new academic department with given name and number of laboratories
     * @param name name of academic department
     * @param capOfLabs number of laboratories of the department
     */
    public AcademicDepartment(String name , int capOfLabs){
        this.name = name;
        this.capOfLabs = capOfLabs;
        numOfLabs = 0;
        laboratories = new Lab[capOfLabs];
    }

    /**
     * get the name of department
     * @return name of department
     */
    public String getName(){ return name; }

    /**
     * set group of laboratories
     * @param labs array of labs
     */
    public void setLaboratories(Lab[] labs){
        if(labs.length > capOfLabs ){
            System.out.println("The number of laboratories is less than what you want!");
            System.out.printf("Enter utmost %d laboratories\n" , capOfLabs);
            return;
        }
        laboratories = labs;
        numOfLabs = labs.length;
    }

    /**
     * adds one laboratory if there is space
     * @param lab laboratory which wants to be added
     */
    public void addLaboratories(Lab lab){
        if( numOfLabs < capOfLabs ){
            laboratories[numOfLabs] = lab;
            numOfLabs++;
        }
        else
            System.out.println("Lab is full!!!");
    }

    /**
     * set the capacity of laboratories
     * @param cap capacity of laboratories
     */
    public void setCapOfLabs(int cap){ capOfLabs = cap; }

    /**
     * get capacity of laboratories
     * @return capacity of laboratories
     */
    public int getCapOfLabs(){ return capOfLabs; }

    /**
     * prints information about the laboratories
     */
    public void printListOfLabs(){
        if(numOfLabs == 0){
            System.out.println("There is no laboratory in this department.");
            return;
        }
        System.out.printf("This department is:%s\n" , getName());
        for(int i=0 ; i<numOfLabs ; i++){
            System.out.printf("Lab%d:  Capacity:%d  Day:%s\n" , i+1 , laboratories[i].getCapacity()
            , laboratories[i].getDay());
        }
    }

    /**
     * returns the laboratories which index is received
     * @param index index of laboratory to return
     * @return laboratory
     */
    public Lab returnLab(int index){ return laboratories[index]; }

    public int returnLabCurrentSize(int index){ return laboratories[index].getCurrentSize(); }
}
