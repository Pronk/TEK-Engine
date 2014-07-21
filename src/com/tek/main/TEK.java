package com.tek.main;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

import com.tek.log.Logger;

public class TEK {

	private static Logger log = new Logger("Thalamus", true);
	
	public TEK(String screenanme){
		initOpenGL(screenanme);
		TEK.log("Initialized OpenGl");
	}
	
	/**
	 * Создает дисплей OpenGL
	 */
	private void initOpenGL(String screenanme) {
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
		new TEK("TEK");
	}
	
	public static void log(String logline){
		log.addLine(logline);
	}
	
}
