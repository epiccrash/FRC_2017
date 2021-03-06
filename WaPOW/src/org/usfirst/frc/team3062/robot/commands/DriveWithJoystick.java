package org.usfirst.frc.team3062.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team3062.robot.Robot;
import org.usfirst.frc.team3062.robot.subsystems.Chassis;

/**
 *
 */
public class DriveWithJoystick extends Command {

    public DriveWithJoystick() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	double leftSpeed = Robot.oi.getLeftSpeed();
    	double rightSpeed = Robot.oi.getRightSpeed();
    	if(leftSpeed > .1 || leftSpeed < -.1){
    		leftSpeed = 0;
    	}
    	
    	if(rightSpeed > .1 || rightSpeed < -.1){
    		rightSpeed = 0;
    	}
    	
    	Robot.chassis.driveWithJoystick( leftSpeed, rightSpeed );
    	
    	SmartDashboard.putNumber("Left Speed", Robot.chassis.getLeftEncoder());
    	SmartDashboard.putNumber("Right Speed", Robot.chassis.getRightEncoder());
    	
    	
    	
    }    
    
   

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
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
