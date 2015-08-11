package com.tiwo.mission.commands;

import com.tiwo.mission.commands.enums.DetectCommands;

public class DetectCommand extends Command{

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
		// TODO Auto-generated method stub
		return false;
	}

}
