package org.example;

public class Main {
    public static void main(String[] args) {
        String[] healthplans = {"Plan A", "Plan B", "Plan C"};
        String[] developernames = {"Dilara Gültaş", "Çetin Yavuz", "Batu Göktaş"};
        Employee employee = new Employee(12312, "Gülbeg Güldogan", "gulbeg.guldogan@gmail.com", "123321", healthplans);
        HealthPlan healthplan = new HealthPlan(4234, "Plan A", Plan.BASIC);
        Company company = new Company(8948, "Workintech", 978.231, developernames);
        System.out.println(employee);
        System.out.println(healthplan);
        System.out.println(company);
    }
}