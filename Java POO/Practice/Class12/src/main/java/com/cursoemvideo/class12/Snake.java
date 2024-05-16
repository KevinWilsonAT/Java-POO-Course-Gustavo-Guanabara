/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cursoemvideo.class12;

/**
 *
 * @author DELL
 */
public class Snake extends Reptile{
    
    @Override
    public void move() {
        System.out.println("The Snake is Crawling");
    }

    @Override
    public void feed() {
        System.out.println("The Snake is Feeding");
    }

    @Override
    public void makeSound() {
        System.out.println("The Snake is Hissing");
    }
}