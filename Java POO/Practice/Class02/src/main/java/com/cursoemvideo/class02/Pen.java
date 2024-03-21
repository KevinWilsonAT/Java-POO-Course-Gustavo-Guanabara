/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cursoemvideo.class02;

/**
 *
 * @author kevin
 */
public class Pen {
    String model;
    String color;
    Float tip;
    int charge;
    boolean covered;
    
    void status(){
        System.out.println("Pen Model: " + this.model);
        System.out.println("Pen Color: " + this.color);
        System.out.println("Pen Tip Width: " + this.tip);
        System.out.println("Pen Charge (%): " + this.charge);
        System.out.println("Pen covered? " + this.covered);
    }
    
    void draw(){
        if(this.covered == true){
            System.out.println("ERROR! Cannot draw with Pen Covered");
        }
        else{
            System.out.println("Pen Drawing...");
        }
    }
    
    void cover(){
        this.covered = true;
    }
    
    void uncover(){
        this.covered = false;
    }
}
