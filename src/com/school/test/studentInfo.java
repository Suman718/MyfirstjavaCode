package com.school.test;

public class studentInfo {

    String StudentName;
    String course;


    public void GreadCalulation(int mark) {

        if (mark > 90) {
            System.out.println("A");
        } else if (mark < 90 && mark >= 80) {
            System.out.println("B");
        } else if (mark < 80 && mark >= 70) {
            System.out.println("C");
        } else if (mark < 70 && mark >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");


        }
    }


}
