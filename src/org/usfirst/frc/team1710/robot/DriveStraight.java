package org.usfirst.frc.team1710.robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveStraight extends Command {
	
	double botSpeed, driveTime;
	double currentTime;
	int count = 0;
	boolean done;
    public DriveStraight(double speed, double time) {
    	requires(new Drive());
    	driveTime = time;
    	botSpeed = speed;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    // Runs every 20ms
    protected void execute() {
    	//driveTime is in seconds so this converts it to milliseconds, the divides it by 20 bc execute loops every 20ms
    	//every time it loops the count variable increases
    	if(count < (driveTime*1000)/20) {
        	//for some reason the arcade drive params are backwards. so moveVal is rotation and vice versa.
    		Robot.myRobot.arcadeDrive(0, botSpeed);
    		count++;
    	} else {
    		done = true;
    		count = 0;
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if (done) {
    		return true;
    	}
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
