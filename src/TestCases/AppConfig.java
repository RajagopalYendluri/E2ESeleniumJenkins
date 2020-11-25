package TestCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AppConfig {
	
	final private static String PROPERTIES_FILE_PATH = "resources/appconfig.properties";
    private static Properties properties = null;
 
    private static Properties loadProperties() {
		InputStream is = null;
		try {
			properties = new Properties();
			is = new FileInputStream(PROPERTIES_FILE_PATH);
			if(is != null) {
				properties.load(is);
			}
		}catch(Exception e) {
			try {
				is.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		return properties;
    }
    
    public static String getProperty(String inputval) {
    	if(properties == null) {
    		loadProperties();
    	}
    	return (String)properties.get(inputval);
    }
}
