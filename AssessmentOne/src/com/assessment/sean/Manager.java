package com.assessment.sean;

import java.time.LocalDate;

public class Manager extends Employee {
	int noOfStaff;
	double monthlyPay;
	double bonus ;
	/**
	 * @param uniqueId
	 * @param name
	 * @param dept
	 * @param dateStarted
	 * @param phoneNo
	 * @param monthlyPay
	 * @param noOfStaff
	 * @param monthlyPay2
	 * @param bonus
	 */
	public Manager(int uniqueId, Name name, Department dept, LocalDate dateStarted, String phoneNo, double monthlyPay,
			int noOfStaff, double monthlyPay2, double bonus) {
		super(uniqueId, name, dept, dateStarted, phoneNo, monthlyPay);
		this.noOfStaff = noOfStaff;
		monthlyPay = monthlyPay2;
		this.bonus = bonus;
	}
	/**
	 * @return the noOfStaff
	 */
	int getNoOfStaff() {
		return noOfStaff;
	}
	/**
	 * @param noOfStaff the noOfStaff to set
	 */
	void setNoOfStaff(int noOfStaff) {
		this.noOfStaff = noOfStaff;
	}
	/**
	 * @return the monthlyPay
	 */
	double getMonthlyPay() {
		return monthlyPay;
	}
	/**
	 * @param monthlyPay the monthlyPay to set
	 */
	void setMonthlyPay(double monthlyPay) {
		this.monthlyPay = monthlyPay;
	}
	/**
	 * @return the bonus
	 */
	double getBonus() {
		return bonus;
	}
	/**
	 * @param bonus the bonus to set
	 */
	void setBonus(double bonus) {
		this.bonus = bonus;
	}
	@Override
	public String toString() {
		return "Manager [noOfStaff=" + noOfStaff + ", monthlyPay=" + monthlyPay + ", bonus=" + bonus + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(bonus);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(monthlyPay);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + noOfStaff;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Manager))
			return false;
		Manager other = (Manager) obj;
		if (Double.doubleToLongBits(bonus) != Double.doubleToLongBits(other.bonus))
			return false;
		if (Double.doubleToLongBits(monthlyPay) != Double.doubleToLongBits(other.monthlyPay))
			return false;
		if (noOfStaff != other.noOfStaff)
			return false;
		return true;
	}
	/**
	 * 
	 */
	public Manager() {
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
	public Manager(int uniqueId, Name name, Department dept, LocalDate dateStarted, String phoneNo, double monthlyPay) {
		super(uniqueId, name, dept, dateStarted, phoneNo, monthlyPay);
		// TODO Auto-generated constructor stub
	}
	
	

}
