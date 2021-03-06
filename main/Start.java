package main;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;

import entity.EntityCat;
import frame.InitFrame;

public class Start {

	public static EntityCat cat;
		
	public static void main(String[] args){
		InitFrame.frame(); //create frame
					
		cat = new EntityCat(0,0); //create cat
		cat.loadTexture();
		cat.render();

		Display.setVSyncEnabled(true);
		while(!Display.isCloseRequested()){ //game loop
			gameLoop();
		}
		
		Display.destroy();
		System.exit(0);
	}
	
	public static void gameLoop() {	
		Display.update();
		cat.render();
		
		if (Keyboard.isKeyDown(Keyboard.KEY_LEFT)) {
			cat.moveToLeft();
		}
		if (Keyboard.isKeyDown(Keyboard.KEY_RIGHT)) {
			cat.moveToRight();
		}
		if (Keyboard.isKeyDown(Keyboard.KEY_UP)) {
			cat.moveUp();
		}
		if (Keyboard.isKeyDown(Keyboard.KEY_DOWN)) {
			cat.moveDown();
		}
		if (Keyboard.isKeyDown(Keyboard.KEY_SPACE)) {
			System.out.println("Cat: " + cat.getX() + " : " + cat.getY());
		}
	}
}
