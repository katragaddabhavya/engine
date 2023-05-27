package com.ENGINE;

public class ENGINE {
    private int modelnumber;
    private int displacement;
    private int maxPower;
    private int maxrpm;
    private int noOfCylinders;

    public String toString(){
        return "Engine{"+"  Model No is"+getModelnumber()+" Displacement is "+getDisplacement()+"    Max Power is   "+getMaxPower()+"   MaxRpm is   "+getMaxrpm()+"    No of Cylinders Are  "+getNoOfCylinders()+"}";
    }

    public ENGINE(int modelnumber,int displacement,int maxPower,int maxrpm,int noOfCylinders){
        this.modelnumber=modelnumber;
        this.displacement=displacement;
        this.maxPower=maxPower;
        this.maxrpm=maxrpm;
        this.noOfCylinders=noOfCylinders;
    }

    public int getModelnumber() {
        return modelnumber;
    }

    public void setModelnumber(int modelnumber) {
        this.modelnumber = modelnumber;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public int getMaxPower() {
        return maxPower;
    }
    public void setMaxPower(int maxPower) {
        this.maxPower = maxPower;
    }

    public int getMaxrpm() {
        return maxrpm;
    }

    public void setMaxrpm(int maxrpm) {
        this.maxrpm = maxrpm;
    }

    public int getNoOfCylinders() {
        return noOfCylinders;
    }

    public void setNoOfCylinders(int noOfCylinders) {
        this.noOfCylinders = noOfCylinders;
    }
}