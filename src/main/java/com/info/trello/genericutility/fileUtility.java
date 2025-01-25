package com.info.trello.genericutility;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;


 /**
  * 
  * @author denis
  *
  */

public class fileUtility {
	/**
	 * This Method Is Used TO Read The Data From Property File.
	 * @author denis
	 * @param key
	 * @return value
	 * @throws IOException
	 */
	 
	public String readCommonData(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/trello.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		String value = pobj.getProperty(key);
		return value;
	
	}

}


