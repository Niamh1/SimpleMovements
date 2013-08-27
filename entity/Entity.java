package entity;

import org.newdawn.slick.opengl.Texture;

public class Entity {
	
	public Texture texture;
	public int x;
	public int y;
	
	public Entity(int x, int y){
		this.x = x;
		this.y = y;
		
	}
	
	public Texture getTexture(){
		return this.texture;
	}
	
	public int getX(){
		return this.x;
	}
	
	public int getY(){
		return this.y;
	}
	
	public void setPosition(int newX, int newY){
		this.x = newX;
		this.y = newY;
	}
	
	public void loadTexture(){
		
	}
}
