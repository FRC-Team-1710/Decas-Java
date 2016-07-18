
package org.usfirst.frc.team1710.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.RobotDrive.MotorType;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


public class Robot extends IterativeRobot {
    final String defaultAuto = "Default";
    final String customAuto = "My Auto";
    
    public static Victor liftMotor;
    
    String autoSelected;
    SendableChooser chooser;
    
    RobotDrive myRobot;
    Joystick driveStick;
    Button liftUpButton, liftDownButton;
	
    public void robotInit() {
        myRobot = new RobotDrive(1,0,3,2);
        driveStick = new Joystick(0);
        liftMotor = new Victor(4);

        myRobot.setInvertedMotor(MotorType.kFrontLeft, true);
        myRobot.setInvertedMotor(MotorType.kRearLeft, true);
    }
    
    public void autonomousInit() {
    	autoSelected = (String) chooser.getSelected();
		System.out.println("Auto selected: " + autoSelected);
    }

    public void autonomousPeriodic() {
    	switch(autoSelected) {
    	case customAuto:
            break;
    	case defaultAuto:
    	default:
            break;
    	}
    }

    //looped
    public void teleopPeriodic() {
    	double liftUpVal, liftDownVal;
    	liftUpVal = driveStick.getRawAxis(3);
    	liftDownVal = driveStick.getRawAxis(2);
    	//getRawAxis takes axis number according to to sheet
        myRobot.arcadeDrive(driveStick.getRawAxis(4)*-1, driveStick.getRawAxis(1)*-1);
        Mech.Lift(liftUpVal -= liftDownVal);
    }
    
    public void testPeriodic() {
    
    }
    
}
