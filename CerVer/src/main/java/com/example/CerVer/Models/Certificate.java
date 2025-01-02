package com.example.CerVer.Models;
import jakarta.persistence.*;
import java.util.Date;


	@Entity
	public class Certificate {

		private String certificateId;

		@Temporal(TemporalType.DATE)
		private Date completion_Date;

		private String course_Name;

		@Temporal(TemporalType.DATE)
		private Date enrollment_Date;

		private String grade;

		private int marksId;

		private int prn;

		private String student_Name;

		public Certificate() {
		}

		public String getCertificateId() {
			return this.certificateId;
		}

		public void setCertificateId(String certificateId) {
			this.certificateId = certificateId;
		}

		public Date getCompletion_Date() {
			return this.completion_Date;
		}

		public void setCompletion_Date(Date completion_Date) {
			this.completion_Date = completion_Date;
		}

		public String getCourse_Name() {
			return this.course_Name;
		}

		public void setCourse_Name(String course_Name) {
			this.course_Name = course_Name;
		}

		public Date getEnrollment_Date() {
			return this.enrollment_Date;
		}

		public void setEnrollment_Date(Date enrollment_Date) {
			this.enrollment_Date = enrollment_Date;
		}

		public String getGrade() {
			return this.grade;
		}

		public void setGrade(String grade) {
			this.grade = grade;
		}

		public int getMarksId() {
			return this.marksId;
		}

		public void setMarksId(int marksId) {
			this.marksId = marksId;
		}

		public int getPrn() {
			return this.prn;
		}

		public void setPrn(int prn) {
			this.prn = prn;
		}

		public String getStudent_Name() {
			return this.student_Name;
		}

		public void setStudent_Name(String student_Name) {
			this.student_Name = student_Name;
		}

	}

