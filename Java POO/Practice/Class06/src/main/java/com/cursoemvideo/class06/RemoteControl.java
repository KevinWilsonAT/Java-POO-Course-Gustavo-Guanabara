/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cursoemvideo.class06;

/**
 *
 * @author kevin
 */
public class RemoteControl implements Controller {
    private int volume;
    private boolean turnOn;
    private boolean playing;
    private int prevVolume;

    public RemoteControl() {
        this.volume = 50;
        this.turnOn = false;
        this.playing = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getTurnOn() {
        return turnOn;
    }

    public void setTurnOn(boolean turnOn) {
        this.turnOn = turnOn;
    }

    public boolean getPlaying() {
        return playing;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

    public int getPrevVolume() {
        return prevVolume;
    }

    public void setPrevVolume(int prevVolume) {
        this.prevVolume = prevVolume;
    }
    
    // Abstract Methods

    @Override
    public void turnOn() {
        this.setTurnOn(true);
    }

    @Override
    public void turnOff() {
        this.setTurnOn(false);
    }

    @Override
    public void openMenu() {
        
        if (this.getTurnOn()){
            System.out.println("----- MENU OPENED -----");
            System.out.println("Is it turned on? " + this.getTurnOn());
            System.out.println("Is it playing? " + this.getPlaying());
            System.out.println("Volume: " + this.getVolume());

            for(int i = 0; i <= this.getVolume(); i += 10){
                System.out.print("#");
            }
            System.out.println("");
        }
        else {
            System.out.print("ERROR: Cannot Open Menu, ");
            System.out.println("Turn the controller first");
        }
    }

    @Override
    public void closeMenu() {
        if (this.getTurnOn()){
            System.out.println("Closing Menu...");
        }
        else {
            System.out.print("ERROR: Cannot Close Menu, ");
            System.out.println("Turn the controller first");
        }
    }

    @Override
    public void moreVolume() {
        if (this.getTurnOn()) {
            if (this.getVolume() < 100){
                this.setVolume(this.getVolume() + 5);
            }
            else {
                System.out.println("ERROR: Max Volume Level Reached");
            }
        }
        else {
            System.out.print("ERROR: Cannot operate volume conditions, ");
            System.out.println("Turn the controller first");
        }
    }

    @Override
    public void lessVolume() {
        if (this.getTurnOn()) {
            if (this.getVolume() > 0){
                this.setVolume(this.getVolume() - 5);
            }
            else {
                System.out.println("ERROR: Min Volume Level Reached");
            }
        }
        else {
            System.out.print("ERROR: Cannot operate volume conditions, ");
            System.out.println("Turn the controller first");
        }
    }

    @Override
    public void muteOn() {
        if (this.getTurnOn() && this.getVolume() > 0) {
            this.setPrevVolume(this.getVolume());
            this.setVolume(0);
        }
        else {
            System.out.print("ERROR: Cannot operate volume conditions, ");
            System.out.println("Turn the controller first");
        }
    }

    @Override
    public void muteOff() {
        if (this.getTurnOn() && this.getVolume() == 0) {
            this.setVolume(this.getPrevVolume());
        }
        else {
            System.out.print("ERROR: Cannot operate volume conditions, ");
            System.out.println("Turn the controller first");
        }
    }

    @Override
    public void play() {
        if (this.getTurnOn() && !(this.getPlaying())) {
            this.setPlaying(true);
        }
        else {
            System.out.print("ERROR: Cannot play, ");
            System.out.println("Turn the controller first");
        }
    }

    @Override
    public void pause() {
        if (this.getTurnOn() && this.getPlaying()) {
            this.setPlaying(false);
        }
        else {
            System.out.print("ERROR: Cannot pause, ");
            System.out.println("Turn the controller first");
        }
    }
}