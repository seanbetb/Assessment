package com.assessment.sean;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DepartmentTest {
	Department myDepartment = new Department(1, "DevOps", 3);

	@Test
	final void testGetDeptId() {
		Department myDepartment = new Department(1, "DevOps", 3);
		assertEquals(1, myDepartment.getDeptId(), "Department ID Test");
	}

	@Test
	final void testSetDeptId() {
		Department myDepartment = new Department(1, "DevOps", 3);
		myDepartment.setDeptId(2);
		assertEquals(2,myDepartment.getDeptId(), "Assert Getter");
		
	}

	@Test
	final void testGetDeptName() {
		Department myDepartment = new Department(1, "DevOps", 3);
		assertTrue( myDepartment.getDeptName().equals("DevOps"), "Department ID Test");
	}

	@Test
	final void testSetDeptName() {
		Department myDepartment = new Department(1, "DevOps", 3);
		myDepartment.setDeptName("Marketing");
		assertTrue( myDepartment.getDeptName().equals ("Marketing"), "Test set department name");
		
	}

	@Test
	final void testGetNoOfEmployees() {
		Department myDepartment = new Department(1, "DevOps", 3);
		assertEquals(3,myDepartment.getNoOfEmployees());
	}

	@Test
	final void testSetNoOfEmployees() {
		Department myDepartment = new Department(1, "DevOps", 3);
		myDepartment.setNoOfEmployees(2);
		
	}
	
	
	

}
