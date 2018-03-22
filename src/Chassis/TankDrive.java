package Chassis;

import MotorControllers.*;

public class TankDrive implements Chassis
{
	Drive Left, Right;
	
	public TankDrive(Drive Left, Drive Right)
	{
		this.Left = Left;
		this.Right = Right;
	}
	
	public void Forward(double value)
	{
		Left.drive(value);
		Right.drive(-value);
	}
	
	public void Turn(double value)
	{
		Left.drive(value);
		Right.drive(value);
	}
	
	public void Stop()
	{
		Left.drive(0);
		Right.drive(0);
	}
	
	public void drive(double lVal, double rVal)
	{
		Left.drive(lVal);
		Right.drive(rVal);
	}
}
