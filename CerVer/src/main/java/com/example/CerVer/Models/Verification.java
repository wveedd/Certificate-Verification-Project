package com.example.CerVer.Models;
import jakarta.persistence.*;
import java.util.Date;


@Entity
public class Verification {

	private String certificateId;

	private String status;

	private String type;

	private int verificationId;

	@Temporal(TemporalType.DATE)
	private Date verifiedDate;

	public Verification() {
	}

	public String getCertificateId() {
		return this.certificateId;
	}

	public void setCertificateId(String certificateId) {
		this.certificateId = certificateId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getVerificationId() {
		return this.verificationId;
	}

	public void setVerificationId(int verificationId) {
		this.verificationId = verificationId;
	}

	public Date getVerifiedDate() {
		return this.verifiedDate;
	}

	public void setVerifiedDate(Date verifiedDate) {
		this.verifiedDate = verifiedDate;
	}

}