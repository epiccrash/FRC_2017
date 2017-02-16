package org.usfirst.frc.team3062.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Relay.Direction;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Catapult extends Subsystem {
	
	private DoubleSolenoid catapult;
	
	private Compressor pSwitch;
	
	private Relay spike;
	
	public Catapult(){
		
		catapult  = new DoubleSolenoid(0,1);
		catapult.set(DoubleSolenoid.Value.kForward);
		
		//int t = 0;
		
		/*
		while(t < 5){
		catapult.set(DoubleSolenoid.Value.kReverse);
		Timer.delay(1);
		catapult.set(DoubleSolenoid.Value.kForward);
		Timer.delay(1);
		t++;
		}
		*/
		
		//pSwitch = new Compressor(0);
		//pSwitch.setClosedLoopControl(true);
		
		//spike = new Relay(0, Direction.kForward);
		
		//while(pSwitch.getClosedLoopControl() == true){
			
		//	spike.setDirection(Direction.kForward);
		//}
		
		//spike.stopMotor();
		
		
		
		
		
		
	}
	
	public void extend(){
		
		catapult.set(DoubleSolenoid.Value.kForward);
	}
    
	
	public void retract(){
		
		catapult.set(DoubleSolenoid.Value.kReverse);
	}
  
	
	// Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
   // public boolean getClosedLoop(){
   // 	
  // 	return pSwitch.getClosedLoopControl();
   // }

	//public void setSpike(boolean b) {
		// TODO Auto-generated method stub
		
	//	if(b == true){
	//		spike.setDirection(Direction.kForward);
			
	//	}else if( b == true){
			
	//		spike.stopMotor();
	//	}
			
		
		
	//}

    
    
}