package com.workintech.main;

import com.workintech.devModel.HRManager;
import com.workintech.devModel.JuniorDeveloper;
import com.workintech.devModel.MidDeveloper;
import com.workintech.devModel.SeniorDeveloper;

public class devMain {

    public static void main(String[] args) {
        JuniorDeveloper juniorDeveloper1= new JuniorDeveloper(2,"Ali", 20000);
        juniorDeveloper1.work();
        JuniorDeveloper juniorDeveloper2=new JuniorDeveloper(3,"veli",20000);
        juniorDeveloper2.work();
        JuniorDeveloper[] juniors =new JuniorDeveloper[]{juniorDeveloper1,juniorDeveloper2};

        MidDeveloper midDeveloper1= new MidDeveloper(4,"Ayşe", 30000);
        midDeveloper1.work();
        MidDeveloper midDeveloper2=new MidDeveloper(5,"Ece",30000);
        midDeveloper2.work();
        MidDeveloper[] mids =new MidDeveloper[]{midDeveloper1,midDeveloper2};

        SeniorDeveloper seniorDeveloper1= new SeniorDeveloper(6,"Ege", 40000);
        seniorDeveloper1.work();
        SeniorDeveloper seniorDeveloper2=new SeniorDeveloper(7,"Deniz",40000);
        seniorDeveloper2.work();
        SeniorDeveloper[] seniors =new SeniorDeveloper[]{seniorDeveloper1,seniorDeveloper2};

        HRManager hrManager = new HRManager(1,"John", 25000, juniors,mids,seniors);
        hrManager.work();
    }
}
