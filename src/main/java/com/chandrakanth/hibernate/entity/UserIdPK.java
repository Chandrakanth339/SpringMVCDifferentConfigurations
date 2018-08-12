package com.chandrakanth.hibernate.entity;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * This entity is the embeddable table having User Credentials
 */
@Embeddable
@Access(AccessType.FIELD)
public class UserIdPK implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "USER_NAME", insertable = true, updatable = false, unique = true)
	private String userName;

	@Column(name = "MOBILE_NUMBER", insertable = true, updatable = true, unique = true)
	private String mobileNumber;

	public UserIdPK() {
		super();
	}

	public UserIdPK(String userName, String mobileNumber) {
		super();
		this.userName = userName;
		this.mobileNumber = mobileNumber;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mobileNumber == null) ? 0 : mobileNumber.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserIdPK other = (UserIdPK) obj;
		if (mobileNumber == null) {
			if (other.mobileNumber != null)
				return false;
		} else if (!mobileNumber.equals(other.mobileNumber))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}

}
