package com.assessment.sean;

import java.time.LocalDate;

public class Manager extends Employee {
	int noOfStaff;
	double salary;
	double bonus ;
	/**
	 * @param uniqueId
	 * @param name2
	 * @param dept2
	 * @param dateStarted
	 * @param phoneNo
	 * @param noOfStaff
	 * @param salary
	 * @param bonus
	 */
	public Manager(int uniqueId, Name name2, Department dept2, LocalDate dateStarted, String phoneNo, int noOfStaff,
			double salary, double bonus) {
		super(uniqueId, name2, dept2, dateStarted, phoneNo, bonus);
		this.noOfStaff = noOfStaff;
		this.salary = salary;
		this.bonus = bonus;
	}
	
	/**
	 * @param uniqueId
	 * @param name2
	 * @param dept2
	 * @param dateStarted
	 * @param phoneNo
	 */
	public Manager(int uniqueId, Name name2, Department dept2, LocalDate dateStarted, String phoneNo) {
		super(uniqueId, name2, dept2, dateStarted, phoneNo);
	}

	/**
	 * @return the noOfStaff
	 */
	public int getNoOfStaff() {
		return noOfStaff;
	}

	/**
	 * @param noOfStaff the noOfStaff to set
	 */
	public void setNoOfStaff(int noOfStaff) {
		this.noOfStaff = noOfStaff;
	}

	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	/**
	 * @return the bonus
	 */
	public double getBonus() {
		return bonus;
	}

	/**
	 * @param bonus the bonus to set
	 */
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "Manager [noOfStaff=" + noOfStaff + ", salary=" + salary + ", bonus=" + bonus + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(bonus);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + noOfStaff;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		if (noOfStaff != other.noOfStaff)
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	

}
