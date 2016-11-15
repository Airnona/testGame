package com.testgdx;

import com.badlogic.gdx.scenes.scene2d.Group;

import java.util.ArrayList;

public class Extras {
	
	public static Group testAllyGroup(){
		//Create each Character ( This should be done somewhere else I think
		Character test1 = new Character("John", 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, "Characters/TestCharacter2.png");
		Character test2 = new Character("John", 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, "Characters/TestCharacter2.png");
		Character test3 = new Character("John", 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, "Characters/TestCharacter2.png");
		Character test4 = new Character("John", 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, "Characters/TestCharacter2.png");
		Character test5 = new Character("John", 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, "Characters/TestCharacter2.png");
		Character test6 = new Character("John", 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, "Characters/TestCharacter2.png");


		//Set sprite locations
		test1.sprite.setX(Statics.allyxpos1);
		test1.sprite.setY(Statics.allyypos1);
		test2.sprite.setX(Statics.allyxpos2);
		test2.sprite.setY(Statics.allyypos2);
		test3.sprite.setX(Statics.allyxpos3);
		test3.sprite.setY(Statics.allyypos3);
		test4.sprite.setX(Statics.allyxpos4);
		test4.sprite.setY(Statics.allyypos4);
		test5.sprite.setX(Statics.allyxpos5);
		test5.sprite.setY(Statics.allyypos5);
		test6.sprite.setX(Statics.allyxpos6);
		test6.sprite.setY(Statics.allyypos6);
		
		//Add to group
		Group group = new Group();
		group.addActor(test1);
		group.addActor(test2);
		group.addActor(test3);
		group.addActor(test4);
		group.addActor(test5);
		group.addActor(test6);
		
		return group;
	}
	public static Group testEnemyGroup(){
		Character test7 = new Character("John", 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, "Characters/TestCharacter5.png");
		Character test8 = new Character("John", 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, "Characters/TestCharacter5.png");
		Character test9 = new Character("John", 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, "Characters/TestCharacter5.png");
		Character test10 = new Character("John", 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, "Characters/TestCharacter5.png");
		Character test11 = new Character("John", 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, "Characters/TestCharacter5.png");
		Character test12 = new Character("John", 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, "Characters/TestCharacter5.png");
	
		//Set locations
		test7.sprite.setX(Statics.enemyxpos1);
		test7.sprite.setY(Statics.enemyypos1);
		test8.sprite.setX(Statics.enemyxpos2);
		test8.sprite.setY(Statics.enemyypos2);
		test9.sprite.setX(Statics.enemyxpos3);
		test9.sprite.setY(Statics.enemyypos3);
		test10.sprite.setX(Statics.enemyxpos4);
		test10.sprite.setY(Statics.enemyypos4);
		test11.sprite.setX(Statics.enemyxpos5);
		test11.sprite.setY(Statics.enemyypos5);
		test12.sprite.setX(Statics.enemyxpos6);
		test12.sprite.setY(Statics.enemyypos6);
		
		//Add to group
		Group group = new Group();
		group.addActor(test7);
		group.addActor(test8);
		group.addActor(test9);
		group.addActor(test10);
		group.addActor(test11);
		group.addActor(test12);
		
		return group;
		
	}
	public static Group testBGGroup(){
		BattleBG main = new BattleBG("BGs/ForestTest.png");
		
		
		Group group = new Group();
		group.addActor(main);
		return group;
	}
	public static ArrayList<Weapon> createWeaponList(){
		ArrayList<Weapon> weaponList = new ArrayList<Weapon>();
		Weapon first = new Weapon(10, 0, 5, 001, "Stick", "StickImageTest", "Short sword");
		weaponList.add(first);

		return weaponList;
	}
	
}
//test