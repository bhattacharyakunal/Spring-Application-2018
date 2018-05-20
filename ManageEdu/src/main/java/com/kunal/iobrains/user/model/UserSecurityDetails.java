package com.kunal.iobrains.user.model;

public class UserSecurityDetails {
	private long userId;
	private String securityQuestion1;
	private String securityQuestion2;
	private String securityAnswer1;
	private String securityAnswer2;
	private String emailAddress;
	private String alternateEmailAddress;
	private String phoneNumber;
	private String mobileNumber;
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getSecurityQuestion1() {
		return securityQuestion1;
	}
	public void setSecurityQuestion1(String securityQuestion1) {
		this.securityQuestion1 = securityQuestion1;
	}
	public String getSecurityQuestion2() {
		return securityQuestion2;
	}
	public void setSecurityQuestion2(String securityQuestion2) {
		this.securityQuestion2 = securityQuestion2;
	}
	public String getSecurityAnswer1() {
		return securityAnswer1;
	}
	public void setSecurityAnswer1(String securityAnswer1) {
		this.securityAnswer1 = securityAnswer1;
	}
	public String getSecurityAnswer2() {
		return securityAnswer2;
	}
	public void setSecurityAnswer2(String securityAnswer2) {
		this.securityAnswer2 = securityAnswer2;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getAlternateEmailAddress() {
		return alternateEmailAddress;
	}
	public void setAlternateEmailAddress(String alternateEmailAddress) {
		this.alternateEmailAddress = alternateEmailAddress;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "UserSecurityDetails [userId=" + userId + ", securityQuestion1=" + securityQuestion1
				+ ", securityQuestion2=" + securityQuestion2 + ", securityAnswer1=" + securityAnswer1
				+ ", securityAnswer2=" + securityAnswer2 + ", emailAddress=" + emailAddress + ", alternateEmailAddress="
				+ alternateEmailAddress + ", phoneNumber=" + phoneNumber + ", mobileNumber=" + mobileNumber + "]";
	}
	
}
