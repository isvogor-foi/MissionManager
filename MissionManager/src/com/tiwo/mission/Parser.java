package com.tiwo.mission;

import java.util.LinkedList;
import java.util.Queue;

import com.tiwo.mission.commands.Command;
import com.tiwo.mission.commands.DetectCommand;
import com.tiwo.mission.commands.GoCommand;
import com.tiwo.mission.commands.MovementCommand;
import com.tiwo.mission.commands.RotationCommand;
import com.tiwo.mission.commands.UntilCommand;
import com.tiwo.mission.commands.enums.DetectCommands;
import com.tiwo.mission.commands.enums.GoCommands;
import com.tiwo.mission.commands.enums.MovementCommands;
import com.tiwo.mission.commands.enums.RotationCommands;
import com.tiwo.mission.commands.enums.UntilCommands;

public class Parser {
	
	private Queue<Command> program;
	
	public Parser(){
		program = new LinkedList<Command>();
	}
	
	public void parse(String line){	
				
		// START
		if(line == "START") {

		}
		
		if(line == "STOP") {
			// dispatch command to stop all the movement
		}

		// Handle movement
		for (MovementCommands currentCommand : MovementCommands.values()) {
			if(line.startsWith(currentCommand.toString())){
				MovementCommand m = new MovementCommand(line);
				program.add(m);
			}
		}
		
		// Handle rotation
		for(RotationCommands currentCommand : RotationCommands.values()){
			if(line.startsWith(currentCommand.toString())){
				RotationCommand r = new RotationCommand();
				program.add(r);
			}
		}
		
		// Handle "Go"
		for(GoCommands currentCommand : GoCommands.values()){
			if(line.startsWith(currentCommand.toString())){
				GoCommand g = new GoCommand();
				program.add(g);
			}
		}
		
		// Handle "Until"
		for(UntilCommands currentCommand : UntilCommands.values()){
			if(line.startsWith(currentCommand.toString())){
				UntilCommand u = new UntilCommand();
				program.add(u);
			}
		}
		
		// Handle "Detect"
		for(DetectCommands currentCommand : DetectCommands.values()){
			if(line.startsWith(currentCommand.toString())){
				DetectCommand d = new DetectCommand();
				program.add(d);
			}
		}
	}
	
	public void ExecuteProgram(){
		for (Command command : this.program) {
			System.out.println("Executiong: " + command.getName());
			command.execute();
		}
	}
	
}
