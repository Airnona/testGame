package com.testgdx;

/**
 * Created by Aniratak on 11/3/2016.
 */
public class Weapon extends Item{
    private float pAttack;
    private float mAttack;

    public Weapon(float pAttack, float mAttack, float price, int ID, String name, String imageName, String type){
        super(price, ID, name, imageName, type);
        this.pAttack = pAttack;
        this.mAttack = mAttack;
    }

    public void printCharacteristics(){
        System.out.println(this.mAttack);
        System.out.println(this.pAttack);
        System.out.println(getID());
        System.out.println(getImageName());
        System.out.println(getName());
        System.out.println(getPrice());
        System.out.println(getType());
    }

}
