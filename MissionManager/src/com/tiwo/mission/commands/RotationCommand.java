package com.tiwo.mission.commands;

import com.tiwo.mission.commands.enums.RotationCommands;

public class RotationCommand extends Command{

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
		// TODO Auto-generated method stub
		return false;
	}

}
