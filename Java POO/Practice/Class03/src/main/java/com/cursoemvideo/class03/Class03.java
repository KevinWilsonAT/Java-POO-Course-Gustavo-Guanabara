/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.cursoemvideo.class03;

/**
 *
 * @author kevin
 */

public class Class03 {

    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.model = "BIC";
        //p1.tip = 0.8f;
        p1.color = "Blue";
        p1.charge = 80;
        
        p1.uncover();
        p1.status();
        p1.draw();
    }
}