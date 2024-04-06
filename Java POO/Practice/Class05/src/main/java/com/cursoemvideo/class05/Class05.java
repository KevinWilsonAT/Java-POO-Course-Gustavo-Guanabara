/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.cursoemvideo.class05;

/**
 *
 * @author kevin
 */
public class Class05 {
    public static void main(String[] args) {
        
        BankAccount ba1 = new BankAccount();
        ba1.setAccountNum(1111);
        ba1.setOwner("o");
        ba1.openAccount("CA");
        
        BankAccount ba2 = new BankAccount();
        ba2.setAccountNum(2222);
        ba2.setOwner("o2");
        ba2.openAccount("SA");
        
        ba1.deposit(100);
        ba2.deposit(500);
        ba2.withdraw(100);
        
        ba1.withdraw(150);
        ba1.closeAccount();
        
        ba1.currentStatus();
        ba2.currentStatus();
    }
}
