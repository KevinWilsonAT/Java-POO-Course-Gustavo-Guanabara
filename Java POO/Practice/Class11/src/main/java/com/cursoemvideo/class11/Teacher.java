/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cursoemvideo.class11;

/**
 *
 * @author DELL
 */
public class Teacher extends Person {
    private String specialty;
    private float salary;
    
    public void receiveAug(float aug) {
        this.salary += aug;
        System.out.print(this.getName() + " is a Teacher. ");
        System.out.println("His/Her salary will be augmented to " + this.getSalary());
    }
    
    public String getSpecialty() {
        return specialty;
    }

    public float getSalary() {
        return salary;
    }

    public void setSpecialty(String specialty){
        this.specialty = specialty;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
