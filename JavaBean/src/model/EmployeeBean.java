package model;

import java.io.Serializable;

public class EmployeeBean implements Serializable {
	
	private String firstName;
	private String lastName;
	private int startyear;
	private double payRate;
	
	
	public EmployeeBean() {
	}
	
	
	
	/**
	 * @param firstName
	 * @param lastName
	 * @param startyear
	 * @param payRate
	 */
	public EmployeeBean(String firstName, String lastName, int startyear, double payRate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.startyear = startyear;
		this.payRate = payRate;
	}



	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}



	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}



	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	/**
	 * @return the startyear
	 */
	public int getStartyear() {
		return startyear;
	}



	/**
	 * @param startyear the startyear to set
	 */
	public void setStartyear(int startyear) {
		this.startyear = startyear;
	}



	/**
	 * @return the payRate
	 */
	public double getPayRate() {
		return payRate;
	}



	/**
	 * @param payRate the payRate to set
	 */
	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}
	
	
	
	

}
