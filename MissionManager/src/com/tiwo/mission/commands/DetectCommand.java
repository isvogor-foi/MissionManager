package com.tiwo.mission.commands;

import hr.foi.tiwo.ObjDec;

import java.io.IOException;

import com.tiwo.communication.Serial;
import com.tiwo.mission.commands.enums.DetectCommands;

public class DetectCommand extends Command{

	private String line;
	
	public DetectCommand(String line) {
		this.line = line;
	}
	
	
	@Override
	public String getName() {
		return "DETECT";
	}

	@Override
	public String getSupportedCommads() {
		return DetectCommands.values().toString();
	}

	@Override
	public boolean execute() {
		String[] command = this.line.split("\\s+");
		if(command.length > 2){
			System.out.println("Movement command in wrong format!");
			return false;
		}		
		
		System.out.println("Movement ok, COMMAND: " + command[0] + ", PARAMETER: " + command[1].toString());
		
		if(Serial.getInstance().isConnected){
			ObjDec.setObjectToDetect(command[1]);
		}
		else{
			System.out.println("Serial is currently disconnected");
		}
		
		return true;
	}

}
