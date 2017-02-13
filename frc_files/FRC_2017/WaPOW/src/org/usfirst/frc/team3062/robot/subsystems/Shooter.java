package org.usfirst.frc.team3062.robot.subsystems;


//import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Shooter extends Subsystem {
	
	//private CANTalon rightshooter; 
	//private CANTalon leftshooter;
	private double speed;
	private boolean active;

	public Shooter(){
		speed = 0;
		//rightshooter = new CANTalon(1);
		//leftshooter = new CANTalon(2);
		active = false;
	}

	public void setSpeed(double s){
		
		speed = s;
		
		if (active){
			
			//rightshooter.set(speed);
			//leftshooter.set(-speed);
			
		}
		
		
	}
	
	public void start(){
		
		active = true;
		
		//rightshooter.set(speed);
		//leftshooter.set(-speed);
	}
	
	public void stop(){
		
		active = false;
		
		//rightshooter.set(0);
		//leftshooter.set(0);
	}
	
	
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
	}



}
