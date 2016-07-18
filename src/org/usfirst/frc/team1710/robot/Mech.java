package org.usfirst.frc.team1710.robot;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Command;

public class Mech {
	
	//runs the lift
	public static void Lift(double speed) {
		Robot.liftMotor.set(speed);
	}
	
	//runs the intake
	public static void Intake(double speed) {
		Robot.intakeLeft.set(speed);
		//negates the speed value going to right motor
		Robot.intakeRight.set(-speed);
	}
}
