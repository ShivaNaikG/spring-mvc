package com.jsp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.dao.HospitalDao;
import com.jsp.dto.Hospital;
@Component
public class HospitalService {
	
	//HospitalDao dao=new HospitalDao();
	@Autowired
	HospitalDao dao;
	
	//save
	public Hospital saveHospitalService(Hospital hospital)
	{
		return dao.saveHospital(hospital);
	}
	//update
	public Hospital updateHospitalService(Hospital hospital)
	{
		return dao.updateHospital(hospital);
	}
	//delete
	public Hospital deleteHospitalService(int id)
	{
return dao.deleteHospital(id);
	}
	//getid
	public Hospital getByIdService(int id)
	{
return dao.getById(id);
	}
	public List<Hospital> getByAllService()
	{
		return dao.getByAll();
	}
}
