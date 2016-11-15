package com.testgdx;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Touchable;

public class BattleBG extends Actor{
	String imageName = new String();
	Sprite sprite;
	
	
	public BattleBG(String imageName){
		sprite = new Sprite(new Texture(Gdx.files.internal(imageName)));
		setBounds(sprite.getX(), sprite.getY(), sprite.getWidth(), sprite.getHeight());
		setTouchable(Touchable.enabled);
	}
	public void draw(Batch batch, float parentAlpha) {
		sprite.draw(batch);
	}
}
