package com.sac;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {


    @Override
    public int compare(Student student1, Student student2) {
        //return ((Integer)student1.getAge()).compareTo(student2.getAge());
        return student1.compareTo(student2);
    }
}
