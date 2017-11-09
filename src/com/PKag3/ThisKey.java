package com.PKag3;

public class ThisKey {

    int a ;
    int b ;


    public void setdata(int a, int b){

        this.a = a;
        this.b = b;

    }

    public void getter(){
        System.out.println("print the value A=" + a);
        System.out.println("print the value B=" + b);
    }

    public static void main(String[] args) {

        ThisKey obj = new ThisKey();
        obj.setdata(23, 45);
        obj.getter();


    }
}
