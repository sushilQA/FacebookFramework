package org.testing.utilities;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonParsingUsingOrgJson {

	public static String parseJsonData(String data, String keyName) {
		JSONObject jsonObject = new JSONObject(data);
		return jsonObject.get(keyName).toString();
	}

	public static void parseAllIds(String data, String keyName) {
		JSONArray jsonArray = new JSONArray(data);
		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonObject = jsonArray.getJSONObject(i);
			System.out.println(jsonObject.get(keyName));

		}
	}

}
