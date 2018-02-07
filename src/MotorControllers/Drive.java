package MotorControllers;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

public class Drive
{
	WPI_TalonSRX[] CAN;
	
	static WPI_TalonSRX[] FullCAN;
	
	public Drive(WPI_TalonSRX[] CAN)
	{
		this.CAN = CAN;
	}
	
	public Drive(int[] nums)
	{
		CAN = new WPI_TalonSRX[nums.length];
		for(int i = 0; i < nums.length; i++)
		{
			CAN[i] = FullCAN[nums[i]];
		}
	}
	
	public void drive(double val)
	{
		for (WPI_TalonSRX tal : CAN)
		{
			tal.set(val);
		}
	}
	
	public static void SetFullCAN(WPI_TalonSRX[] CAN)
	{
		FullCAN = CAN;
	}
}