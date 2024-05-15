/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cursoemvideo.class12;

/**
 *
 * @author DELL
 */
public class Turtle extends Reptile{
    
    @Override
    public void move() {
        System.out.println("The Turtle is Moving");
    }

    @Override
    public void feed() {
        System.out.println("The Turtle is Eating Vegetables");
    }

    @Override
    public void makeSound() {
        System.out.println("The Turtle is Making a Sound");
    }
    
    public void hide() {
        System.out.println("The Turtle is Hiding inside its Shell");
    }
}
