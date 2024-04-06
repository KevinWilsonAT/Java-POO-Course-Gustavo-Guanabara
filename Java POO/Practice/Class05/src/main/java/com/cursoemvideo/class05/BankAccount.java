/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cursoemvideo.class05;

/**
 *
 * @author kevin
 */
public class BankAccount {
    public int accountNum;
    protected String type;
    private String owner;
    private float balance;
    private boolean status;
    
    public void currentStatus(){
        System.out.println("==================================");
        System.out.println("Account: " + this.getAccountNum());
        System.out.println("Type: " + this.getType());
        System.out.println("Owner" + this.getOwner());
        System.out.println("Balance: " + this.getBalance());
        System.out.println("Status: " + this.getStatus());
    }
    
    public BankAccount(){
        this.setBalance(0);
        this.setStatus(false);
    }

    public int getAccountNum() {
        return this.accountNum;
    }

    public void setAccountNum(int n) {
        this.accountNum = n;
    }

    public String getType() {
        return type;
    }

    public void setType(String t) {
        this.type = t;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String o) {
        this.owner = o;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float b) {
        this.balance = b;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean s) {
        this.status = s;
    }
    
    public void openAccount(String t){
        this.setType(t);
        this.setStatus(true);
        
        if(t == "CA"){
            this.setBalance(50);
        }
        else if (t == "SA"){
            this.setBalance(150);
        }
    }
    
    public void closeAccount(){
        if(this.getBalance() > 0){
            System.out.print("This account is not empty to be closed.");
        }
        else if(this.getBalance() < 0){
            System.out.print("This account cannot be closed in debt.");
        }
        else{
            this.setStatus(false);
            System.out.println("Account closed successfully!");
        }
    }
    
    public void deposit(float v){
        if (this.getStatus()){
            this.setBalance(this.getBalance() + v);
            System.out.println("Deposited successfully in the account of " + this.getOwner());
        }
        else{
            System.out.print("Cannot deposit. Inexistent or Closed Account");
        }
    }
    
    public void withdraw(float v){
        if(this.getStatus() == true){
            if(this.getBalance() >= v){
                this.setBalance(this.getBalance() - v);
                System.out.println("Withdrawed successfully from the account of " + this.getOwner());
            }
            else{
                System.out.print("Insufficient Money to perform a withdrawal");
            }
        }
        else{
            System.out.print("Cannot withdraw. Inexistent or Closed Account");
        }
    }
    
    public void payMonth(){
        float m = 0;
        if(this.getType() == "CA"){
            m = 12;
        }
        else if(this.getType() == "SA"){
            m = 20;
        }
        
        if(this.getStatus()){
            if(this.getBalance() >= m){
                this.setBalance(this.getBalance() - m);
            }
            else{
                System.out.print("Insufficient Money to do the monthly payments");
            }
        }
        else{
            System.out.print("Cannot pay. Inexistent or Closed Account");
        }
    }
}
