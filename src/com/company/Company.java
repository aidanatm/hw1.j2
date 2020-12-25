package com.company;

public class Company {
    private String name;
    private String specialization;

    public Company(String name, String specialization){
        this.name=name;
        this.specialization =specialization;
    }

    public  String getName(){
        return  name;
    }

    public String getSpecialization(){
        return specialization;
    }
}

