package com.sac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableAndComparatorMain {

    public static void main(String[] args) {
        List<Student> arList = new ArrayList<>();

        arList.add(new Student(101,"Vijay",23));
        arList.add(new Student(106,"Ajay",27));
        arList.add(new Student(105,"Jai",21));

        Collections.sort(arList);
        arList.forEach( a-> System.out.println("Name: " + a.getName() + "\t" + "Age: " + a.getAge() + "\t" + "Roll No: " + a.getRollNo()));
        /*for (Student student: arList) {
            System.out.println("Name: " + student.getName() + "\t" + "Age: " + student.getAge() + "\t" + "Roll No: " + student.getRollNo());
        }*/

        Collections.sort(arList,new NameComparator());
        System.out.println("********** Using Name Comparator **********");
        /*for (Student student: arList) {
            System.out.println("Name: " + student.getName() + "\t" + "Age: " + student.getAge() + "\t" + "Roll No: " + student.getRollNo());
        }*/
        arList.forEach( a-> System.out.println("Name: " + a.getName() + "\t" + "Age: " + a.getAge() + "\t" + "Roll No: " + a.getRollNo()));

        Collections.sort(arList,new AgeComparator());
        System.out.println("********** Using Age Comparator **********");
        /*for (Student student: arList) {
            System.out.println("Name: " + student.getName() + "\t" + "Age: " + student.getAge() + "\t" + "Roll No: " + student.getRollNo());
        }*/
        arList.forEach( a-> System.out.println("Name: " + a.getName() + "\t" + "Age: " + a.getAge() + "\t" + "Roll No: " + a.getRollNo()));
    }



}