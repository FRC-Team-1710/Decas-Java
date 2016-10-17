package org.usfirst.frc.team1710.robot;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Lift extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
    	Robot.liftMotor.set(0);
    }
    
    public static void run(double speed) {
    	Robot.liftMotor.set(speed);
    }
    
    //if they put an encoder on this bot we could have created methods that raise to a specific level :^/
}

