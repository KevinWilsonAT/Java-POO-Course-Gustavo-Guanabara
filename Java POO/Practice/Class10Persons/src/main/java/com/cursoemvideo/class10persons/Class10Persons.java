/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.cursoemvideo.class10persons;

/**
 *
 * @author kevin
 */
public class Class10Persons {

    public static void main(String[] args) {
        Person p1 = new Person();
        Student p2 = new Student();
        Teacher p3 = new Teacher();
        Employee p4 = new Employee();


        p1.setName("Peter");
        p2.setName("Mary");
        p3.setName("Claude");
        p4.setName("Phaby");

        p2.setCourse("IT");
        p3.setSalary(2500.75f);
        p4.setSector("Stock");

        p3.receiveAug(550.20f);
        p4.changeWork();
        p2.cancelReg();
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
