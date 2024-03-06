package test12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

//접근제한자 class 클래스이름
public class PropTest {
	//필드
	//접근제한자 자료형 이름;
	
	
	
	
	
	//생성자(메소드)
	//접근제한자 클래스명(매개변수들){}
	
	
	
	
	//메소드
	//접근제한자 (static) 반환형 메소드이름(매개변수들){}
	public static void main(String[] args) {
		Properties prop = new Properties();
		
		prop.setProperty("1", "apple,1200,3");
		prop.setProperty("2", "banana,2500,2");
		prop.setProperty("3", "grape,4500,5");
		prop.setProperty("4", "orange,800,10");
		prop.setProperty("5", "melon,5000,2");
		
//		Enumeration enumeration = prop.propertyNames();
//		
//		while (enumeration.hasMoreElements()) {
//			
//			String element = (String) enumeration.nextElement();
//			System.out.println(element + "=" + prop.getProperty(element));
//		}
		
		
		fileSave(prop);
		fileOpen(prop);
	}
	
	
	
	public static void fileSave(Properties p) {
		try {
			p.storeToXML(new FileOutputStream("data.xml"), " Properties");
		}  catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	
	public static void fileOpen(Properties p) {
		try {
			//data.xml파일에서 데이터를 읽어온다
			p.loadFromXML(new FileInputStream("data.xml"));
			
			Enumeration enumeration = p.propertyNames();
			Fruit[] fruitArr = new Fruit[p.size()];
			
			
			for(Fruit f : fruitArr) {
				String key = (String) enumeration.nextElement();
				String value = p.getProperty(key);
				String[] values = value.split(",");
				f= new Fruit(values[0], Integer.parseInt(values[1]), Integer.parseInt(values[2]));
				System.out.println(key +"="+ f.toString());
			}
			
			
			
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
