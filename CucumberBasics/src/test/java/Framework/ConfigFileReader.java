package Framework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import Enums.DriverType;
import Enums.EnvironmentType;

public class ConfigFileReader {

	private Properties properties;
	String projectPath = System.getProperty("user.dir");	
	private final String propertyFilePath= projectPath+"/src/test/resources/Config/Config.properties";

	public ConfigFileReader(){
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		} 
	}

	public String getDriverPath(){
		String driverPath = projectPath+properties.getProperty("driverPath");
		if(driverPath!= null) return driverPath;
		else throw new RuntimeException("driverPath not specified in the Configuration.properties file."); 
	}

	public long getImplicitlyWait() { 
		String implicitlyWait = properties.getProperty("implicitlyWait");
		if(implicitlyWait != null) return Long.parseLong(implicitlyWait);
		else throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file."); 
	}

	public String getApplicationUrl() {
		String url = properties.getProperty("URL");
		System.out.println("getApplicationUrl() - :"+url);
		if(url != null) return url;
		else throw new RuntimeException("Application Url not specified in the Configuration.properties file for the Key:url");
	}

	public DriverType getBrowser() {
		String browserName = properties.getProperty("BROWSER");
		if(browserName == null || browserName.equals("GC")) return DriverType.CHROME;
		else if(browserName.equalsIgnoreCase("FF")) return DriverType.FIREFOX;
		else if(browserName.equals("IE")) return DriverType.INTERNETEXPLORER;
		else throw new RuntimeException("Browser Name Key value in Configuration.properties is not matched : " + browserName);
	}

	public EnvironmentType getEnvironment() {
		String environmentName = properties.getProperty("ENVIRONMENT");
		if(environmentName == null || environmentName.equalsIgnoreCase("local")) return EnvironmentType.local;
		else if(environmentName.equals("remote")) return EnvironmentType.remote;
		else throw new RuntimeException("Environment Type Key value in Configuration.properties is not matched : " + environmentName);
	}

	public Boolean getBrowserWindowSize() {
		String windowSize = properties.getProperty("windowMaximize");
		if(windowSize != null) return Boolean.valueOf(windowSize);
		return true;
	}
	
	public String getReportConfigPath(){
	 String reportConfigPath = properties.getProperty("reportConfigPath");
	 if(reportConfigPath!= null) return reportConfigPath;
	 else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath"); 
	}

}