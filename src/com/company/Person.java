package com.company;

import java.util.Objects;

public class Person {
    private String firstName, lastName, occupation;
    int age;

    public Person(String firtName,String lastName,int age){
        this.firstName = firtName;
        this.lastName = lastName;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() { return firstName; }

    public String getLastName() { return lastName; }

    public String getOccupation() {
        return occupation;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(occupation, person.occupation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, occupation, age);
    }

    public void print(){
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(age);
    }

}


