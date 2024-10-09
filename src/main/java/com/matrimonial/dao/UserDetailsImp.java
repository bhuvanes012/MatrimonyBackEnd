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
			if(validatePofileDetails(profile,api))
			
			userDAO.persist(profile);
			api.setMessage("Profile created sucessfully");
		}catch (Exception e) {
			api.setMessage("While creating profile getting error, please check the required data");
		}
		api.setResponseData(profile);
		
	}
	private boolean validatePofileDetails(UserProfilePO profile, ApiResponse api) {
	    if (profile.getName() == null || profile.getName().isEmpty()) {
	        api.setMessage("Name is required");
	        return false;
	    }
	    if (profile.getDob() == null || profile.getDob().isEmpty()) {
	        api.setMessage("Date of birth is required");
	        return false;
	    }
	    if (profile.getGender() == null || profile.getGender().isEmpty()) {
	        api.setMessage("Gender is required");
	        return false;
	    }
	    if (profile.getReligion() == null || profile.getReligion().isEmpty()) {
	        api.setMessage("Religion is required");
	        return false;
	    }
	    //if religion is other than other religion field should not empty
	    if (profile.getOtherReligion() == null || profile.getOtherReligion().isEmpty()) {
	    	if(profile.getReligion().equalsIgnoreCase("other")) {
	    		 api.setMessage("Other religion is required");
	 	         return false;
	    	}
	       
	    }
	    if (profile.getCity() == null || profile.getCity().isEmpty()) {
	        api.setMessage("City is required");
	        return false;
	    }
	    if (profile.getState() == null || profile.getState().isEmpty()) {
	        api.setMessage("State is required");
	        return false;
	    }
	    if (profile.getCountry() == null || profile.getCountry().isEmpty()) {
	        api.setMessage("Country is required");
	        return false;
	    }
	    if (profile.getMaritalStatus() == null || profile.getMaritalStatus().isEmpty()) {
	        api.setMessage("Marital status is required");
	        return false;
	    }
	    if (profile.getChildrenStatus() == null || profile.getChildrenStatus().isEmpty()) {
	        api.setMessage("Children status is required");
	        return false;
	    }
	    if (profile.getDegree() == null || profile.getDegree().isEmpty()) {
	        api.setMessage("Degree is required");
	        return false;
	    }
	    if (profile.getOccupation() == null || profile.getOccupation().isEmpty()) {
	        api.setMessage("Occupation is required");
	        return false;
	    }
	    if (profile.getJobTitle() == null || profile.getJobTitle().isEmpty()) {
	        api.setMessage("Job title is required");
	        return false;
	    }
	    if (profile.getAnnualIncome() == null || profile.getAnnualIncome().isEmpty()) {
	        api.setMessage("Annual income is required");
	        return false;
	    }
	    if (profile.getJobLocation() == null || profile.getJobLocation().isEmpty()) {
	        api.setMessage("Job location is required");
	        return false;
	    }
	    if (profile.getCompanyName() == null || profile.getCompanyName().isEmpty()) {
	        api.setMessage("Company name is required");
	        return false;
	    }
	    if (profile.getFamilyType() == null || profile.getFamilyType().isEmpty()) {
	        api.setMessage("Family type is required");
	        return false;
	    }
	    if (profile.getFamilyCity() == null || profile.getFamilyCity().isEmpty()) {
	        api.setMessage("Family city is required");
	        return false;
	    }
	    if (profile.getFamilyDetails() == null || profile.getFamilyDetails().isEmpty()) {
	        api.setMessage("Family details are required");
	        return false;
	    }
	    if (profile.getCaste() == null || profile.getCaste().isEmpty()) {
	        api.setMessage("Caste is required");
	        return false;
	    }
	    if (profile.getGothram() == null || profile.getGothram().isEmpty()) {
	        api.setMessage("Gothram is required");
	        return false;
	    }
	    if (profile.getDosham() == null || profile.getDosham().isEmpty()) {
	        api.setMessage("Dosham information is required");
	        return false;
	    }
	    if (profile.getMotherTongue() == null || profile.getMotherTongue().isEmpty()) {
	        api.setMessage("Mother tongue is required");
	        return false;
	    }
	    if (profile.getHoroscopeImage() == null || profile.getHoroscopeImage().isEmpty()) {
	        api.setMessage("Horoscope image is required");
	        return false;
	    }
	    if (profile.getRasi() == null || profile.getRasi().isEmpty()) {
	        api.setMessage("Rasi is required");
	        return false;
	    }
	    if (profile.getNakshatram() == null || profile.getNakshatram().isEmpty()) {
	        api.setMessage("Nakshatram is required");
	        return false;
	    }
	    if (profile.getTimeOfBirth() == null || profile.getTimeOfBirth().isEmpty()) {
	        api.setMessage("Time of birth is required");
	        return false;
	    }
	    if (profile.getPlaceOfBirth() == null || profile.getPlaceOfBirth().isEmpty()) {
	        api.setMessage("Place of birth is required");
	        return false;
	    }
	    if (profile.getEmail() == null || profile.getEmail().isEmpty()) {
	        api.setMessage("Email is required");
	        return false;
	    }
	    if (profile.getContactPerson() == null || profile.getContactPerson().isEmpty()) {
	        api.setMessage("Contact person is required");
	        return false;
	    }
	    if (profile.getMobile() == null || profile.getMobile().isEmpty()) {
	        api.setMessage("Mobile number is required");
	        return false;
	    }
	    if (profile.getAltMobile() == null || profile.getAltMobile().isEmpty()) {
	        api.setMessage("Alternate mobile is required");
	        return false;
	    }
	    if (profile.getHeight() == null || profile.getHeight().isEmpty()) {
	        api.setMessage("Height is required");
	        return false;
	    }
	    if (profile.getComplexion() == null || profile.getComplexion().isEmpty()) {
	        api.setMessage("Complexion is required");
	        return false;
	    }
	    if (profile.getWeight() == null || profile.getWeight().isEmpty()) {
	        api.setMessage("Weight is required");
	        return false;
	    }
	    if (profile.getPhysicallyChallenged() == null || profile.getPhysicallyChallenged().isEmpty()) {
	        api.setMessage("Physically challenged information is required");
	        return false;
	    }
	    if (profile.getFoodType() == null || profile.getFoodType().isEmpty()) {
	        api.setMessage("Food type is required");
	        return false;
	    }
	    if (profile.getDrinking() == null || profile.getDrinking().isEmpty()) {
	        api.setMessage("Drinking habits are required");
	        return false;
	    }
	    if (profile.getSmoking() == null || profile.getSmoking().isEmpty()) {
	        api.setMessage("Smoking habits are required");
	        return false;
	    }
	    if (profile.getHobbies() == null || profile.getHobbies().isEmpty()) {
	        api.setMessage("Hobbies are required");
	        return false;
	    }
	    if (profile.getSocialMediaDetails() == null || profile.getSocialMediaDetails().isEmpty()) {
	        api.setMessage("Social media details are required");
	        return false;
	    }
	    if (profile.getLanguagesKnown() == null || profile.getLanguagesKnown().isEmpty()) {
	        api.setMessage("Languages known are required");
	        return false;
	    }
	    if (profile.getAboutMe() == null || profile.getAboutMe().isEmpty()) {
	        api.setMessage("About me section is required");
	        return false;
	    }

	    // All validations passed
	    return true;
	}


}
