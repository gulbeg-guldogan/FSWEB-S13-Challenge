package org.example;


public class HealthPlan {
    private int id;
    private String name;
    private Plan plan;

    public HealthPlan(int id, String name, Plan plan){
        this.id = id;
        this.name = name;
        this.plan = plan;
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Plan getPlan() {
        return this.plan;
    }

    public void setPlan(Plan plan){
        this.plan = plan;
    }

    public String toString(){
        return id + " " + name + " " + plan;
    }
}
