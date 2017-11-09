package com.Preferred;

public class  StudentInfo {

    int A = 50;
    int B = 60;

    int result = 0;



    public void Num1(){

        result = A + B;

        System.out.println("print MY number" +  "A"  +  "B"  + result);




    }

    public void Num2(){
        int result1 = 0;
        result1 = A +B;
        System.out.println("sum of the number" + result1);

    }

    public static void main(String[] args) {






        StudentInfo obj = new StudentInfo();
        obj.Num1();
        obj.Num2();


    }



}


