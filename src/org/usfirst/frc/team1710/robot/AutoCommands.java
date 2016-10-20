package org.usfirst.frc.team1710.robot;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutoCommands extends CommandGroup {
    
    public  AutoCommands() {
//  	DriveStraight(speed (double value from 0 to 1), time (in seconds))
    	addSequential(new DriveForTime(0.5, 2));
//		looking at the robot from the back, a positive val makes it turn left, neg turns right
    	addSequential(new TurnForTime(0.5, 0.8));
    	
    }
}
