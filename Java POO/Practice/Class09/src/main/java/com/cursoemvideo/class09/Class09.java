/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.cursoemvideo.class09;

/**
 *
 * @author kevin
 */
public class Class09 {

    public static void main(String[] args) {
        Person[] p = new Person[2];
        Book[] b = new Book[3];
        
        p[0] = new Person("Peter", 22, "M");
        p[1] = new Person("Mary", 25, "F");
        
        b[0] = new Book("Java POO #1", "Joseph", 150, p[0]);
        b[1] = new Book("Java POO #2", "Matt", 250, p[1]);
        b[2] = new Book("Java POO #3", "John", 200, p[0]);
        
        b[0].open();
        b[0].browse(200);
        b[0].nextPage();
        System.out.println(b[0].details());
        
    }
}
