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
    
    public BankAccount(){
        setBalance(0);
        setStatus(false);
    }

    public int getAccountNum() {
        return accountNum;
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean s) {
        this.status = s;
    }
    
    public void openAccount(String t){
        setType(t);
        setStatus(true);
        
        if(t == "CA"){
            setBalance(50);
        }
        else if (t == "SA"){
            setBalance(150);
        }
    }
    
    public void closeAccount(){
        if(getBalance() > 0){
            System.out.print("This account is not empty to be closed.");
        }
        else if(getBalance() < 0){
            System.out.print("This account cannot be closed in debt.");
        }
        else{
            setStatus(false);
        }
    }
    
    public void deposit(float v){
        if(isStatus() == true){
            setBalance(getBalance() + v);
        }
        else{
            System.out.print("Cannot deposit. Inexistent or Closed Account");
        }
    }
    
    public void withdraw(float v){
        if(isStatus() == true){
            if(getBalance() >= v){
                setBalance(getBalance() - v);
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
        if(getType() == "CA"){
            m = 12;
        }
        else if(getType() == "SA"){
            m = 20;
        }
        
        if(isStatus() == true){
            if(getBalance() >= m){
                setBalance(getBalance() - m);
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
