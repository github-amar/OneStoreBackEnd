package com.onestore.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the user_address database table.
 * 
 */
@Entity
@Table(name="user_address")
public class UserAddress implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int addressId;

	private String addressLine1;

	private String addressLine2;

	private String country;

	private String landMark;

	private String mobileNumber;

	private String pincode;

	private String state;

	private String townorCity;

	//bi-directional many-to-one association to UserDetail
    @ManyToOne
	@JoinColumn(name="UserAddressID")
	private UserDetail userDetail;

    public UserAddress() {
    }

	public int getAddressId() {
		return this.addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getAddressLine1() {
		return this.addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return this.addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLandMark() {
		return this.landMark;
	}

	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}

	public String getMobileNumber() {
		return this.mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPincode() {
		return this.pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getTownorCity() {
		return this.townorCity;
	}

	public void setTownorCity(String townorCity) {
		this.townorCity = townorCity;
	}

	public UserDetail getUserDetail() {
		return this.userDetail;
	}

	public void setUserDetail(UserDetail userDetail) {
		this.userDetail = userDetail;
	}
	
}