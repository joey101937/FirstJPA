package Composition;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table
public class Address {
	
	@OneToOne
	private Employee employee;
	
	@Id
	@GeneratedValue
	private int addressId;

	private String addressName;

	private int zipCode;

	
	public Address(){
		
	}
	
	
	public Address(Employee employee, String addressName, int zipCode) {
		super();
		this.employee = employee;
		this.addressName = addressName;
		this.zipCode = zipCode;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getAddressName() {
		return addressName;
	}

	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	
	
}
