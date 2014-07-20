package com.thalamus.main;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public class Thalamus {

	public Thalamus(){
		initOpenGL();
	}
	
	private void initOpenGL() {
		try {
			Display.setDisplayMode(new DisplayMode(800, 600));
			Display.setTitle("Thalamus");
			Display.create();
			while(!Display.isCloseRequested()){
				Display.update();
				
			}
			Display.destroy();
		} catch (LWJGLException e) {
			Display.destroy();
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		new Thalamus();
	}
	
}
