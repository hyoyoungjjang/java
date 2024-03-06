package resources;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class resources {
	public static void main(String[] args) {
	
		Properties prop = new Properties();
		
		prop.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
		prop.setProperty("url", "jdbc:oracle:thin:@localhost:1521:xe");
		prop.setProperty("username", "JDBC01");
		prop.setProperty("password", "JDBC01");
		
		
		try {
			prop.store(new FileOutputStream("resources/driver.properties"), "properties resources");
			prop.storeToXML(new FileOutputStream("resources/query.xml"), "properties resources");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		try {
			prop.load(new FileInputStream("resources/driver.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(prop.getProperty("driver"));
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		
		
	}

}
