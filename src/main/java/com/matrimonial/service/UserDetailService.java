package com.matrimonial.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.matrimonial.model.TestDBPO;

@Service
public interface UserDetailService {

	List<TestDBPO> FindAll();

	void insertDate(TestDBPO table);
	

}
