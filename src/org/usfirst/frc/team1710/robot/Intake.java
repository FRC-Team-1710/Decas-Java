package org.usfirst.frc.team1710.robot;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Intake extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
    	Robot.intakeLeft.set(0);
    	Robot.intakeRight.set(0);
    }
    
    public static void run(double speed) {
		Robot.intakeLeft.set(speed);
		//negates the speed value going to right motor
		Robot.intakeRight.set(-speed);
    }
}

