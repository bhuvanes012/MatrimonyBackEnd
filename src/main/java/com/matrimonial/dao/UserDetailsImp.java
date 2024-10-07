package com.matrimonial.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.matrimonial.model.ApiResponse;
import com.matrimonial.model.TestDBPO;
import com.matrimonial.model.UserProfilePO;
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
	}
	@Override
	public void registerUserProfile(UserProfilePO profile,ApiResponse api) {
		
		try {
			userDAO.persist(profile);
			api.setMessage("Profile created sucessfully");
		}catch (Exception e) {
			api.setMessage(e.getMessage());
		}
		api.setResponseData(profile);
		
	}

}
