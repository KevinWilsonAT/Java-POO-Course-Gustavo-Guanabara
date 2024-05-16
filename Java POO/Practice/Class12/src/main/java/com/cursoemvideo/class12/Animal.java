/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cursoemvideo.class12;

/**
 *
 * @author DELL
 */
public abstract class Animal {
    protected float weight;
    protected int age;
    protected int members;

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMembers() {
        return members;
    }

    public void setMembers(int members) {
        this.members = members;
    }
    
    public abstract void move();
    public abstract void feed();
    public abstract void makeSound();
    
    @Override
    public String toString() {
        return "\nWeight: " + getWeight() + "\nAge: " + getAge() + "\nMembers: " + getMembers();
    }
}
