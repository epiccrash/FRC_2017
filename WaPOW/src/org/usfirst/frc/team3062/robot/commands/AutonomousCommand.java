package org.usfirst.frc.team3062.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team3062.robot.Robot;
import org.usfirst.frc.team3062.robot.subsystems.Chassis;


public class AutonomousCommand extends Command {

	public void AutonomousCommand(){
		
	}
	
	public void AutonomousCommand(int i){
		
		if(i < -1 || i > 1){
			
		}
	}
	
	@Override
	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}
