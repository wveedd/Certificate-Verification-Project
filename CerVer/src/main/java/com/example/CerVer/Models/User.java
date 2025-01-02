package com.example.CerVer.Models;
import jakarta.persistence.*;


	@Entity
	public class User {
		
		private String address;

		private String designation;

		private String email;

		private String organization;

		private String phoneNumber;

		private String reasonForVerification;

		private String typeOfUser;

		private String userId;

		private String userName;

		private String userPassword;

		public User() {
		}

		public String getAddress() {
			return this.address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getDesignation() {
			return this.designation;
		}

		public void setDesignation(String designation) {
			this.designation = designation;
		}

		public String getEmail() {
			return this.email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getOrganization() {
			return this.organization;
		}

		public void setOrganization(String organization) {
			this.organization = organization;
		}

		public String getPhoneNumber() {
			return this.phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getReasonForVerification() {
			return this.reasonForVerification;
		}

		public void setReasonForVerification(String reasonForVerification) {
			this.reasonForVerification = reasonForVerification;
		}

		public String getTypeOfUser() {
			return this.typeOfUser;
		}

		public void setTypeOfUser(String typeOfUser) {
			this.typeOfUser = typeOfUser;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getUserPassword() {
			return this.userPassword;
		}

		public void setUserPassword(String userPassword) {
			this.userPassword = userPassword;
		}

	}

