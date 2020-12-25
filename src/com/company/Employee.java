package com.company;

public final class Employee extends Employer{

    public Employee(Company company, Positions positions, int salary){
       super(company, positions, salary);
    }

    @Override
    public void giveAssignments(int num, String assignments) {
        super.giveAssignments(num, assignments);
        System.out.println("Не надо " + assignments);
    }

    public String getInfo2(){
        return "Company: "+getCompany().getName()+",Specialization: "+getCompany().getSpecialization()+",Positions: "+getPositions()+",Salary: "+getSalary();
    }
}
