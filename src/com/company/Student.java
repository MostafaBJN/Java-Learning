package com.company;

public class Student extends Person {
    private int stdId;

    public Student(String firtName, String lastName, int age, int stdId) {
        super(firtName, lastName, age);//calling constructor of it parent
        this.stdId = stdId;

    }

    public int getStdId() {
        return stdId;
    }

    public void setStdId(int stdId) {
        this.stdId = stdId;
    }

    @Override
    public void print(){
        super.print();
        System.out.println(stdId);
    }

}
