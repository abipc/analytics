package com.practo.movies.analytics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.practo.movies.models.ClickStreamData;
import com.practo.movies.utils.ObjMapperFactory;

@Controller
@RequestMapping("/")
public class AnalyticsController {
	
    @RequestMapping(value="/events", method = RequestMethod.POST)
    public @ResponseBody String getTruckLocation(@RequestBody ClickStreamData data) throws Exception {
    	/*
    	 * queue click stream data async
    	 * return HTTP 200
    	 */
    	return ObjMapperFactory.getSuccessData();
    }
    


}
