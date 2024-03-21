/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.cursoemvideo.class02;

/**
 *
 * @author kevin
 */
public class Class02 {

    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.color = "Blue";
        p1.tip = 0.5f;
        
        p1.cover();
        p1.status();
        p1.draw();
        
        Pen p2 = new Pen();
        p2.model = "ASOA";
        p2.color = "Black";
        p2.tip = 1.0f;
        
        p2.uncover();
        p2.status();
        p2.draw();
    }
}
