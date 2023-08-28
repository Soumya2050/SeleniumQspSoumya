package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//step 1:Convert physical file into java readable object
		//new FileInputStream():throws FileNotFoundException 
		FileInputStream fis=new FileInputStream("./TestResources/Data.properties");
		
		//step 2:create an instance of properties class
		//properties class should be imported from java.util package
		Properties property=new Properties();
		
		//step 3:Load all key value pairs to properties object from fis
		//property.load(fis):throws IOException		
		property.load(fis);
		
		//step 4:Read data using properties object
		System.out.println(property.getProperty("url"));
		System.out.println(property.getProperty("browser"));
		System.out.println(property.getProperty("timeouts"));
		System.out.println(property.getProperty("user1"));
		System.out.println(property.getProperty("pwd1"));
		System.out.println(property.getProperty("user2"));
		System.out.println(property.getProperty("pwd2"));
	
	}

}
