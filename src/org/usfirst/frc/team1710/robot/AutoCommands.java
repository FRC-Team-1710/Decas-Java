package org.usfirst.frc.team1710.robot;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutoCommands extends CommandGroup {
    
    public  AutoCommands() {
    	//DriveStraight(speed, time (in seconds))
    	addSequential(new DriveStraight(0.5, 5));
    }
}
