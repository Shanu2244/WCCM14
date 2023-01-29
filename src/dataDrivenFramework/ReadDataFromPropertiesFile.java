package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertiesFile {
public static void main(String[] args) throws IOException {
	FileInputStream fis =  new FileInputStream("./testdata/data.properties");
	Properties property = new Properties();
	property.load(fis);
	String url = property.getProperty("url");
	String username = property.getProperty("username");
	String password = property.getProperty("password");
	System.out.println(url+"\n"+username+"\n"+password);
	
	
	
}
}
