package com.company;

public class Founder {
    private Company company;
    private Positions positions;

    public Founder(Company company, Positions positions){
        this.company=company;
        this.positions=positions;

    }

    public Company getCompany(){
        return company;
    }

    public Positions getPositions(){
        return positions;
    }

    public String getInfo(){
    return "Company: "+company.getName()+"Specialization: "+company.getSpecialization()+"Position: "+positions;
    }
}
