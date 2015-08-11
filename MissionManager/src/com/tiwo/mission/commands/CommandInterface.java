package com.tiwo.mission.commands;

public interface CommandInterface {

	public String getName();
	public String getSupportedCommads();
	public boolean execute();
	
}
