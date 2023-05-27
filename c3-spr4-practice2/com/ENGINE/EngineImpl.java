package com.ENGINE;

public class EngineImpl {
    public static void main(String[] args) {
        PetrolEngines petrolEngines=new PetrolEngines(2002,11,90,120,5);
        DieselEngines dieselEngines=new DieselEngines(2000,34,60,130,4);
        ElectricEngines electricEngines=new ElectricEngines(2003,58,150,140,5,220);
        CNGEngines cngEngines=new CNGEngines(2005,55,280,175,1);
        System.out.println(electricEngines);
        System.out.println(petrolEngines);
        System.out.println(dieselEngines);
        System.out.println(cngEngines);
    }
}