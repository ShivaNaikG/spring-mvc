package com.jsp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.dto.Hospital;
import com.jsp.service.HospitalService;

@Controller
public class HospitalController {
	
	@Autowired
	HospitalService hospitalService;
	//load
@RequestMapping("/loadhospital")
	public ModelAndView loadHospital()
	{
		ModelAndView andView=new ModelAndView("savehospital.jsp");
		return andView.addObject("load",new Hospital());
	}
//save
@RequestMapping("/savehospital")
	public ModelAndView saveHospital(@ModelAttribute Hospital hospital)
	{
	Hospital hospital2	=hospitalService.saveHospitalService(hospital);
		 
		if(hospital2 !=null)
		{
			ModelAndView andView=new ModelAndView("home.jsp");
			andView.addObject("msg","DATA SAVED");
			return andView;
		}
		else
		{
			ModelAndView andView=new ModelAndView("/loadhospital");
			return andView;
		}
		
	}
//displayhospital
@RequestMapping("/displayhospital")
public ModelAndView displayHospital()
	{
List<Hospital>hospitals	=hospitalService.getByAllService();
	ModelAndView andView=new ModelAndView("display.jsp");
	return andView.addObject("list",hospitals);
	
}
//edit
@RequestMapping("/gethospitalbyid")
public ModelAndView getHospitalById(@RequestParam int id)
{
Hospital hospital	=hospitalService.getByIdService(id);
ModelAndView andView=new ModelAndView("update.jsp");
andView.addObject("hospitalupdate",hospital);
return andView;
}
//update
@RequestMapping("/updatehospital")
public  ModelAndView updateHospital(@ModelAttribute Hospital hospital)
{
	
	hospitalService.updateHospitalService(hospital);
	ModelAndView andView=new  ModelAndView("/displayhospital");
	return andView;
	
}
//delete
@RequestMapping("/deletehospital")
public ModelAndView deletehospital(@RequestParam int id)
{
	hospitalService.deleteHospitalService(id);
	ModelAndView andView=new ModelAndView("/displayhospital");
	return andView;
	
}
}



