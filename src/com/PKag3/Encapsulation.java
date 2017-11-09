package com.PKag3;

public class Encapsulation {

    private String FirstName;
    private String LastName;
    private String IdNum;

    private int age;
    private int roll;


    public int getAge(){
        return age;
    }
    public String getFirstName(){
        return FirstName;
    }
    public String getLastName(){
        return LastName;
    }
    public String getIdNum(){
        return IdNum;
    }
    public int getRoll(){
        return roll;
    }


    public void setFirstName(String newFirstName){

        FirstName = newFirstName;
    }
    public void setLastName(String newLastName){
        FirstName = newLastName;
    }
    public void setIdNum(String newIdNum) {
        IdNum = newIdNum;
    }
    public void setAge(int newAge){
        age = newAge;
    }
    public void setRoll(int newsetRoll){
        roll = newsetRoll;
    }
}
