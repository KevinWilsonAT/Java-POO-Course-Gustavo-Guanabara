/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cursoemvideo.class12;

/**
 *
 * @author DELL
 */
public class Mammal extends Animal{
    
    private String furColor;
    
    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }
    
    @Override
    public void move() {
        System.out.println("The Mammal is Running");
    }

    @Override
    public void feed() {
        System.out.println("The Mammal is Feeding / Milking");
    }

    @Override
    public void makeSound() {
        System.out.println("The Mammal is Making a Sound");
    }
    
}
