/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cursoemvideo.class12;

/**
 *
 * @author DELL
 */
public class Goldfish extends Fish {

    @Override
    public void move() {
        System.out.println("The Goldfish is Swiming");
    }

    @Override
    public void feed() {
        System.out.println("The Goldfish is Feeding");
    }

    @Override
    public void makeSound() {
        System.out.println("The Goldfish doesn't Make a Sound");
    }
    
    public void makeBubbles() {
        System.out.println("The Goldfish is Making Bubbles");
    }
}
