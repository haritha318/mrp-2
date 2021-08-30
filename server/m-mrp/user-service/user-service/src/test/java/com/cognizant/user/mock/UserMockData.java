package com.cognizant.user.mock;

import java.util.ArrayList;
import java.util.List;

import com.cognizant.user.entity.Address;
import com.cognizant.user.entity.Dependent;
import com.cognizant.user.entity.User;
import com.cognizant.user.entity.UserDetail;

public class UserMockData {

	public List<User> getUserMockData() {
		List<User> userData = new ArrayList<>();
		User user = new User();

		Address address = new Address();

		address.setAddressLine("Test address line");
		address.setCountry("India");
		address.setState("Tamil Nadu");
		address.setCity("Chennai");
		address.setPinCode("600118");

		user.setId("R-190");
		user.setName("Malini");
		user.setAddress(address);
		user.setDateOfBirth("18-03-1997");
		user.setContactDetail(9094828327l);
		user.setPanCardNumber("ATAPH6767T");
		user.setEmail("haritha@gmail.com");
		user.setPassword("Haritha@123");
		
		userData.add(user);

		return userData;
	}
	
	public Dependent getDependentMockData() {
		Dependent dependent = new Dependent();
		
		dependent.setId("D-111");
		dependent.setName("Latha");
		dependent.setDateOfBirth("12-09-1996");
		dependent.setUserId("R-190");
		
		return dependent;
	}
	
	public UserDetail getUserDetailMockData() {
		UserDetail userDetail = new UserDetail();
		List<Dependent> dependents = new ArrayList<>();
		
		dependents.add(getDependentMockData());
		
		userDetail.setUser(getUserMockData().get(0));
		userDetail.setDependents(dependents);
		
		return userDetail;
	}

}