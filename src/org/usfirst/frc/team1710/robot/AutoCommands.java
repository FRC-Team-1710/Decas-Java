package org.usfirst.frc.team1710.robot;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutoCommands extends CommandGroup {
    
    public  AutoCommands() {
    	addSequential(new DriveStraight(1, 2));
    }
}
