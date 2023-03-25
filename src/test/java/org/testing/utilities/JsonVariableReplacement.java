package org.testing.utilities;

import java.util.regex.Pattern;

public class JsonVariableReplacement {
	
	public static String jsonreplace(String Data, String variableName,String variableValue)
	{
		
		Data = Data.replaceAll(Pattern.quote("{{"+variableName+"}}"), variableValue);
		return Data;
	}

}
