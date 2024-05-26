/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cursoemvideo.youtubeproject;

/**
 *
 * @author DELL
 */
public class Visualization {
    private Pupil spectator;
    private Video movie;

    public Visualization(Pupil spectator, Video movie) {
        this.spectator = spectator;
        this.movie = movie;
        this.spectator.setTotWatched(this.spectator.getTotWatched() + 1);
        this.movie.setViews(this.movie.getViews() + 1);
    }
    
    public void review() {
        this.movie.setReview(5);
    }
    
    public void review(int rank) {
        this.movie.setReview(rank);
    }
    
    public void review(float porc) {
        int tot = 0;
        if(porc <= 20){
            tot = 3;
        }
        else if(porc <= 50){
            tot = 5;
        }
        else if(porc <= 90){
            tot = 8;
        }
        else{
            tot = 10;
        }
        
        this.movie.setReview(tot);
    }
    
    public Pupil getSpectator() {
        return spectator;
    }

    public void setSpectator(Pupil spectator) {
        this.spectator = spectator;
    }

    public Video getMovie() {
        return movie;
    }

    public void setMovie(Video movie) {
        this.movie = movie;
    }

    @Override
    public String toString() {
        return "Visualization{\n" + "   spectator:\n" + spectator +
                "\n   movie:\n" + movie + "\n}";
    }
    
}
