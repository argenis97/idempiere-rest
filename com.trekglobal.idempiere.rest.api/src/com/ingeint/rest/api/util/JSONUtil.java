package com.ingeint.rest.api.util;

import org.compiere.util.Util;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonParser;

/**
 * 
 * @author Argenis Rodríguez
 */
public class JSONUtil {
	
	public static JsonElement toJSON(String strJSON) {
		
		if (Util.isEmpty(strJSON, true))
			return JsonNull.INSTANCE;
		
		try {
			JsonElement element = JsonParser.parseString(strJSON);
			
			if (!element.isJsonObject())
				return JsonNull.INSTANCE;
			
			return element;
		} catch (Exception e) {
			return JsonNull.INSTANCE;
		}
	}
}
