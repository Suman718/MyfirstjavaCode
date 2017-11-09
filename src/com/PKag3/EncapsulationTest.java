package com.PKag3;

public class EncapsulationTest {




    public static void main(String[] args) {



        Encapsulation obj = new Encapsulation();
        obj.setFirstName("Suman");
        obj.setLastName("Das");
        obj.setIdNum("D1235");
        obj.setAge(30);
        obj.setRoll(201);


        /*System.out.println("Print First Name:" + obj.getFirstName());

        System.out.println("Print Last Name:" + obj.getLastName());

        System.out.println("Print RollNumber :" + obj.getRoll());

        System.out.println("Print Age:" + obj.getAge());*/

        System.out.println("Print First Name:" + obj.getFirstName() + "LastName" + obj.getLastName() + "IdNum" + obj.getRoll());





    }
}
