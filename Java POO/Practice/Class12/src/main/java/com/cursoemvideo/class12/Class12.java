/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.cursoemvideo.class12;

/**
 *
 * @author DELL
 */
public class Class12 {

    public static void main(String[] args) {
        // Animal a = new Animal();  Cannot instantiate, class Animal is abstract
        
        Mammal ma = new Mammal();
        Reptile re = new Reptile();
        Fish fi = new Fish();
        Bird bi = new Bird();
        
        ma.feed();
        ma.move();
        ma.makeSound();
        
        System.out.println();
        re.feed();
        re.move();
        re.makeSound();
        
        System.out.println();
        fi.feed();
        fi.move();
        fi.makeSound();
        fi.makeBubbles();
        
        System.out.println();
        bi.feed();
        bi.move();
        bi.makeSound();
        bi.makeNest();
        
        // Specific classes
        
        Dog d = new Dog();
        
        System.out.println();
        d.feed();
        d.move();
        d.makeSound();
        d.buryBone();
        d.wagTail();
        
        Goldfish gf = new Goldfish();
        System.out.println();
        gf.feed();
        gf.move();
        gf.makeSound();
        gf.makeBubbles();
        
        Kangaroo k = new Kangaroo();
        System.out.println();
        k.feed();
        k.move();
        k.makeSound();
        k.usePouch();
        
        Parrot p = new Parrot();
        System.out.println();
        p.feed();
        p.move();
        p.makeSound();
        p.makeNest();
        
        Snake s = new Snake();
        System.out.println();
        s.feed();
        s.move();
        s.makeSound();
        
        Turtle t = new Turtle();
        System.out.println();
        t.feed();
        t.move();
        t.makeSound();
        t.hide();
    }
}
