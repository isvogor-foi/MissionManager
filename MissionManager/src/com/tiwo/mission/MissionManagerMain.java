package com.tiwo.mission;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/*
 * Commands
 * 
 * START - initialize missions
 * FORWARD | BACKWARD X - go forward or backward for X meters 
 * LEFT | RIGHT X - rotate for X degrees
 * GO (FORWARD | BACKWARD | LEFT | RIGHT) - go in the direction forever
 * UNTIL X - stop every movement when an event happens (X is an ennumeration of possible events)
 * DETECT
 * STOP - stops all movement
 * 
 * E.G.
 * 
 * START
 * FORWARD 2.3
 * RIGHT 30
 * DETECT LEFT_ARROW
 * 
 * GO FORWARD
 * 	UNTIL OBJECT_DETECTED
 * 
 * STOP
 * 
 */

public class MissionManagerMain {
	
	public MissionManagerMain(){
		System.out.println("Mission manager initialized...");
		LoadMissionFile("/home/ivan/Dev/java/workspace/MissionManager/src/com/tiwo/missions/demo.mis");
	}
	
	public void LoadMissionFile(String filename){
		File file = new File(filename);
		
		Parser p = new Parser();
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		    	if(!line.trim().startsWith("#")){
		    		line = line.trim();
		    		p.parse(line);	
		    	}
		    }
		} catch (Exception ex){
			System.out.println("File reading error: " + ex.getMessage());
			 
		}
		
		p.ExecuteProgram();
		
	}
	

}
