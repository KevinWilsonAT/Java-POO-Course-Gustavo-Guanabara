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
        // Animal a = new Animal();  Cannot instantiate since Animal is an Abstract Class

        // Animal types

        Bird b = new Bird();
        System.out.println("\nAnimal: Bird");
        b.setWeight(4f);
        b.setAge(1);
        b.setMembers(4);
        b.setFeatherColor("Black");
        System.out.println(b.toString());
        System.out.println(b.getFeatherColor());
        b.move();
        b.feed();
        b.makeSound();
        b.makeNest();
        
        Mammal m = new Mammal();
        System.out.println("\nAnimal: Mammal");
        m.setWeight(4f);
        m.setAge(1);
        m.setMembers(4);
        m.setFurColor("Black");
        System.out.println(m.toString());
        System.out.println(m.getFurColor());
        m.move();
        m.feed();
        m.makeSound();
        
        Fish f = new Fish();
        System.out.println("\nAnimal: Fish");
        f.setWeight(1f);
        f.setAge(1);
        f.setMembers(5);
        f.setScaleColor("Blue");
        System.out.println(f.toString());
        System.out.println(f.getScaleColor());
        f.move();
        f.feed();
        f.makeSound();
        f.makeBubbles();
        
        Reptile r = new Reptile();
        System.out.println("\nAnimal: Reptile");
        r.setWeight(4f);
        r.setAge(1);
        r.setMembers(4);
        r.setScaleColor("Brown");
        System.out.println(r.toString());
        System.out.println(r.getScaleColor());
        r.move();
        r.feed();
        r.makeSound();
        
        //Animal Species
        
        Dog d = new Dog();
        System.out.println("\nAnimal: Mammal / Species: Dog");
        d.setWeight(4f);
        d.setAge(1);
        d.setMembers(4);
        d.setFurColor("Black");
        System.out.println(d.toString());
        System.out.println(d.getFurColor());
        d.move();
        d.feed();
        d.makeSound();
        d.buryBone();
        d.wagTail();
        
        Goldfish g = new Goldfish();
        System.out.println("\nAnimal: Fish / Species: Goldfish");
        g.setWeight(1f);
        g.setAge(1);
        g.setMembers(5);
        g.setScaleColor("Blue");
        System.out.println(g.toString());
        System.out.println(g.getScaleColor());
        g.move();
        g.feed();
        g.makeSound();
        g.makeBubbles();
        
        Kangaroo k = new Kangaroo();
        System.out.println("\nAnimal: Mammal / Species: Kangaroo");
        k.setWeight(6f);
        k.setAge(1);
        k.setMembers(4);
        k.setFurColor("Brown");
        System.out.println(k.toString());
        System.out.println(k.getFurColor());
        k.move();
        k.feed();
        k.makeSound();
        k.usePouch();
        
        Parrot p = new Parrot();
        System.out.println("\nAnimal: Bird / Species: Parrot");
        p.setWeight(2f);
        p.setAge(1);
        p.setMembers(4);
        p.setFeatherColor("Green");
        System.out.println(p.toString());
        System.out.println(p.getFeatherColor());
        p.move();
        p.feed();
        p.makeSound();
        p.makeNest();
        
        Snake s = new Snake();
        System.out.println("\nAnimal: Reptile / Species: Snake");
        s.setWeight(2f);
        s.setAge(1);
        s.setMembers(0);
        s.setScaleColor("Black");
        System.out.println(s.toString());
        System.out.println(s.getScaleColor());
        s.move();
        s.feed();
        s.makeSound();
        
        Turtle t = new Turtle();
        System.out.println("\nAnimal: Reptile / Species: Turtle");
        t.setWeight(2f);
        t.setAge(15);
        t.setMembers(4);
        t.setScaleColor("Brown");
        System.out.println(t.toString());
        System.out.println(t.getScaleColor());
        t.move();
        t.feed();
        t.makeSound();
        t.hide();
    }
}
