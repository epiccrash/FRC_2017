package org.usfirst.frc.team3062.robot.commands;

import org.usfirst.frc.team3062.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class CompressorCheck extends Command {
	
	boolean isOn;

		public CompressorCheck(){
			 requires( Robot.ramp );
			
		}
		
		// Called just before this Command runs the first time
	    protected void initialize() {
	    }
		
		protected void execute(){
			
			System.out.print("The compressor is being checked");
			
			//isOn = Robot.ramp.getClosedLoop();
			
			if(isOn == true){
				
			//	Robot.ramp.setSpike(true);
				
			}else if(isOn == false){
				
			//	Robot.ramp.setSpike(false);
				
			}
			
		}
	


	protected boolean isFinished() {
		// TODO Auto-generated method stub
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
