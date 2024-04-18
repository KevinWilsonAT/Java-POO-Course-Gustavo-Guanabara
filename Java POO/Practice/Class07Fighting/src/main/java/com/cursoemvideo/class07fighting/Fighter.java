/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cursoemvideo.class07fighting;

/**
 *
 * @author kevin
 */
public class Fighter {

    private String name;
    private String nationality;
    private int age;
    private float height;
    private float weight;
    private String category;
    private int wins, losses, draws;
    
    public void display(){
        System.out.println("Fighter: " + this.getName());
        System.out.println("Origins: " + this.getNationality());
        System.out.println("Age: " + this.getAge());
        System.out.println("Height: " + this.getHeight());
        System.out.println("Weight: " + this.getWeight());
        System.out.println("Wins: " + this.getWins());
        System.out.println("Losses: " + this.getLosses());
        System.out.println("Draws: " + this.getDraws());
    }
    
    public void status(){
        System.out.println("Category: ");
        System.out.println("Wins: " + this.getWins());
        System.out.println("Losses: " + this.getLosses());
        System.out.println("Draws: " + this.getDraws());
    }
    
    public void winFight(){
        this.setWins(this.getWins() + 1);
    }
    
    public void loseFight(){
        this.setLosses(this.getLosses() + 1);
    }
    
    public void drawFight(){
        this.setDraws(this.getDraws() + 1);
    }
    
    // Special Methods

    public Fighter(String name, String nationality, int age, float height, float weight, int wins, int losses, int draws) {
        this.name = name;
        this.nationality = nationality;
        this.age = age;
        this.height = height;
        this.setWeight(weight);
        this.wins = wins;
        this.losses = losses;
        this.draws = draws;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
        this.setCategory();
    }

    public String getCategory() {
        return category;
    }

    private void setCategory() {
        if(this.weight < 52.2){
            this.category = "Invalid Category";
        }
        else if(this.weight <= 70.3){
            this.category = "Light";
        }
        else if(this.weight <= 83.9){
            this.category = "Mid";
        }
        else if(this.weight <= 120.2){
            this.category = "Heavy";
        }
        else {
            this.category = "Invalid";
        }
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }
    
    
}
