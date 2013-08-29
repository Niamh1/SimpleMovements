package world;

import java.util.ArrayList;

import entity.Entity;

public class World {
	public static ArrayList<Entity> entities;
	
	public static ArrayList<Entity> getEntities() {
		return entities;
	}
	
	public static void addToEntityList(Entity entity) {
		entities.add(entity);
	}
	
	@Deprecated
	public void checkCollisions() {
		for (Entity i : entities) {
			System.out.println(i.getX());
		}
	}
}
