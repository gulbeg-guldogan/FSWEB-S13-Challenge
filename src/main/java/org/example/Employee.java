package org.example;

import java.util.Arrays;

public class Employee {
    private long id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthPlans;

    public Employee(long id, String fullName, String email, String password, String[] healthPlans){
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthPlans = healthPlans;
    }

    public long getId(){
        return this.id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getFullName(){
        return this.fullName;
    }

    public void setFullName(String fullName){
        this.fullName = fullName;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String[] getHealthPlans(){
        return this.healthPlans;
    }

    public void setHealthPlans(String[] healthPlans){
        this.healthPlans = healthPlans;
    }

    public String toString(){
        return id + " " + fullName + " " + email + " " + password + " " + Arrays.toString(healthPlans);
    }

    public void addHealthPlan(int index, String name){
        if(index< healthPlans.length && index >= 0){
            if(healthPlans[index] == null){
                healthPlans[index] = name;
            }else {
                System.out.println("İlgili bölüm dolu");
            }
        }
    }
}
