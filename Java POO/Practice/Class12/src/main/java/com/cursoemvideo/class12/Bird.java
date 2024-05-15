/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cursoemvideo.class12;

/**
 *
 * @author DELL
 */
public class Bird extends Animal{
        
    private String featherColor;

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }
    
    @Override
    public void move() {
        System.out.println("The Bird is Flying");
    }

    @Override
    public void feed() {
        System.out.println("The Bird is Eating Worms / Fruits");
    }

    @Override
    public void makeSound() {
        System.out.println("The Bird is Making a Sound");
    }
    
    public void makeNest() {
        System.out.println("The Bird is Making a Nest");
    }
}