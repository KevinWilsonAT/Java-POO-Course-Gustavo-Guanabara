/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.cursoemvideo.youtubeproject;

/**
 *
 * @author DELL
 */
public class YoutubeProject {

    public static void main(String[] args) {
        Video v[] = new Video[3];
        
        v[0] = new Video("OOP Class #1");
        v[1] = new Video("PHP Class #12");
        v[2] = new Video("HTML5 Class #10");
        
        Pupil p[] = new Pupil[2];
        
        p[0] = new Pupil("Jubilee", 22, "F", "Juby");
        p[1] = new Pupil("Creuse", 12, "F", "Crew");
        
        Visualization vs[] = new Visualization[5];
        System.out.println("VISUALIZATIONS\n----------------------------");
        vs[0] = new Visualization(p[0], v[2]);
        vs[0].review();
        System.out.println(vs[0].toString());
        
        vs[1] = new Visualization(p[0], v[1]);
        vs[1].review(35.0f);
        System.out.println(vs[1].toString());
    }
}
