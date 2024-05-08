/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.cursoemvideo.class11;

/**
 *
 * @author DELL
 */
public class Class11 {

    public static void main(String[] args) {
                
        Visitor v1 = new Visitor();
        v1.setName("John");
        v1.setAge(22);
        v1.setGender("M");
        System.out.println(v1.toString());
        
        System.out.println();
        Student st1 = new Student();
        st1.setName("Claude");
        st1.setRegister(1111);
        st1.setCourse("IT");
        st1.setAge(16);
        st1.setGender("M");
        System.out.println(st1.toString());        
        st1.payMonthly();
        
        System.out.println();
        ScholarshipHolder sh1 = new ScholarshipHolder();
        sh1.setRegister(1112);
        sh1.setName("Jubilee");
        sh1.setAge(21);
        sh1.setScholarship(12.5f);
        sh1.setGender("F");
        System.out.println(sh1.toString());
        sh1.payMonthly();
        
        System.out.println();
        Teacher te1 = new Teacher();
        te1.setName("Josh");
        te1.setAge(34);
        te1.setGender("M");
        System.out.println(te1.toString());
        te1.receiveAug(50);
        
        System.out.println();
        Technician tc1 = new Technician();
        tc1.setName("Paul");
        tc1.setAge(29);
        tc1.setGender("M");
        System.out.println(te1.toString());
        tc1.practice();
        tc1.payMonthly();
    }
}