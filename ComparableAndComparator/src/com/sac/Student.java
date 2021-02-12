package com.sac;

public class Student implements Comparable<Student> {

    private int rollNo;
    private String name;
    private int age;

    public Student(int rollNo,String name,int age){
        this.rollNo =rollNo;
        this.name=name;
        this.age=age;
    }


    @Override
    public int compareTo(Student o) {

        if (this.age == o.age){
            return 0;
        } if (this.age > o.age) {
            return 1;
        }
        return -1;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
