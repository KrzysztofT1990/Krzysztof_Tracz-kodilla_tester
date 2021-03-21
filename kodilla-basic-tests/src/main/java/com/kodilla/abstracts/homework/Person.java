package com.kodilla.abstracts.homework;

public class Person {
    String firstName;
    int age;
    Job job;


    public Person(String firstName, int age, Job job){
        this.firstName=firstName;
        this.age = age;
        this.job = job;
    }

    public void process2(Job job) {
        System.out.println("Obowiązkami osoby na tym stanowwisku to: " + job.getResponsibilities());
    }

}
