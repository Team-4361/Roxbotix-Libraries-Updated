package Chassis;

public interface Chassis
{
	public void Forward(double value);
	public void Turn(double value);
	public void drive(double lVal, double rVal);
	
	public void Stop();
	
	//public void Straight(double value, double RotationCorrection);
}
