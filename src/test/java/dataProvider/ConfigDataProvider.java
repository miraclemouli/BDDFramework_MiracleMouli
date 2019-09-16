package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {
	
	Properties pro;
	
	public ConfigDataProvider()
	{
		File src = new File("./configuration/config.properties");
		
		try 
		{
		FileInputStream fis = new FileInputStream(src);
		
		pro = new Properties();
		pro.load(fis);
		
		} catch(Exception e)
		{
			System.out.println("Exception is" +e.getMessage());
		}
	}
	
	public String getChromePath()
	{
		String url = pro.getProperty("chromepath");
		return url;
	}

	public String getIEPath()
	{
		String url = pro.getProperty("iepath");
		return url;
	}
	
	public String getURL()
	{
		String url = pro.getProperty("url");
		return url;
	}
}
