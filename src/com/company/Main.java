package com.company;

public class Main {

    public static void main(String[] args) {

        Company company = new Company("The Best", "Bank");

    Employer objectA = new Employer(company, Positions.MANAGER, 60000 );

    Employee objectB = new Employee(company, Positions.ANALIST, 40000);

    Employee objectC = new Employee(company, Positions.ACCOUNTANT, 35000);

        System.out.println(objectA.getInfo());

        System.out.println(objectB.getInfo2());

        System.out.println(objectC.getInfo2());

        objectA.giveAssignments(1,"Посчитать расходы");

        objectA.giveAssignments("Выписать зарплату",1);

        objectA.giveAssignments("Составить график");

        objectB.giveAssignments(0,"Cоставлять диаграмму");



    }

    }



