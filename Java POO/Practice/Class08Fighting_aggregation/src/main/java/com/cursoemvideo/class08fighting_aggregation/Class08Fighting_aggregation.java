/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.cursoemvideo.class08fighting_aggregation;

import java.util.Random;

/**
 *
 * @author kevin
 */
public class Class08Fighting_aggregation {

    public static void main(String[] args) {
        
        Random rand1 = new Random();
        Random rand2 = new Random();
        
        int fnum1 = rand1.nextInt(6);
        int fnum2 = rand2.nextInt(6);
        Fighter f[] = new Fighter[6];
        
        f[0] = new Fighter("Player1", "France", 30, 1.75f, 90.9f, 11, 2, 1);
        f[1] = new Fighter("Player2", "Brazil", 29, 1.68f, 57.8f, 14, 2, 3);
        f[2] = new Fighter("Player3", "USA", 35, 1.65f, 80.9f, 12, 2, 1);
        f[3] = new Fighter("Player4", "Australia", 28, 1.93f, 81.6f, 13, 0, 2);
        f[4] = new Fighter("Player5", "Japan", 37, 1.70f, 119.3f, 5, 4, 3);
        f[5] = new Fighter("Player6", "UK", 30, 1.81f, 105.7f, 12, 2, 4);
        
        Fight UFC_Fight01 = new Fight();
        
        System.out.println(fnum1);
        System.out.println(fnum2);
        
        UFC_Fight01.setFight(f[fnum1], f[fnum2]);
        UFC_Fight01.fight();
    }
}
