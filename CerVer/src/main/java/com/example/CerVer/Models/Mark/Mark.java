package com.example.CerVer.Models.Mark;
import java.io.Serializable;
import jakarta.persistence.*;



@Entity
@Table(name="marks")
@NamedQuery(name="Mark.findAll", query="SELECT m FROM Mark m")
public class Mark implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int marksId;

	private String grade;

	private int maximumMarks;

	private int obtainedMarks;

	private float percentage;

	public Mark() {
	}

	public int getMarksId() {
		return this.marksId;
	}

	public void setMarksId(int marksId) {
		this.marksId = marksId;
	}

	public String getGrade() {
		return this.grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getMaximumMarks() {
		return this.maximumMarks;
	}

	public void setMaximumMarks(int maximumMarks) {
		this.maximumMarks = maximumMarks;
	}

	public int getObtainedMarks() {
		return this.obtainedMarks;
	}

	public void setObtainedMarks(int obtainedMarks) {
		this.obtainedMarks = obtainedMarks;
	}

	public float getPercentage() {
		return this.percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

}