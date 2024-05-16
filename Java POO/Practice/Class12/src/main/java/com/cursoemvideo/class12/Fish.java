/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cursoemvideo.class12;

/**
 *
 * @author DELL
 */
public class Fish extends Animal {
    private String scaleColor;

    public String getScaleColor() {
        return scaleColor;
    }

    public void setScaleColor(String scaleColor) {
        this.scaleColor = "Scale Color: " + scaleColor;
    }

    @Override
    public void move() {
        System.out.println("The Fish is Swiming");
    }

    @Override
    public void feed() {
        System.out.println("The Fish is Feeding");
    }

    @Override
    public void makeSound() {
        System.out.println("The Fish doesn't Make a Sound");
    }
    
    public void makeBubbles() {
        System.out.println("The Fish is Making Bubbles");
    }
}
