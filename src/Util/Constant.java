package Util;

public class Constant {
	private String Name;
	private String Value;
	
	public Constant(String Name, String Value)
	{
		this.Name = Name;
		this.Value = Value;
	}
	
	public String getName()
	{
		return Name;
	}
	
	public String getValue()
	{
		return Value;
	}
}