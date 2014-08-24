package com.onestore.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the user_details database table.
 * 
 */
@Entity
@Table(name="user_details")
public class UserDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int user_ID;

	private String email;

	private String firstName;

	private boolean home_Delivery;

	private String lastName;

	private String password;

	private String role;

	//bi-directional many-to-one association to UserAddress
	@OneToMany(mappedBy="userDetail", cascade=CascadeType.ALL)
	private Set<UserAddress> userAddresses;

    public UserDetail() {
    }

	public int getUser_ID() {
		return this.user_ID;
	}

	public void setUser_ID(int user_ID) {
		this.user_ID = user_ID;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public boolean isHome_Delivery() {
		return home_Delivery;
	}

	public void setHome_Delivery(boolean home_Delivery) {
		this.home_Delivery = home_Delivery;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Set<UserAddress> getUserAddresses() {
		return this.userAddresses;
	}

	public void setUserAddresses(Set<UserAddress> userAddresses) {
		this.userAddresses = userAddresses;
	}
	
}