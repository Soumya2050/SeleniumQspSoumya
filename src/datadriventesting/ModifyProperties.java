package datadriventesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ModifyProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("./TestResources/Data1.properties");
		Properties p=new Properties();
		p.load(fis);
		
		p.put("user2","trainee");
		p.put("pwd2", "trainee");
		
		FileOutputStream fos=new FileOutputStream("./TestResources/Data1.properties");
		p.store(fos,"updated successfully");
	}
	

}
