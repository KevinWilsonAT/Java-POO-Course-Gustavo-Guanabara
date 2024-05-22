/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.cursoemvideo.class13;

/**
 *
 * @author DELL
 */
public class Class13 {

    public static void main(String[] args) {
        Wolf w = new Wolf();
        w.makeSound();
        
        System.out.println();
        
        Dog d = new Dog();
        d.react("Here's your food");
        d.react("DON'T BARK!");
        d.react(11, 45);
        d.react(21, 00);
        d.react(true);
        d.react(false);
        d.react(2, 2.5f);
        d.react(2, 12.6f);        
        d.react(17, 2f);
        d.react(17, 4.5f);
    }
}
