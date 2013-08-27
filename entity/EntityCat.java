package entity;


import java.io.IOException;

import org.lwjgl.opengl.GL11;
import org.newdawn.slick.Color;
import org.newdawn.slick.opengl.TextureLoader;
import org.newdawn.slick.util.ResourceLoader;




public class EntityCat extends Entity{
	
	public EntityCat(int x, int y){
		super(x,y);
	}
	
	 
	public void loadTexture(){
		
		try {
		
			texture = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("Resources/images/Cat.png"));
			
		}catch(IOException e){
			
			e.printStackTrace();
		}
	
	}
	
	
	
	public void render(){
		
		GL11.glClearColor(0f, 0f, 0f, 0f);
		GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);
		
		Color.white.bind();
		texture.bind();
		
		
		//create shape for image to sit on
		GL11.glBegin(GL11.GL_QUADS);
		
		GL11.glTexCoord2f(0,0);
		GL11.glVertex2f(x,y);
		GL11.glTexCoord2f(1,0);
		GL11.glVertex2f(x+texture.getTextureWidth(),y);
		GL11.glTexCoord2f(1,1);
		GL11.glVertex2f(x+texture.getTextureWidth(),y+texture.getTextureHeight());
		GL11.glTexCoord2f(0,1);
		GL11.glVertex2f(x,y+texture.getTextureHeight());
		
		GL11.glEnd();
		
	}
	
	public void moveToLeft(){
		if(x > 0){
			setPosition(this.x - 10, this.y);
		}
	}
	
	public void moveToRight(){
		if(x < 640 - this.getTexture().getImageWidth()){
			setPosition(this.x + 10, this.y);
		}
	}
	
	public void moveUp(){
		if(y > 0){
			setPosition(this.x, this.y - 10);
		}
	}
	
	public void moveDown(){
		if(y < 480 - this.getTexture().getImageHeight()){
			setPosition(this.x, this.y + 10);
		}
	}
	


}
