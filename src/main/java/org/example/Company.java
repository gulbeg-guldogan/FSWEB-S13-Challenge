package org.example;

import java.util.Arrays;

public class Company {
    private long id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(long id, String name, double giro, String[] developerNames){
        this.id = id;
        this.name = name;
        this.giro = giro < 0 ? 0 : giro;
        this.developerNames = developerNames;
    }

    public long getId(){
        return this.id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getGiro(){
        return this.giro;
    }

    public void setGiro(double giro){
        this.giro = giro;
    }

    public String[] getDeveloperNames(){
        return this.developerNames;
    }

    public void setDeveloperNames(String[] developerNames){
        this.developerNames = developerNames;
    }

    public String toString(){
        return id + " " + name + " " + giro + " " + Arrays.toString(developerNames);
    }

    public void addEmployee(int index, String name){
        if(index< developerNames.length && index >= 0){
            if(developerNames[index] == null){
                developerNames[index] = name;
            }else {
                System.out.println("İlgili bölüm dolu");
            }
        }
    }
}
