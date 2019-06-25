package com.assessment.sean;

public class Name {
	private String title;
	private String firstName;
	private String lastName;
	/**
	 * @param title
	 * @param firstName
	 * @param lastName
	 */
	public Name(String title, String firstName, String lastName) {
		super();
		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	/**
	 * @return the title
	 */
	String getTitle() {
		return title;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Name))
			return false;
		Name other = (Name) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	/**
	 * @param title the title to set
	 */
	void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the firstName
	 */
	String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastNameString
	 */
	String getLastNameString() {
		return lastName;
	}
	/**
	 * @param lastNameString the lastNameString to set
	 */
	void setLastNameString(String lastNameString) {
		this.lastName = lastNameString;
	}
	@Override
	public String toString() {
		return "Name [title=" + title + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
