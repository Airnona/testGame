package com.testgdx;

/**
 * Created by Aniratak on 11/3/2016.
 */
public class Item {
    private float price; //Value when buying from shop. Selling should be this value * a modifier.
    private int ID;
    private String name, imageName, type; //Type means Weapons, Accessory, Armor, etc.

    public Item(float price, int ID, String name, String imageName, String type){
        this.price = price;
        this.ID = ID;
        this.name = name;
        this.imageName = imageName;
        this.type = type;
    }


    //Getter methods
    public float getPrice(){
        return this.price;
    }
    public int getID(){
        return this.ID;
    }
    public String getType(){
        return this.type;
    }
    public String getName(){
        return this.name;
    }
    public String getImageName(){
        return this.imageName;
    }

    //Setter methods
    public void setPrice(float newPrice){
        this.price = newPrice;
    }
    public void setID(int newID){
        this.ID = newID;
    }
    public void setType(String newType){
        this.type = newType;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public void setImageName(String newImageName){
        this.imageName = newImageName;
    }

}
