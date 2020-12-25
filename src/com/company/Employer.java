package com.company;

public class Employer extends  Founder{
    private int salary;

    public Employer(Company company, Positions positions,int salary){
        super(company, positions);
        this.salary=salary;
    }

    public int getSalary(){
        return salary;
    }

    public void giveAssignments(String assignments, int num){
        for (int i = 0; i < num; i++) {
            System.out.println(assignments);
        }
    }

    public void giveAssignments(int num, String assignments){
        for (int i = 0; i < num; i++) {
            System.out.println(assignments);
        }
    }

    public final void giveAssignments(String assignments){
        System.out.println(assignments);
    }

    public  String getInfo(){

        return "Company: "+getCompany().getName()+",Specialization: "+getCompany().getSpecialization()+",Position: "+getPositions()+",Salary: "+ salary;
    }
}
