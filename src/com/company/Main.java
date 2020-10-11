package com.company;

public class Main {

    public static void main(String[] args) {
        Student std1 = new Student("Ehsan","Edalat", "9031066");
        std1.setGrade(15);
        Student std2 = new Student("Seyed", "Ahmadpanah", "9031806");
        std2.setGrade(11);
        Student std3 = new Student("Ahmad", "Asadi", "9031054");
        std3.setGrade(7);
        Student std4 = new Student("Ali" , "Atyabi" , "9726004");
        Student[] std ={ std1 , std2 , std3 };

        Lab laboratory = new Lab(4,"Saturday");
        Lab laboratory2 = new Lab(5,"Sunday");


        /*std1.print();
        std2.print();

        std3.print();
        std3.setLastName("HamidReza");
        System.out.print(std3.getFirstName());*/

        laboratory.setStudents(std);
        /*laboratory.calculateAvg();
        laboratory.print();
        System.out.println(laboratory.getAvg());*/

        AcademicDepartment ac1 = new AcademicDepartment("AP" , 2);
        ac1.addLaboratories(laboratory);
        ac1.addLaboratories(laboratory2);
        //ac1.printListOfLabs();

        Faculty computer = new Faculty("computer" , 3);
        computer.addDepartments(ac1);
        computer.printLaboratories("AP");
        computer.printStudentsOfLab("AP" , 1);
    }
}
