package com.assessment.sean;

import java.time.LocalDate;

public abstract class Employee {
    protected int uniqueId;
    protected Name name;
    protected Department dept;
    protected LocalDate dateStarted;
    protected String phoneNo;
    protected double monthlyPay;
   
	/**
	 * @param uniqueId
	 * @param name2
	 * @param dept2
	 * @param dateStarted
	 * @param phoneNo
	 * @param monthlyPay
	 */
	public Employee(int uniqueId, Name name2, Department dept2, LocalDate dateStarted, String phoneNo) {
		super();
		this.uniqueId = uniqueId;
		this.name = name;
		this.dept = dept;
		this.dateStarted = dateStarted;
		this.phoneNo = phoneNo;
		
	}
	/**
	 * 
	 */
	public Employee() {
		super();
	}
	public Employee(int uniqueId2, Name name2, Department dept2, LocalDate dateStarted2, String phoneNo2,
			double monthlyPay2) {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the uniqueId
	 */
	int getUniqueId() {
		return uniqueId;
	}
	/**
	 * @param uniqueId the uniqueId to set
	 */
	void setUniqueId(int uniqueId) {
		this.uniqueId = uniqueId;
	}
	/**
	 * @return the name
	 */
	Name getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	void setName(Name name) {
		this.name = name;
	}
	/**
	 * @return the dept
	 */
	Department getDept() {
		return dept;
	}
	/**
	 * @param dept the dept to set
	 */
	void setDept(Department dept) {
		this.dept = dept;
	}
	/**
	 * @return the dateStarted
	 */
	LocalDate getDateStarted() {
		return dateStarted;
	}
	/**
	 * @param dateStarted the dateStarted to set
	 */
	void setDateStarted(LocalDate dateStarted) {
		this.dateStarted = dateStarted;
	}
	/**
	 * @return the phoneNo
	 */
	String getPhoneNo() {
		return phoneNo;
	}
	/**
	 * @param phoneNo the phoneNo to set
	 */
	void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
		@Override
	public String toString() {
		return "Employee [uniqueId=" + uniqueId + ", name=" + name + ", dept=" + dept + ", dateStarted=" + dateStarted
				+ ", phoneNo=" + phoneNo + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateStarted == null) ? 0 : dateStarted.hashCode());
		result = prime * result + ((dept == null) ? 0 : dept.hashCode());
		long temp;
		temp = Double.doubleToLongBits(monthlyPay);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phoneNo == null) ? 0 : phoneNo.hashCode());
		result = prime * result + uniqueId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Employee))
			return false;
		Employee other = (Employee) obj;
		if (dateStarted == null) {
			if (other.dateStarted != null)
				return false;
		} else if (!dateStarted.equals(other.dateStarted))
			return false;
		if (dept == null) {
			if (other.dept != null)
				return false;
		} else if (!dept.equals(other.dept))
			return false;
		if (Double.doubleToLongBits(monthlyPay) != Double.doubleToLongBits(other.monthlyPay))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phoneNo == null) {
			if (other.phoneNo != null)
				return false;
		} else if (!phoneNo.equals(other.phoneNo))
			return false;
		if (uniqueId != other.uniqueId)
			return false;
		return true;
	}
    
    
	

}
