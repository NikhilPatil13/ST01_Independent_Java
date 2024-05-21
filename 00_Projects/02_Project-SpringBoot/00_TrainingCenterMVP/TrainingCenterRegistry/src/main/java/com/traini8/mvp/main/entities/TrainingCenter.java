package com.traini8.mvp.main.entities;

import java.time.LocalDateTime;
import java.util.List;


import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import jakarta.validation.constraints.Pattern;

@Entity
@Table(name="tbl_trainingCenter")
public class TrainingCenter {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer trainingCenterIdentifier;
	
	@Column(length = 40)
	private String centerName;
	
	@Column
	//@Pattern(regexp ="[a-zA-Z0-9] {20}")
	private String centerCode;
	
	@Embedded
	private Address address;
	
	private Integer studentCapacity;
	
	@ElementCollection
	private List<String> coursesOffered;
	
	@Column(nullable = false , updatable = false)
	@CreationTimestamp
	private LocalDateTime createdOn;
	
	private String contactEmailId;
	private String contactPhoneNo;
	
	
	public TrainingCenter() {
		super();
	}


	public TrainingCenter(Integer trainingCenterIdentifier, String centerName,
			@Pattern(regexp = "[a-zA-Z0-9] {20}") String centerCode, Address address, Integer studentCapacity,
			List<String> coursesOffered, LocalDateTime createdOn, String contactEmailId, String contactPhoneNo) {
		super();
		this.trainingCenterIdentifier = trainingCenterIdentifier;
		this.centerName = centerName;
		this.centerCode = centerCode;
		this.address = address;
		this.studentCapacity = studentCapacity;
		this.coursesOffered = coursesOffered;
		this.createdOn = createdOn;
		this.contactEmailId = contactEmailId;
		this.contactPhoneNo = contactPhoneNo;
	}


	public Integer getTrainingCenterIdentifier() {
		return trainingCenterIdentifier;
	}


	public void setTrainingCenterIdentifier(Integer trainingCenterIdentifier) {
		this.trainingCenterIdentifier = trainingCenterIdentifier;
	}


	public String getCenterName() {
		return centerName;
	}


	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}


	public String getCenterCode() {
		return centerCode;
	}


	public void setCenterCode(String centerCode) {
		this.centerCode = centerCode;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public Integer getStudentCapacity() {
		return studentCapacity;
	}


	public void setStudentCapacity(Integer studentCapacity) {
		this.studentCapacity = studentCapacity;
	}


	public List<String> getCoursesOffered() {
		return coursesOffered;
	}


	public void setCoursesOffered(List<String> coursesOffered) {
		this.coursesOffered = coursesOffered;
	}


	public LocalDateTime getCreatedOn() {
		return createdOn;
	}


	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}


	public String getContactEmailId() {
		return contactEmailId;
	}


	public void setContactEmailId(String contactEmailId) {
		this.contactEmailId = contactEmailId;
	}


	public String getContactPhoneNo() {
		return contactPhoneNo;
	}


	public void setContactPhoneNo(String contactPhoneNo) {
		this.contactPhoneNo = contactPhoneNo;
	}


	@Override
	public String toString() {
		return "TrainingCenter [trainingCenterIdentifier=" + trainingCenterIdentifier + ", centerName=" + centerName
				+ ", centerCode=" + centerCode + ", address=" + address + ", studentCapacity=" + studentCapacity
				+ ", coursesOffered=" + coursesOffered + ", createdOn=" + createdOn + ", contactEmailId="
				+ contactEmailId + ", contactPhoneNo=" + contactPhoneNo + "]";
	}
	
}
