package org.usfirst.frc.team3062.robot.subsystems;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Cradle extends Subsystem {

	private Servo cradleServo;
	private boolean active;
	private double loadAngle;
	
	public Cradle(){
		
		cradleServo = new Servo(1);
		
		//loadAngle 
		
	}

	public void shoot(){
		
		active = true;
		
		
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
}
