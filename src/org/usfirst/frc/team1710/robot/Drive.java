package org.usfirst.frc.team1710.robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drive extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public static void driveTwoSecs() {
    	for(int i = 0; i < 4; i++) {
    		Robot.myRobot.arcadeDrive(0.69, 0);
    		Timer.delay(0.5);
    	}
    }
}

