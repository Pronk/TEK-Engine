package com.tek.graphics;

import java.util.ArrayList;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.newdawn.slick.opengl.Texture;

import com.tek.entities.Entity;

public class DrawDisplay {
	
	/**
	 * A list of entities to be drawn.
	 */
	private ArrayList<Entity> entities;

	/**
	 * The background to draw
	 */
	private Texture background;
	
	/**
	 * Creates a new display
	 * @param entities entities that will be drawn to display
	 */
	public DrawDisplay(ArrayList<Entity> entities, String displayname) {
		this.entities = entities;
		initOpenGL(displayname);
	}

	/**
	 * Создает дисплей OpenGL
	 */
	private void initOpenGL(String screenanme) {
		try {
			Display.setDisplayMode(new DisplayMode(800, 600));
			Display.setTitle(screenanme);
			Display.create();
		} catch (LWJGLException e) {
			Display.destroy();
			e.printStackTrace();
		}

	}

}
