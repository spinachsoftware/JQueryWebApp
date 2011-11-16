/*
 * Spinach Software & Consulting LLC
 * Copyright 2011 by Spinach Software & Consulting LLC. All rights reserved.
 */
package com.spinachsoftware.entity;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * The purpose of this class is to be served as an entity encapsulating
 * basic details around any zipcode. The class is defined with xml root 
 * element and hence can be converted to xml and java objects using JAXB.
 * 
 * @author Spinach Software & Consulting LLC
 */
@SuppressWarnings("serial")
@XmlRootElement
public class ZipcodeDetails implements Serializable
{
	/** zipcode Id column */
	private String zipcodeId;
	
	/** city column */
	private String cityName;
	
	/** state column */
	private String state;
	
	/** default no-argument constructor */ 
	public ZipcodeDetails()
	{
	}
	
	/** default constructor */ 
	public ZipcodeDetails(String zipcode, String cityName, String state)
	{
		this.zipcodeId = zipcode;
		this.cityName = cityName;
		this.state = state;
	}

	public String getZipcodeId() 
	{
		return zipcodeId;
	}

	public void setZipcodeId(String zipcodeId) 
	{
		this.zipcodeId = zipcodeId;
	}

	public String getCityName() 
	{
		return cityName;
	}

	public void setCity(String cityName) 
	{
		this.cityName = cityName;
	}

	public String getState() 
	{
		return state;
	}

	public void setState(String state) 
	{
		this.state = state;
	}
}
