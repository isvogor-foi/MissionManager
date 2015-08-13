package com.tiwo.mission.commands;

import java.io.IOException;

import com.tiwo.communication.Serial;
import com.tiwo.mission.commands.enums.RotationCommands;

public class RotationCommand extends Command{

	private String line;
	
	public RotationCommand(String line) {
		this.line = line;
	}
	
	@Override
	public String getName() {
		return "ROTATE";
	}

	@Override
	public String getSupportedCommads() {
		return RotationCommands.values().toString();
	}

	@Override
	public boolean execute() {
		String[] command = this.line.split("\\s+");
		if(command.length > 2){
			System.out.println("Movement command in wrong format!");
			return false;
		}		
		
		System.out.println("Movement ok, COMMAND: " + command[0] + ", PARAMETER: " + Float.parseFloat(command[1]));
		if(Serial.getInstance().isConnected){
			Serial.getInstance().sendMessage(command[0]);
			// add timing ...
		}
		else{
			System.out.println("Serial is currently disconnected");
		}
		
		return true;
	}

}
