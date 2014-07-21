package com.tek.main;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

import com.tek.log.Logger;

public class Thalamus {

	private static Logger log = new Logger("Thalamus", true);
	
	public Thalamus(){
		initOpenGL();
		Thalamus.log("Initialized OpenGl");
	}
	
	/**
	 * Создает дисплей OpenGL
	 */
	private void initOpenGL() {
		try {
			Display.setDisplayMode(new DisplayMode(800, 600));
			Display.setTitle("Thalamus");
			Display.create();
		} catch (LWJGLException e) {
			Display.destroy();
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		new Thalamus();
	}
	
	public static void log(String logline){
		log.addLine(logline);
	}
	
}
