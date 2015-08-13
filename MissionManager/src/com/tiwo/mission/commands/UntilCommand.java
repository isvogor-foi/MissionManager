package com.tiwo.mission.commands;

import hr.foi.tiwo.ObjDec;
import hr.foi.tiwo.objectdetection.events.ObjectDetectedListener;

public class UntilCommand extends Command implements ObjectDetectedListener{

	boolean isEnabled = false;
	
	@Override
	public String getName() {
		return "UNTIL";
	}

	@Override
	public String getSupportedCommads() {
		return null;
	}

	@Override
	public boolean execute() {
		System.out.println("Waiting for object detection...");
		isEnabled = true;
		//ObjDec.addListener(this);
		
		return false;
	}

	@Override
	public void ObjectDetected() {
		if(isEnabled){
			System.out.println("Waiting for object detection...");
		}
		
	}

}
