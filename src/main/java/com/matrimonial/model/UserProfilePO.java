package com.matrimonial.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_profile")
public class UserProfilePO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "dob")
    private String dob;

    @Column(name = "gender")
    private String gender;

    @Column(name = "religion")
    private String religion;

    @Column(name = "other_religion")
    private String otherReligion;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "country")
    private String country;

    @Column(name = "marital_status")
    private String maritalStatus;

    @Column(name = "children_status")
    private String childrenStatus;

    @Column(name = "degree")
    private String degree;

    @Column(name = "occupation")
    private String occupation;

    @Column(name = "job_title")
    private String jobTitle;

    @Column(name = "annual_income")
    private String annualIncome;

    @Column(name = "job_location")
    private String jobLocation;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "family_type")
    private String familyType;

    @Column(name = "family_city")
    private String familyCity;

    @Column(name = "family_details")
    private String familyDetails;

    @Column(name = "caste")
    private String caste;

    @Column(name = "gothram")
    private String gothram;

    @Column(name = "dosham")
    private String dosham;

    @Column(name = "mother_tongue")
    private String motherTongue;

    @Column(name = "children")
    private boolean children;

    @Column(name = "horoscope_image")
    private String horoscopeImage;

    @Column(name = "rasi")
    private String rasi;

    @Column(name = "nakshatram")
    private String nakshatram;

    @Column(name = "time_of_birth")
    private String timeOfBirth;

    @Column(name = "place_of_birth")
    private String placeOfBirth;

    @Column(name = "email")
    private String email;

    @Column(name = "contact_person")
    private String contactPerson;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "alt_mobile")
    private String altMobile;

    @Column(name = "height")
    private String height;

    @Column(name = "complexion")
    private String complexion;

    @Column(name = "weight")
    private String weight;

    @Column(name = "physically_challenged")
    private String physicallyChallenged;

    @Column(name = "food_type")
    private String foodType;

    @Column(name = "drinking")
    private String drinking;

    @Column(name = "smoking")
    private String smoking;

    @Column(name = "hobbies")
    private String hobbies;

    @Column(name = "social_media_details")
    private String socialMediaDetails;

    @Column(name = "languages_known")
    private String languagesKnown;

    @Column(name = "about_me")
    private String aboutMe;

    @Column(name = "profile_image")
    private String profileImage;

    @Column(name = "profile_image1")
    private String profileImage1;

    @Column(name = "profile_image2")
    private String profileImage2;

    @Column(name = "profile_image3")
    private String profileImage3;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getOtherReligion() {
		return otherReligion;
	}

	public void setOtherReligion(String otherReligion) {
		this.otherReligion = otherReligion;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getChildrenStatus() {
		return childrenStatus;
	}

	public void setChildrenStatus(String childrenStatus) {
		this.childrenStatus = childrenStatus;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(String annualIncome) {
		this.annualIncome = annualIncome;
	}

	public String getJobLocation() {
		return jobLocation;
	}

	public void setJobLocation(String jobLocation) {
		this.jobLocation = jobLocation;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getFamilyType() {
		return familyType;
	}

	public void setFamilyType(String familyType) {
		this.familyType = familyType;
	}

	public String getFamilyCity() {
		return familyCity;
	}

	public void setFamilyCity(String familyCity) {
		this.familyCity = familyCity;
	}

	public String getFamilyDetails() {
		return familyDetails;
	}

	public void setFamilyDetails(String familyDetails) {
		this.familyDetails = familyDetails;
	}

	public String getCaste() {
		return caste;
	}

	public void setCaste(String caste) {
		this.caste = caste;
	}

	public String getGothram() {
		return gothram;
	}

	public void setGothram(String gothram) {
		this.gothram = gothram;
	}

	public String getDosham() {
		return dosham;
	}

	public void setDosham(String dosham) {
		this.dosham = dosham;
	}

	public String getMotherTongue() {
		return motherTongue;
	}

	public void setMotherTongue(String motherTongue) {
		this.motherTongue = motherTongue;
	}

	public boolean isChildren() {
		return children;
	}

	public void setChildren(boolean children) {
		this.children = children;
	}

	public String getHoroscopeImage() {
		return horoscopeImage;
	}

	public void setHoroscopeImage(String horoscopeImage) {
		this.horoscopeImage = horoscopeImage;
	}

	public String getRasi() {
		return rasi;
	}

	public void setRasi(String rasi) {
		this.rasi = rasi;
	}

	public String getNakshatram() {
		return nakshatram;
	}

	public void setNakshatram(String nakshatram) {
		this.nakshatram = nakshatram;
	}

	public String getTimeOfBirth() {
		return timeOfBirth;
	}

	public void setTimeOfBirth(String timeOfBirth) {
		this.timeOfBirth = timeOfBirth;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAltMobile() {
		return altMobile;
	}

	public void setAltMobile(String altMobile) {
		this.altMobile = altMobile;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getComplexion() {
		return complexion;
	}

	public void setComplexion(String complexion) {
		this.complexion = complexion;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getPhysicallyChallenged() {
		return physicallyChallenged;
	}

	public void setPhysicallyChallenged(String physicallyChallenged) {
		this.physicallyChallenged = physicallyChallenged;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public String getDrinking() {
		return drinking;
	}

	public void setDrinking(String drinking) {
		this.drinking = drinking;
	}

	public String getSmoking() {
		return smoking;
	}

	public void setSmoking(String smoking) {
		this.smoking = smoking;
	}

	public String getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	public String getSocialMediaDetails() {
		return socialMediaDetails;
	}

	public void setSocialMediaDetails(String socialMediaDetails) {
		this.socialMediaDetails = socialMediaDetails;
	}

	public String getLanguagesKnown() {
		return languagesKnown;
	}

	public void setLanguagesKnown(String languagesKnown) {
		this.languagesKnown = languagesKnown;
	}

	public String getAboutMe() {
		return aboutMe;
	}

	public void setAboutMe(String aboutMe) {
		this.aboutMe = aboutMe;
	}

	public String getProfileImage() {
		return profileImage;
	}

	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}

	public String getProfileImage1() {
		return profileImage1;
	}

	public void setProfileImage1(String profileImage1) {
		this.profileImage1 = profileImage1;
	}

	public String getProfileImage2() {
		return profileImage2;
	}

	public void setProfileImage2(String profileImage2) {
		this.profileImage2 = profileImage2;
	}

	public String getProfileImage3() {
		return profileImage3;
	}

	public void setProfileImage3(String profileImage3) {
		this.profileImage3 = profileImage3;
	}

    
}
