package com.workintech.devModel;

public class MidDeveloper extends Employee{

    public MidDeveloper(int id,String name,double salary){
        super(id,name,salary);
    }

    public void work(){
        System.out.println("Mid developer starts to working");
    }
}
