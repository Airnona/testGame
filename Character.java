package com.testgdx;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Touchable;

public class Character extends Actor {
	float health, mana, str, dex, inte, wis, luck, def, res, exp;
	float[] charArray = {health, mana, str, dex, inte, wis, luck, def, res, exp};
	Weapon weapon;
	String name = new String();
	String imageName = new String();
	Sprite sprite;
	
	public Character(String name, float health, float mana, float str, float dex,
			float inte, float wis, float luck, float def, float res, 
			float exp, String imageName){
		
		this.name = name;
		this.charArray[0] = health;
		this.charArray[1] = mana;
		this.charArray[2] = str;
		this.charArray[3] = dex;
		this.charArray[4] = inte;
		this.charArray[5] = wis;
		this.charArray[6] = luck;
		this.charArray[7] = def;
		this.charArray[8] = res;
		this.charArray[9] = exp;	
		
		sprite = new Sprite(new Texture(Gdx.files.internal(imageName)));
		setBounds(sprite.getX(), sprite.getY(), sprite.getWidth(), sprite.getHeight());
		setTouchable(Touchable.enabled);
		
	}


	public void setWeapon(Weapon weapon){
		this.weapon = weapon;
	}
	public void printOut(){
		System.out.println(this.name);
		for(int i = 0; i < 10; i++){
			System.out.println(this.charArray[i]);
		System.out.println(this.imageName);	
		}
	}
	public void draw(Batch batch, float parentAlpha) {
		sprite.draw(batch);
	}
	
	
	
}
