package misceliniousStudy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUse{ 

	public static String readDataFromPropertyFile( String key)throws IOException
	{
		//create object of Properties
		Properties prop = new Properties();
		// creat a object of FileInputStream for file location 
		FileInputStream myfile=new FileInputStream ("C:\\Users\\Admin\\eclipse-workspace\\SeleniumStudy\\MyFile.properties ");
		//load file
		prop.load(myfile);
		// pass the key for the data we want
		String value= prop.getProperty(key);
		return value;
		
	}
}


