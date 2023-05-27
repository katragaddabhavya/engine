package com.ENGINE;

public class ElectricEngines extends ENGINE{
    private double voltage;

    public String toString(){
        return "ElectricEngine{"+"ModelNumber= "+getModelnumber()+" Displacement is "+getDisplacement()+"   Max Power is    "+getMaxPower()+"   Max Rpm is    "+getMaxrpm()+" No of Cylinders Are    "+getNoOfCylinders()+"}";
    }
    public ElectricEngines(int modelnumber,int displacement,int maxPower,int maxrpm,int noOfCylinders,int voltage){
        super(modelnumber,displacement,maxPower,maxrpm,noOfCylinders);
        this.voltage=voltage;
    }

    public double getVoltage() {
        return voltage;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }
}