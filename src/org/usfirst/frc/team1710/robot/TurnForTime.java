package org.usfirst.frc.team1710.robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class TurnForTime extends Command {
	double botSpeed;
	double botTime;
	int count = 0;
	boolean done;
    public TurnForTime(double turnSpeed, double turnTime) {
    	botSpeed = turnSpeed;
    	botTime = turnTime;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(count < (botTime*1000)/20) {
        	//for some reason the arcade drive params are backwards. so moveVal is rotation and vice versa.
    		Robot.myRobot.arcadeDrive(botSpeed, 0);
    		count++;
    		System.out.println("hey");
    	} else {
    		done = true;
    		count = 0;
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if(done) {
    		return true;
    	} else {
    		return false;
    	}
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
