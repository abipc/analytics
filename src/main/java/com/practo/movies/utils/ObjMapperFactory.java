package com.practo.movies.utils;

import org.json.JSONObject;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.practo.movies.models.response.SuccessResponseModel;

public class ObjMapperFactory {
	
	public static final ObjectMapper MAPPER = new ObjectMapper();
	
	public static ObjectMapper getObjectMapper() {
		return MAPPER;
	}

	public static String getString(JSONObject json) {
		try {
			return MAPPER.writeValueAsString(json);
		}catch (Exception ex) {
			return "EMPTY";
		}		
	}

	public static String getSuccessData() throws Exception {
		SuccessResponseModel resp = new SuccessResponseModel();
		resp.setMessage("Success");
		resp.setStatusCode(1);
		return ObjMapperFactory.getObjectMapper().writeValueAsString(resp);
	}

	public static String getErrorData() throws Exception{
		SuccessResponseModel resp = new SuccessResponseModel();
		resp.setMessage("Failed");
		resp.setStatusCode(5);
		return ObjMapperFactory.getObjectMapper().writeValueAsString(resp);
	}
}
