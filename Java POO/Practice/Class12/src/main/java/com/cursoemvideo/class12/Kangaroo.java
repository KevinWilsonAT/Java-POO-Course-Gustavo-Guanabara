/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cursoemvideo.class12;

/**
 *
 * @author DELL
 */
public class Kangaroo extends Mammal {
    @Override
    public void move(){
        System.out.println("The Kangaroo is Jumping");
    }
    
    @Override
    public void feed(){
        System.out.println("The Kangaroo is Feeding / Milking.");
    }
    
    @Override
    public void makeSound(){
        System.out.println("The Kangaroo is Making a Sound.");
    }
    
    public void usePouch() {
        System.out.println("The Kangaroo is Using Pouch");
    }
}
