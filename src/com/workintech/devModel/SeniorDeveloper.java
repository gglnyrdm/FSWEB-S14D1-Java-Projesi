package com.workintech.devModel;

public class SeniorDeveloper extends Employee{

    public SeniorDeveloper(int id,String name,double salary){
        super(id,name,salary);
    }

    public void work(){
        System.out.println("Senior developer starts to working");
    }
}
