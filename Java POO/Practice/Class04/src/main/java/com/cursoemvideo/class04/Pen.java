/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cursoemvideo.class04;

/**
 *
 * @author kevin
 */
public class Pen {
    private String model;
    private String color;
    private float tip;
    private boolean covered;
    
    public Pen(String m, String c, float t) {
        this.model = m;
        this.color = c;
        this.setTip(t);
        this.cover();
    }
    
    public String getModel(){
        return this.model;
    }
    
    public void setModel(String m){
        this.model = m;
    }
    
    public float getTip(){
        return this.tip;
    }
    
    public void setTip(float t){
        this.tip = t;
    }
    
    public void cover(){
        this.covered = true;
    }
    
    public void uncover(){
        this.covered = false;
    }
    
    public void status() {
        System.out.println("ABOUT THE PEN:");
        System.out.println("Model: " + getModel());
        System.out.println("Tip: " + getTip());
        System.out.println("Color: " + this.color);
        System.out.println("Covered? " + this.covered);
    }
}
