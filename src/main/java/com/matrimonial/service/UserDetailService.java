package com.matrimonial.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.matrimonial.model.ApiResponse;
import com.matrimonial.model.TestDBPO;
import com.matrimonial.model.UserProfilePO;

@Service
public interface UserDetailService {

	List<TestDBPO> FindAll();

	void insertDate(TestDBPO table);

	void registerUserProfile(UserProfilePO profile, ApiResponse res);
	

}
