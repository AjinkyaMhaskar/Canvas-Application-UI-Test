package test.java.dataProviders;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

	private final String propertyFilePath = "configs/Configuration.properties";
	FileInputStream reader = null;
	static Properties properties = null;

	public ConfigFileReader() {
		try {
			reader = new FileInputStream(propertyFilePath);
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

	public static String getBROWSER() {
		String BROWSER = properties.getProperty("BROWSER");
		if (BROWSER != null)
			return BROWSER;
		else
			throw new RuntimeException("BROWSER not specified in the Configuration.properties file.");
	}
	
	public static String getBaseURL() {
		String baseURL = properties.getProperty("baseURL");
		if (baseURL != null)
			return baseURL;
		else
			throw new RuntimeException("BaseURL not specified in the Configuration.properties file.");
	}
	
	public static String getUserPass() {
		String UserPass = properties.getProperty("UserPass");
		if (UserPass != null)
			return UserPass;
		else
			throw new RuntimeException("UserPass not specified in the Configuration.properties file.");
	}
}
