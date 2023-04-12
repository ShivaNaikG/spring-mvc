package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.dto.Hospital;
@Component
public class HospitalDao {
//EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("god");
	@Autowired
	EntityManagerFactory entityManagerFactory;
//save
public Hospital saveHospital(Hospital hospital)
{
	EntityManager manager=entityManagerFactory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	if(hospital != null)
	{
		transaction.begin();
		manager.persist(hospital);
		transaction.commit();
	}
	return hospital;
}
//update
public Hospital updateHospital(Hospital hospital)
{
	EntityManager manager=entityManagerFactory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
Hospital hospital2	=manager.find(Hospital.class,hospital.getId());
if(hospital2 != null )
{
transaction.begin();
manager.merge(hospital);
transaction.commit();
}
return hospital2;
}
//delete
public Hospital deleteHospital(int id)
{

	EntityManager manager=entityManagerFactory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	Hospital hospital2	=manager.find(Hospital.class,id);
	if(hospital2 != null )
	{
	transaction.begin();
	manager.remove(hospital2);
	transaction.commit();
	}
	return hospital2;
}
//getid
public Hospital getById(int id)
{
	EntityManager entityManager=entityManagerFactory.createEntityManager();
return entityManager.find(Hospital.class, id);
	
	
}
//getByAll
public List<Hospital> getByAll()
{
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	Query query=entityManager.createQuery("select a from Hospital a");
	List<Hospital>list=query.getResultList();
	return list;
	
	
	
	
	
	
}


}
