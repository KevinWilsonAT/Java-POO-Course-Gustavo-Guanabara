/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cursoemvideo.class12;

/**
 *
 * @author DELL
 */
public class Reptile extends Animal{
        
    private String scaleColor;

    public String getScaleColor() {
        return scaleColor;
    }

    public void setScaleColor(String scaleColor) {
        this.scaleColor = scaleColor;
    }
    
    @Override
    public void move() {
        System.out.println("The Reptile is Moving / Crawling");
    }

    @Override
    public void feed() {
        System.out.println("The Reptile is Feeding / Eating Vegetables");
    }

    @Override
    public void makeSound() {
        System.out.println("The Reptile is Making a Sound");
    }
}