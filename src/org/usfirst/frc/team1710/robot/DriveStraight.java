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
    	if(count < (((driveTime*1000))*20)) {
    		Robot.myRobot.arcadeDrive(botSpeed, 0);
    		count++;
    	} else {
    		done = true;
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
