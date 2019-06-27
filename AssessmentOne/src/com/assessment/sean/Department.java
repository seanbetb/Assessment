package com.assessment.sean;

import java.util.Objects;

public class Department {
	private int deptId;
	private String deptName;
	private int noOfEmployees;
	/**
	 * @param deptId
	 * @param deptName
	 * @param noOfEmployees
	 */
	public Department(int deptId, String deptName, int noOfEmployees) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.noOfEmployees = noOfEmployees;
	}
	/**
	 * @return the deptId
	 */
	int getDeptId() {
		return deptId;
	}
	/**
	 * @param deptId the deptId to set
	 */
	void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	/**
	 * @return the deptName
	 */
	String getDeptName() {
		return deptName;
	}
	/**
	 * @param deptName the deptName to set
	 */
	void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	/**
	 * @return the noOfEmployees
	 */
	int getNoOfEmployees() {
		return noOfEmployees;
	}
	/**
	 * @param noOfEmployees the noOfEmployees to set
	 */
	void setNoOfEmployees(int noOfEmployees) {
		this.noOfEmployees = noOfEmployees;
	}
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", noOfEmployees=" + noOfEmployees + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(deptId, deptName, noOfEmployees);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Department))
			return false;
		Department other = (Department) obj;
		return Objects.equals(deptId, other.deptId) && Objects.equals(deptName, other.deptName)
				&& Objects.equals(noOfEmployees, other.noOfEmployees);
	}

	
	
	

}
