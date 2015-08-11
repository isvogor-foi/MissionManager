package com.tiwo.mission.commands;

import com.tiwo.mission.commands.enums.MovementCommands;

public class MovementCommand extends Command{
	
	private String line;
	
	public MovementCommand(String line) {
		this.line = line;
	}
	
	@Override
	public String getName() {
		return "MOVEMENT";
	}
	
	@Override
	public String getSupportedCommads() {
		return MovementCommands.values().toString();
	}

	@Override
	public boolean execute() {
		String[] command = this.line.split("\\s+");
		if(command.length > 2){
			System.out.println("Movement command in wrong format!");
			return false;
		}		
		System.out.println("Movement ok, COMMAND: " + command[0] + ", PARAMETER: " + Float.parseFloat(command[1]));

		
		
		return true;
	}

}
