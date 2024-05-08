/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cursoemvideo.class11;

/**
 *
 * @author DELL
 */
public class Technician extends Student {
    private String profRegister;

    public void practice(){
        System.out.println(this.getName() + " is a technician and he/she is practicing.");
    }
    
    public String getProfRegister() {
        return profRegister;
    }

    public void setProfRegister(String profRegister) {
        this.profRegister = profRegister;
    }
    
    
}
