package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
	
	public String addSillyMember() {
		System.out.println(getClass() + " : Doing Stuff: Add a Membership account");
		return "";
	}
	
	public void goToSleep() {
		System.out.println(getClass() + " : goint to sleep");
	}
}
