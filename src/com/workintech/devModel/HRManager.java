package com.workintech.devModel;

public class HRManager extends Employee{

    private JuniorDeveloper[] juniorArr;
    private MidDeveloper[] midArr;
    private SeniorDeveloper[] seniorArr;

    public HRManager(int id,String name,double salary,JuniorDeveloper[] juniorArr,MidDeveloper[] midArr,SeniorDeveloper[] seniorArr){
        super(id,name,salary);
        this.juniorArr=juniorArr;
        this.seniorArr=seniorArr;
        this.midArr=midArr;
    }

    public void work(){
        System.out.println("HRManager starts to working");
    }

    public void addEmployee(int index, JuniorDeveloper developer){
        try{
            if (juniorArr[index] == null){
                juniorArr[index] = developer;
            }else {
                System.out.println("Index is full.");
            }
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Index not found" + ex.getMessage());
        }
    }

    public void addEmployee(int index, MidDeveloper developer){
        try {
            if (midArr[index] == null){
                midArr[index]=developer;
            }else {
                System.out.println("Index is full.");
            }
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Index not found" + ex.getMessage());
        }
    }

    public void addEmployee(int index, SeniorDeveloper developer){
        try {
            if (seniorArr[index] == null){
                seniorArr[index]=developer;
            }else {
                System.out.println("Index is full.");
            }
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Index not found" + ex.getMessage());
        }
    }
}
