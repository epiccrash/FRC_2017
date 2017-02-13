package org.usfirst.frc.team3062.robot.commands;
import org.usfirst.frc.team3062.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class RetractRamp extends Command {

	public RetractRamp(){
	
			requires(Robot.chassis);
			requires(Robot.ramp);
	}
	
		protected void initialize() {
	    }

	    // Called repeatedly when this Command is scheduled to run
	    protected void execute() {	 
	    		
	    		Robot.ramp.extend();
	    		
	    		//this.cancel();
	    	
	    	//Timer.delay(.5);
	    	
	    	//Robot.ramp.retract();
	    	System.out.println("The cylinder retracted");
	    	
	    	//Because this returns true the command will end after one iteration
	    	this.isFinished();
	    	
	    	this.end();
	    	
	    	
	    	
	    }

	    // Make this return true when this Command no longer needs to run execute()
	    protected boolean isFinished() {
	        return true;
	    }

	    // Called once after isFinished returns true
	    protected void end() {
	    }

	    // Called when another command which requires one or more of the same
	    // subsystems is scheduled to run
	    protected void interrupted() {
	    }


		

	}


