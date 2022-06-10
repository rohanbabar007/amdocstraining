package com.training.amdocs.covidapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.training.amdocs.covidapi.doa.DOACentres;
import com.training.amdocs.covidapi.pojo.Centre;

@RestController
public class CovidRestController {
   @Autowired
  DOACentres doa;
   
   @GetMapping("/allCentres")
  List<Centre> getAllCentres()
  {
	  return doa.getAll();
  }
   @GetMapping("/allCentres/{pin}")
   Centre getAllCentres(@PathVariable String pin)
   {
 	  return doa.get(pin);
   }
   @PostMapping("/covidCenter")
  // public String addCentre(@RequestParam int id,@RequestParam String name,@RequestParam String pincode)
   public String addCentre(@RequestBody Centre centre)
   {
	  // return doa.add(id, name, pincode)
	   System.out.println(centre);
	   return doa.add(centre.getId(), centre.getName(), centre.getPincode());
   }

}
   
  

