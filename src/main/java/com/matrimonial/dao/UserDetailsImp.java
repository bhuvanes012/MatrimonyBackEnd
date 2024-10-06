package com.matrimonial.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.matrimonial.model.TestDBPO;
import com.matrimonial.service.UserDetailService;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class UserDetailsImp  implements UserDetailService{
	
	@Autowired
	EntityManager userDAO ;
	@Override
	public List<TestDBPO> FindAll() {
		// TODO Auto-generated method stub
		List<TestDBPO> data = userDAO.createQuery("from TestDBPO where city=:city ").setParameter("city", "chennnai").getResultList();
		return data;
	}
	@Override
	public void insertDate(TestDBPO table) {
		 
		userDAO.persist(table);
		userDAO.remove(table);
	}

}
