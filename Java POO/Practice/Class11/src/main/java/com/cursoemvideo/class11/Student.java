/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cursoemvideo.class11;

/**
 *
 * @author DELL
 */
public class Student extends Person {
    private int register;
    private String course;
    
    public void payMonthly() {
        System.out.println("Paying student " + this.getName() + "'s monthly payment");
    }

    public int getRegister() {
        return register;
    }

    public void setRegister(int register) {
        this.register = register;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
