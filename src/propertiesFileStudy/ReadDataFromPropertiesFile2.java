package propertiesFileStudy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertiesFile2 {

	public static void main(String[] args) throws IOException  {
		
// create object of Properties
		Properties prop = new Properties();
		// creat a object of FileInputStream
		FileInputStream myfiles=new FileInputStream ("C:\\Users\\Admin\\eclipse-workspace\\SeleniumStudy\\MyFile.properties ");
		//load file
		prop.load(myfiles);
		// pass the key for the data we want
		String value= prop.getProperty("CityName");
		System.out.println(value);
		
	}

}
