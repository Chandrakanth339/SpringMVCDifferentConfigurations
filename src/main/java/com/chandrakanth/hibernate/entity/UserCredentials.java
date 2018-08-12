package com.chandrakanth.hibernate.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * @author Chandrakanth
 */
/**
 * This Entity handles the User Credentials for the login in UserFinancialSystem
 * Portal
 */
@Entity
@Table(name = "USER_CREDENTIALS")
@Access(value = AccessType.FIELD)
public class UserCredentials implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UserIdPK userId;

	@Column(name = "PASSWORD", nullable = false, updatable = true, insertable = true)
	private String passWord;

	// DEFAULT VALUE IS MAINTAINED AS 'Y' in DB
	@Column(name = "ACTIVE_STATUS", insertable = false, updatable = true)
	private Character activeStatus;

	@Column(name = "CREATED_DATETIME", nullable = false, insertable = true, updatable = false)
	private Timestamp createdDateTime;

	@Column(name = "MODIFIED_DATETIME", nullable = false)
	private Timestamp modifiedDateTime;

	public UserIdPK getUserId() {
		return userId;
	}

	public void setUserId(UserIdPK userId) {
		this.userId = userId;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public Character getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(Character activeStatus) {
		this.activeStatus = activeStatus;
	}

	public Timestamp getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(Timestamp createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public Timestamp getModifiedDateTime() {
		return modifiedDateTime;
	}

	public void setModifiedDateTime(Timestamp modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime;
	}

	/* To Perform an action just before insert statement */
/*	@PrePersist
	private void updateTimestamps() {
		LOGGER.info("Setting Timestamps");
		createdDateTime = new Timestamp(System.currentTimeMillis());
		LOGGER.info("Created Date Time:\t" + createdDateTime);
		modifiedDateTime = new Timestamp(System.currentTimeMillis());
		LOGGER.info("Updated DateTime\t" + modifiedDateTime);
	}

	 To Perform an action just before update statement 
	@PreUpdate
	private void updateModifiedTimeStamp() {
		modifiedDateTime = new Timestamp(System.currentTimeMillis());
	}*/
}
