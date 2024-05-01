/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cursoemvideo.class10persons;

/**
 *
 * @author kevin
 */
public class Student extends Person{

    private int reg;
    private String course;
    
    public void cancelReg(){
        System.out.println("Register will be cancelled");
    }
    
    public int getReg() {
        return reg;
    }

    public String getCourse() {
        return course;
    }

    public void setReg(int reg){
        this.reg = reg;
    }

    public void setCourse(String course){
        this.course = course;
    }
}