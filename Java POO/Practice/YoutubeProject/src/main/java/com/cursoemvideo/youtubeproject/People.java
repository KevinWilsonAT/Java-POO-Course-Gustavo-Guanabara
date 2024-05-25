/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cursoemvideo.youtubeproject;

/**
 *
 * @author DELL
 */
public abstract class People {
    protected String name;
    protected int age;
    protected String gender;
    protected float experience;

    public People(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.experience = 0;
    }
    
    protected void gainExp(float n) {
        this.experience += n;
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

    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "People{" + "name=" + name + ", age=" + age + ", gender=" + gender +
                ", experience=" + experience + '}';
    }
        
}
