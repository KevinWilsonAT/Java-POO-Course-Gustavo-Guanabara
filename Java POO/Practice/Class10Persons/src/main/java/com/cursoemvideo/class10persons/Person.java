/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cursoemvideo.class10persons;

/**
 *
 * @author kevin
 */
public class Person {
    
    private String name;
    private int age;
    private String gender;
    
    public void makeBirthday() {
        this.age++;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    @Override
    public String toString() {
        return "Person:\n" + " Name: " + this.getName() + ",\n age: " + this.getAge() +
                ",\n gender: " + this.getGender();
    }
}
