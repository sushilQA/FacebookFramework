package org.testing.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

public class LoadJSONFile {
	
	public static String handleJSONFile(String path) throws FileNotFoundException
	{
		File file = new File(path);
		FileReader fileReader = new FileReader(file);
		JSONTokener jsonTokener = new JSONTokener(fileReader);
		JSONObject jsonObject = new JSONObject(jsonTokener);
		return jsonObject.toString();
		
	}
	
}
