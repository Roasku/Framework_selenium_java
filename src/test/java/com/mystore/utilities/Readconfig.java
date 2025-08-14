package com.mystore.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {

	Properties properties;
	
	String path="E:\\New folder\\Mystorev1\\Configuration\\config.properties";
	
	public Readconfig()  {
		try {	
	properties	=new Properties();
	
		FileInputStream fis;
		
			fis = new FileInputStream(path);
			
			properties.load(fis);
			 
		} catch (Exception e) {
			
			
			e.printStackTrace();
		}
					
		}
		
	
	
	public String getBrowser() {
		
	  String value = properties.getProperty("browser");
	 
		if (value !=null)
		return value;
		
		else
			throw new RuntimeException("Url is not find in config file");
	}
	
	public String getbaseUrl()
	{
		  String value = properties.getProperty("baseurl");
		  if (value!=null)
		return value;
		
		  else
			  throw new RuntimeException("browser is not find in config file");
			
		}
}
