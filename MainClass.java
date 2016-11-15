package com.testgdx;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

import java.util.ArrayList;

public class MainClass extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Stage stage;
	
	@Override
	public void create () {
		ScreenViewport viewport = new ScreenViewport();
		stage = new Stage(viewport);
		Gdx.input.setInputProcessor(stage);

		ArrayList<Weapon> weaponList = new ArrayList<Weapon>();
		weaponList = Extras.createWeaponList();

		Weapon testWeapon = new Weapon(100, 100, 1000, 001, "First weapon", "Test imagename", "Long Sword");



		Group groupAllyChar = new Group();
		groupAllyChar = Extras.testAllyGroup();
		Group groupEnemyChar = new Group();
		groupEnemyChar = Extras.testEnemyGroup();
		Group groupBG = new Group();
		groupBG = Extras.testBGGroup();
		
		stage.addActor(groupBG);
		stage.addActor(groupAllyChar);
		stage.addActor(groupEnemyChar);
		//batch = new SpriteBatch();
		//img = new Texture("ForestTest.png");
	}

	@Override
	public void render () {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		stage.act(Gdx.graphics.getDeltaTime());
		stage.draw();
		
		
		//batch.begin();
		//batch.draw(img, 0, 0);
		//batch.end();
	}
	
	@Override
	public void dispose () {
		
	}
}
