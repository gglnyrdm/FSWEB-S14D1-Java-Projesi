package com.workintech.model;

public class Cuboid extends Rectangle{

    private double height;

    public void checkHeight(double height){
        if (height<0){
            this.height=0;
        }else {
            this.height=height;
        }
    }
    public Cuboid(double width, double length,double height){
        super(width,length);
        checkHeight(height);
    }

    public double getHeight(){ return height; }

    public double getVolume(){ return getArea()*height; }
}
