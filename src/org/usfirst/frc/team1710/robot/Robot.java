
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
    
    public static Victor liftMotor, intakeRight, intakeLeft;
    
    String autoSelected;
    SendableChooser chooser;
    
    RobotDrive myRobot;
    Joystick driveStick, mechStick;
    Button liftUpButton, liftDownButton;
	
    //runs as soon as you press "enable"
    public void robotInit() {
    	//opening a new 4 motor drive
        myRobot = new RobotDrive(1,0,3,2);
        
        //defines the usb ports for each controller
        driveStick = new Joystick(0);
        mechStick = new Joystick(1);
        
        //defines pwms for motors seperate from drive
        liftMotor = new Victor(4);
        intakeRight = new Victor(5);
        intakeLeft = new Victor(6);
        
        //inverts motors
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
    	double liftVal, intakeInVal, intakeOutVal;
    	
    	//left joystick
    	liftVal = mechStick.getRawAxis(4);
    	//left trigger
    	intakeInVal = mechStick.getRawAxis(3);
    	//right trigger
    	intakeOutVal = mechStick.getRawAxis(2);
    	
    	//getRawAxis takes axis number according to sheet
        myRobot.arcadeDrive(driveStick.getRawAxis(4)*-1, driveStick.getRawAxis(1)*-1);
        //runs the method "lift" in the mech class
        Mech.Lift(liftVal);
        //runs the method "intake" in the mech class
        Mech.Intake(intakeInVal -= intakeOutVal);
    }
    
    public void testPeriodic() {
    
    }
    
}
