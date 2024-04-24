/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cursoemvideo.class08fighting_aggregation;

import java.util.Random;

/**
 *
 * @author kevin
 */
public class Fight {
    
    private Fighter challenged;
    private Fighter challenger;
    private int rounds;
    private boolean approved;
    
    public void setFight(Fighter f1, Fighter f2) {
        if(f1.getCategory().equals(f2.getCategory()) && (f1 != f2)){
            this.approved = true;
            this.challenged = f1;
            this.challenger = f2;
        }
        else {
            this.approved = false;
            this.challenged = null;
            this.challenger = null;
        }
    }
    
    public void fight() {
        if(this.approved){
            this.challenged.display();
            this.challenger.display();
            Random rand = new Random();
            int winner = rand.nextInt(3);
            
            switch (winner) {
                case 0:
                    System.out.println("It's a Draw.");
                    this.challenged.drawFight();
                    this.challenger.drawFight();
                    break;

                case 1:
                    System.out.println("End of the fight. The Challenged Fighter " + this.challenged.getName() + " wins.");
                    this.challenged.winFight();
                    this.challenger.loseFight();
                    break;
                
                case 2:
                    System.out.println("End of the fight. The Challenger Fighter " + this.challenger.getName() + " wins.");
                    this.challenger.winFight();
                    this.challenged.loseFight();
                    break;
            }
        }
        else {
            System.out.print("ERROR. Cannot proceed this fight<br>(The fighters does not are from the same level categories or ");
            System.out.println("both fighters are registered as the same person).");
        }
    }
    
    // Special Methods

    public Fighter getChallenged() {
        return challenged;
    }

    public void setChallenged(Fighter challenged) {
        this.challenged = challenged;
    }

    public Fighter getChallenger() {
        return challenger;
    }

    public void setChallenger(Fighter challenger) {
        this.challenger = challenger;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }
    
    
}
