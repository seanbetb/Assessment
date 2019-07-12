package com.assessment.sean;

import java.time.LocalDate;

public class Developer extends Employee {
	String devLevel;
	double hourlyRate;
		 	 
	
	public Developer() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param uniqueId
	 * @param name
	 * @param dept
	 * @param dateStarted
	 * @param phoneNo
	 * @param monthlyPay
	 */
	/**
	 * @param uniqueId
	 * @param name
	 * @param dept
	 * @param dateStarted
	 * @param phoneNo
	 * @param monthlyPay
	 * @param devLevelOne
	 * @param devLevelTwo
	 * @param devLevelThree
	 * @param hourlyRate
	 */
	public Developer(int uniqueId, Name name, Department dept, LocalDate dateStarted, String phoneNo,String devLevel) {
		super(uniqueId, name, dept, dateStarted, phoneNo);
		this.devLevel = devLevel;
		
		
		
	}
	
	/**
	 * @return the devLevelOne
	 */
	public String getDevLevelOne() {
		return devLevel;
	}
	/**
	 * @param devLevelOne the devLevelOne to set
	 */
	public void setDevLevelOne(String devLevelOne) {
		this.devLevel = devLevel;
	}
	/**
	 * @return the devLevelTwo
	 */
	
	
	/**
	 * @param devLevelThree the devLevelThree to set
	 */
	
	/**
	 * @return the hourlyRate
	 */
	public double getHourlyRate() {
		return hourlyRate;
	}
	/**
	 * @param hourlyRate the hourlyRate to set
	 */
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	
	
	
	
	
	
		// TODO Auto-generated constructor stub
	
	

}
