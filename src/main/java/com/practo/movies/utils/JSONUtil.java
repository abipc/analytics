package com.practo.movies.utils;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONUtil {
	
	public static List<JSONObject> convertJSONArrayToList(JSONArray jsonArray) {
		List<JSONObject> list = new ArrayList<>();     
		if (jsonArray != null) { 
		   int len = jsonArray.length();
		   for (int i=0;i<len;i++){ 
			   list.add(jsonArray.getJSONObject(i));
		   } 
		} 
		return list;
	}		
	
	public static Long getETA(JSONObject response) throws Exception {	
		if(!response.isNull("code") && 400 > response.getInt("code") && !response.isNull("content")) {
			List<JSONObject> rows = convertJSONArrayToList(response.getJSONObject("content").getJSONArray("rows"));
			JSONObject data = rows.get(0);
			List<JSONObject> data1 = convertJSONArrayToList(data.getJSONArray("elements"));
			
			JSONObject data2 = data1.get(0);
			JSONObject duration = data2.getJSONObject("duration");
			Long timeInSecs = duration.getLong("value");		
			return timeInSecs;
		} else {
			return null;
		}
	}
	
	public static Long getDistance(JSONObject response) throws Exception {
		if(!response.isNull("code") && 400 > response.getInt("code") && !response.isNull("content")) {
			List<JSONObject> rows = convertJSONArrayToList(response.getJSONObject("content").getJSONArray("rows"));
			JSONObject data = rows.get(0);
			List<JSONObject> data1 = convertJSONArrayToList(data.getJSONArray("elements"));
			
			JSONObject data2 = data1.get(0);
			JSONObject duration = data2.getJSONObject("distance");
			Long distance = duration.getLong("value");		
			return distance;
		} else {
			return null;
		}
	}	

}
