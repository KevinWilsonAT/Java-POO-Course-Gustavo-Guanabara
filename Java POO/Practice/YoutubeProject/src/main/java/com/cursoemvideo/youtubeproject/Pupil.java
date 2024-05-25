/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cursoemvideo.youtubeproject;

/**
 *
 * @author DELL
 */
public class Pupil extends People {
    private String login;
    private int totWatched;

    public Pupil(String name, int age, String gender, String login) {
        super(name, age, gender);
        this.login = login;
        this.totWatched = 0;
    }

    public void watchOneMore(){
        this.totWatched++;
    }
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotWatched() {
        return totWatched;
    }

    public void setTotWatched(int totWatched) {
        this.totWatched = totWatched;
    }

    @Override
    public String toString() {
        return "Pupil{" + super.toString() + "login=" + login + ", totWatched=" + totWatched + '}';
    }
    
}
