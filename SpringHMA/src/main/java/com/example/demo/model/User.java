package com.example.demo.model;

public class User {
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + " ,userPassword=" + userPassword + ",userAge="
				+ userAge + ",userGender=" + userGender + ",userMobileNumber=" + userMobileNumber + ", userMailId="
				+ userMailId + ",userAddressLine1=" + userAddressLine1 + ",userAddressLine2=" + userAddressLine2
				+ ",userAddressLine3=" + userAddressLine3 + ",userRoleId=" + userRoleId + "]";
	}

	public int getuserId() {
		return userId;
	}

	public void setuserId(int userId) {
		this.userId = userId;
	}

	public String getuserName() {
		return userName;
	}

	public void setuserName(String userName) {
		this.userName = userName;
	}

	public String getuserPassword() {
		return userPassword;
	}

	public void setuserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public int getuserAge() {
		return userAge;
	}

	public void setuserAge(int userAge) {
		this.userAge = userAge;
	}

	public String getuserMailId() {
		return userMailId;
	}

	public void setuserMail(String userMailId) {
		this.userMailId = userMailId;
	}

	public String getuserGender() {
		return userGender;
	}

	public void setuserGender(String userGender) {
		this.userGender = userGender;
	}

	public String getuserMobileNumber() {
		return userMobileNumber;
	}

	public void setuserMobileNumber(String userMobileNumber) {
		this.userMobileNumber = userMobileNumber;
	}

	public String getuserAddressLine1() {
		return userAddressLine1;
	}

	public void setuserAddressLine1(String userAddressLine1) {
		this.userAddressLine1 = userAddressLine1;
	}

	public String getuserAddressLine2() {
		return userAddressLine2;
	}

	public void setuserAddressLine2(String userAddressLine2) {
		this.userAddressLine2 = userAddressLine2;
	}

	public String getuserAddressLine3() {
		return userAddressLine3;
	}

	public void setuserAddressLine3(String userAddressLine3) {
		this.userAddressLine3 = userAddressLine3;
	}

	public int getuserRoleId() {
		return userRoleId;
	}

	public void setuserRoleId(int userRoleId) {
		this.userRoleId = userRoleId;
	}

	public int userId;
	public String userName;
	public String userMail;
	public String userPassword;
	public String userGender;
	public int userAge;
	public String userMobileNumber;
	public String userMailId;
	public String userAddressLine1;
	public String userAddressLine2;
	public String userAddressLine3;
	public int userRoleId;

}
