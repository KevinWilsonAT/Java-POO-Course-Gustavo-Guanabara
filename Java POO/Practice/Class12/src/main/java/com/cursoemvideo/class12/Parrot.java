/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cursoemvideo.class12;

/**
 *
 * @author DELL
 */
public class Parrot extends Bird{
    @Override
    public void move() {
        System.out.println("The Parrot is Flying");
    }

    @Override
    public void feed() {
        System.out.println("The Parrot is Eating Seeds");
    }

    @Override
    public void makeSound() {
        System.out.println("The Parrot is Making a Sound");
    }
    
    @Override
    public void makeNest() {
        System.out.println("The Parrot is Making a Nest");
    }
}
