package com.tek.entities;

import java.util.ArrayList;

public class Entity {
	
	/**
	 * The list of entities to be interacted with
	 */
	protected ArrayList<Entity> interaction_pool;
	
	/**
	 * Variables for physics and collision checking
	 */
	protected float width,height,x,y,speed,direction, gravity;
	
	/**
	 * Creates a new entity that will interact with the other entities in the list
	 * @param interactpool the list of entities to be interacted with
	 */
	public Entity(ArrayList<Entity> interactpool){
		
	}
	
}
