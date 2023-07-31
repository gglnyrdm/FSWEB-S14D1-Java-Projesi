package com.workintech.devModel;

public class JuniorDeveloper extends Employee{

    public JuniorDeveloper(int id,String name,double salary){
        super(id,name,salary);
    }

    public void work(){
        System.out.println("Junior developer starts to working");
    }
}
