package com.ymlsi.aif.controller;

import com.ymlsi.aif.ui.Face;

public class Controller {

	public static void main(String[] args) {
		Face face=new Face();
		face.printFacePixels();
		
		com.ymlsi.aif.db.Face face2=new com.ymlsi.aif.db.Face();
		face2.saveFacePixelOnDb();
		
		
	}
}
