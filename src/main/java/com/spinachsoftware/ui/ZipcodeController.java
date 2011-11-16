/*
 * Spinach Software & Consulting LLC
 * Copyright 2011 by Spinach Software & Consulting LLC. All rights reserved.
 */
package com.spinachsoftware.ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spinachsoftware.entity.ZipcodeDetails;

/**
 * This is a basic Spring controller meant to be called directly from browser or
 * any other client such as jQuery etc.
 * 
 * @author Spinach Software & Consulting LLC
 */
@Controller
public class ZipcodeController 
{
	/**
     * This method will return same set of zipcodes all the time. 
     * 
     * @return Map<String, List<ZipcodeDetails>> represents a JSON name value pair
     */
	@RequestMapping(value="/ajaxcitySearchGeneral", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, List<ZipcodeDetails>> getZipcodes()
	{
		List<ZipcodeDetails> zipcodes = new ArrayList<ZipcodeDetails>(Arrays.asList(new ZipcodeDetails("55401", "Minneapolis", "MN"), new ZipcodeDetails("1949", "Middleton", "MA"), new ZipcodeDetails("2055", "MINOT", "MA")));
		Map<String, List<ZipcodeDetails>> zipMap = new HashMap<String, List<ZipcodeDetails>>();
		zipMap.put("zipcodes", zipcodes);
		return zipMap;
	}
}
