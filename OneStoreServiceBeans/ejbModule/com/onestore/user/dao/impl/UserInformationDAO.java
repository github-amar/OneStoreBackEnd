package com.onestore.user.dao.impl;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import com.onestore.model.UserDetail;
import com.onestore.user.dao.IUserInformationDAO;

@Stateless
public class UserInformationDAO implements IUserInformationDAO{

	/*@PersistenceContext(unitName = "onestore")
    private EntityManager em;*/
	 private EntityManagerFactory factory;
	 
	
	
	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void save(UserDetail userDetail) {	
		factory = Persistence.createEntityManagerFactory("onestore");
	    EntityManager em = factory.createEntityManager();
		System.out.println("=======>"+em);
		
		em.getTransaction().begin();
		em.persist(userDetail);	
		em.getTransaction().commit();
		
		
	}
	
	
	

}
