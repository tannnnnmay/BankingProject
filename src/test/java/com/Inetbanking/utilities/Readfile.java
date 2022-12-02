package com.Inetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;


public class Readfile{
	
	Properties prop;
	public Readfile() {
		File file = new File("./Configurations//config.properties");
		try {
			FileInputStream fis = new FileInputStream(file);
			 prop = new Properties();
			prop.load(fis);// to load properties file  load is method
			
			
		}catch(Exception e) {
			System.out.println("Exception is :"+ e.getMessage());
			
		}
		
	}
	
	public String getUrl() {
		String url =  prop.getProperty("BaseURL");
		return url;
		}
	
	public String getPassword() {
		String pass =  prop.getProperty("PassWord");
		return pass;
		}
	
	public String getUsername() {
		String username =  prop.getProperty("UserName");
		return username;
		}
	
	public String getChromePath() {
		String cpath =  prop.getProperty("ChromePath");
		return cpath;
		}
	
	public String getgeckoPath() {
		String gpath =  prop.getProperty("GeckoPath");
		return gpath;
		}
	
	public String getedgePath() {
		String epath =  prop.getProperty("EdgePath");
		return epath;
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
