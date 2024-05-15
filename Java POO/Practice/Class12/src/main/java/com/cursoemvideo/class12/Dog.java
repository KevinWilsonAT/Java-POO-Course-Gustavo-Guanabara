/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cursoemvideo.class12;

/**
 *
 * @author DELL
 */
public class Dog extends Mammal{
    
    @Override
    public void move(){
        System.out.println("The Dog is Running.");
    }
    
    @Override
    public void feed(){
        System.out.println("The Dog is Feeding / Milking.");
    }
    
    @Override
    public void makeSound(){
        System.out.println("The Dog is Barking.");
    }
    
    public void buryBone() {
        System.out.println("The Dog is Burying a Bone");
    }
    public void wagTail() {
        System.out.println("The Dog is Wagging its Tail");
    }
}
