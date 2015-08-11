package com.tiwo.mission.commands;

import com.tiwo.mission.commands.enums.GoCommands;

public class GoCommand extends Command{

	@Override
	public String getName() {
		return "GO";
	}

	@Override
	public String getSupportedCommads() {
		return GoCommands.values().toString();
	}

	@Override
	public boolean execute() {
		// TODO Auto-generated method stub
		return false;
	}

}
