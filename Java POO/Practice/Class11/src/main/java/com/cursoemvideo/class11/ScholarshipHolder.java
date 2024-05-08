/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cursoemvideo.class11;

/**
 *
 * @author DELL
 */
public class ScholarshipHolder extends Student {
    private float scholarship;
    
    public void renewScholarship() {
        System.out.println("Renewing " + this.getName() + "'s scholarship.");
    }
    
    @Override
    public void payMonthly() {
        System.out.println(this.getName() + " is a scholarship holder. The student's payment was facilitated.");
    }

    public float getScholarship() {
        return scholarship;
    }

    public void setScholarship(float scholarship) {
        this.scholarship = scholarship;
    }
    
    
}
