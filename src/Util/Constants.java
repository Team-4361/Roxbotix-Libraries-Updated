package Util;
import java.io.*;
import java.util.ArrayList;

public class Constants extends ArrayList<Constant>
{
	private static final String PathFile = "/Constants.file";
	
	public void LoadConstants()
	{
		this.clear();
		
		FileReader ConstFile;
		try
		{
			ConstFile = new FileReader(PathFile);
		}
		catch (FileNotFoundException ee)
		{
			return;
		}
		
		BufferedReader Reader = new BufferedReader(ConstFile);
		
		try
		{
			String line;
			while((line = Reader.readLine()) != null)
			{
				String[] temp = line.split("=");
				Constant TempConst = new Constant(temp[0], temp[1]);
				this.add(TempConst);
			} 

			Reader.close();
		}
		catch (Exception ee)
		{
			
		}
	}
	
	public int GetInt(String name)
	{
		for(Constant c : this)
		{
			if(c.getName().equals(name))
			{
				return Integer.parseInt(c.getValue());
			}
		}
		return 0;
	}
	
	public double GetDouble(String name)
	{
		for(Constant c : this)
		{
			if(c.getName().equals(name))
			{
				return Double.parseDouble(c.getValue());
			}
		}
		return 0.0;
	}
	
	public String GetString(String name)
	{
		for(Constant c : this)
		{
			if(c.getName().equals(name))
			{
				return c.getValue();
			}
		}
		return "";
	}
}