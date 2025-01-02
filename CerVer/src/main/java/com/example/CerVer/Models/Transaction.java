package com.example.CerVer.Models;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


@Entity
public class Transaction {

	private BigDecimal amount;

	private String description;

	@Temporal(TemporalType.DATE)
	private Date transactionDate;

	private int transactionId;

	private String transactionType;

	private String userId;

	private int verificationId;

	public Transaction() {
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getTransactionDate() {
		return this.transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public int getTransactionId() {
		return this.transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public String getTransactionType() {
		return this.transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getVerificationId() {
		return this.verificationId;
	}

	public void setVerificationId(int verificationId) {
		this.verificationId = verificationId;
	}

}