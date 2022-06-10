package com.training.amdocs.covidapi.doa;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.training.amdocs.covidapi.pojo.Centre;
@Component
public class DOACentres {
    
	List<Centre> centres;
	public DOACentres() {
		// TODO Auto-generated constructor stub

		centres=new ArrayList<Centre>();

		centres.add(new Centre(1,"Pune","444444"));
		centres.add(new Centre(2,"Satra","410002"));
		centres.add(new Centre(3,"Banglore","409322"));
		centres.add(new Centre(4,"HyderBad","47722"));
	}
	public List<Centre> getAll()
	{
		
		return centres;
	}

	public Centre get(String pin)
	{
		Centre obj=null;
		for (Centre centre : centres)
		{
			if(centre.getPincode().equalsIgnoreCase(pin))
			{
				obj=centre;
				break;
			}
			
		}
		return obj;
	}
	public String add(int id ,String name,String pin)
	{
		Centre centre=new Centre(id, name, pin);
		centres.add(centre);
		return "Successfully Inserted!!";
	}
	
	
}
