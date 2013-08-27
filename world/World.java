package world;

import java.util.ArrayList;

import entity.Entity;

public class World {
	public ArrayList<Entity> entities;
	
	public World() {
		
	}
	
	public ArrayList<Entity> getEntities() {
		return entities;
	}
	
	public void addToEntityList(Entity entity) {
		entities.add(entity);
	}
	
	public void checkCollisions() {
		for (Entity i : entities) {
			
		}
	}
}
