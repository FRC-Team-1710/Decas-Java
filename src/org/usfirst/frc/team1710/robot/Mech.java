package org.usfirst.frc.team1710.robot;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Command;

public class Mech {
	
	
	public static void Lift(double speed) {
		Robot.liftMotor.set(speed);
	}
}
