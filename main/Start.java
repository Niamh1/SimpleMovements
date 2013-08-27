package main;



import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;

import entity.EntityCat;
import frame.InitFrame;

public class Start {
		
		public static void main(String args[]){
				
			InitFrame.frame(); //create frame
			
			EntityCat cat = new EntityCat(0,0); //create cat
			cat.loadTexture();
			cat.render();
			
			
			while(!Display.isCloseRequested()){ //game loop
				
				Display.update();
				Display.setVSyncEnabled(true);
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
				
				}
			
			Display.destroy();
			System.exit(0);
		}
		

}
