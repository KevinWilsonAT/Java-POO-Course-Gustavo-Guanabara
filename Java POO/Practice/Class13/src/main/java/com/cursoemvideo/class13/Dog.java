/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cursoemvideo.class13;

/**
 *
 * @author DELL
 */
public class Dog extends Wolf{
    @Override
    public void makeSound(){
        System.out.println("The dog is barking");
    }
    
    public void react(String phrase) {
        if (phrase.equals("Here's your food") || phrase.equals("Who is the good boy?")) {
            System.out.println("The dog is wagging its tail and barking");
        }
        else{
            System.out.println("The dog is growling");
        }
    }
    
    public void react(int hour, int min) {
        if (hour < 12) {
            System.out.println("The dog is wagging its tail");
        }
        else if (hour >= 18) {
            System.out.println("The dog is ignoring");
        }
        else{
            System.out.println("The dog is wagging its tail and barking");
        }
    }
    
    public void react(boolean owner) {
        if (owner) {
            System.out.println("The dog is wagging its tail");
        }
        else {
            System.out.println("The dog is growling and barking");
        }
    }
    
    public void react(int age, float weight) {
        if (age < 5) {
            if (weight < 10) {
                System.out.println("The dog is wagging its tail");
            }
            else {
                System.out.println("The dog is barking");
            }
        }
        else{
            if (weight < 10) {
                System.out.println("The dog is growling");
            }
            else{
                System.out.println("The dog is ignoring");
            }
        }
    }
}
