package Telerik.web.property;

import java.io.FileInputStream;
import java.util.Properties;

public class Read_PropertyFIle {
	
	public static String readfile(String key)
	{
		try {
		FileInputStream file= new FileInputStream("C:\\Users\\Ajay Barad\\Automation\\Progress_Teleriks\\src\\main\\resources\\PropertyFile\\Teleriks.properties");
		Properties property=new Properties();
		property.load(file);
		return property.get(key).toString();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}

}
