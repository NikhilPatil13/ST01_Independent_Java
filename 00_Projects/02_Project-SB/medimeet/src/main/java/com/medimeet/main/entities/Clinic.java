package com.medimeet.main.entities;

import java.time.LocalTime;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name="tbl_clinic")
public class Clinic {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer clinicIdentifier;
	
	private String clinicName;
	private Double clinicOpdCharges;
	private String clinicContactNumber;
	private String clinicAddressLine1;
	private String clinicAddressLine2;
	private String clinicCity;
	private String clinicDistrict;
	private String clinicCountry;
	private Integer clinicPincode;
	
	private LocalTime clinicOpenTimeMorninng;
	private LocalTime clinicClosingTimeMorning;
	private LocalTime clinicOpenTimeEvening;
	private LocalTime clinicClosingTimeEvening;
	
	
	@Column(columnDefinition = "BOOLEAN DEFAULT TRUE")
	private Boolean isClinicOpen;
	
	@Lob
	private List<String> clinicImages;
	
	@OneToMany(mappedBy = "doctorClinic" , fetch = FetchType.EAGER)
	private Set<Doctor> clinicDoctors;

	public Clinic() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Clinic(Integer clinicIdentifier, String clinicName, Double clinicOpdCharges, String clinicContactNumber,
			String clinicAddressLine1, String clinicAddressLine2, String clinicCity, String clinicDistrict,
			String clinicCountry, Integer clinicPincode, LocalTime clinicOpenTimeMorninng,
			LocalTime clinicClosingTimeMorning, LocalTime clinicOpenTimeEvening, LocalTime clinicClosingTimeEvening,
			Boolean isClinicOpen, List<String> clinicImages, Set<Doctor> clinicDoctors) {
		super();
		this.clinicIdentifier = clinicIdentifier;
		this.clinicName = clinicName;
		this.clinicOpdCharges = clinicOpdCharges;
		this.clinicContactNumber = clinicContactNumber;
		this.clinicAddressLine1 = clinicAddressLine1;
		this.clinicAddressLine2 = clinicAddressLine2;
		this.clinicCity = clinicCity;
		this.clinicDistrict = clinicDistrict;
		this.clinicCountry = clinicCountry;
		this.clinicPincode = clinicPincode;
		this.clinicOpenTimeMorninng = clinicOpenTimeMorninng;
		this.clinicClosingTimeMorning = clinicClosingTimeMorning;
		this.clinicOpenTimeEvening = clinicOpenTimeEvening;
		this.clinicClosingTimeEvening = clinicClosingTimeEvening;
		this.isClinicOpen = isClinicOpen;
		this.clinicImages = clinicImages;
		this.clinicDoctors = clinicDoctors;
	}

	public Integer getClinicIdentifier() {
		return clinicIdentifier;
	}

	public void setClinicIdentifier(Integer clinicIdentifier) {
		this.clinicIdentifier = clinicIdentifier;
	}

	public String getClinicName() {
		return clinicName;
	}

	public void setClinicName(String clinicName) {
		this.clinicName = clinicName;
	}

	public Double getClinicOpdCharges() {
		return clinicOpdCharges;
	}

	public void setClinicOpdCharges(Double clinicOpdCharges) {
		this.clinicOpdCharges = clinicOpdCharges;
	}

	public String getClinicContactNumber() {
		return clinicContactNumber;
	}

	public void setClinicContactNumber(String clinicContactNumber) {
		this.clinicContactNumber = clinicContactNumber;
	}

	public String getClinicAddressLine1() {
		return clinicAddressLine1;
	}

	public void setClinicAddressLine1(String clinicAddressLine1) {
		this.clinicAddressLine1 = clinicAddressLine1;
	}

	public String getClinicAddressLine2() {
		return clinicAddressLine2;
	}

	public void setClinicAddressLine2(String clinicAddressLine2) {
		this.clinicAddressLine2 = clinicAddressLine2;
	}

	public String getClinicCity() {
		return clinicCity;
	}

	public void setClinicCity(String clinicCity) {
		this.clinicCity = clinicCity;
	}

	public String getClinicDistrict() {
		return clinicDistrict;
	}

	public void setClinicDistrict(String clinicDistrict) {
		this.clinicDistrict = clinicDistrict;
	}

	public String getClinicCountry() {
		return clinicCountry;
	}

	public void setClinicCountry(String clinicCountry) {
		this.clinicCountry = clinicCountry;
	}

	public Integer getClinicPincode() {
		return clinicPincode;
	}

	public void setClinicPincode(Integer clinicPincode) {
		this.clinicPincode = clinicPincode;
	}

	public LocalTime getClinicOpenTimeMorninng() {
		return clinicOpenTimeMorninng;
	}

	public void setClinicOpenTimeMorninng(LocalTime clinicOpenTimeMorninng) {
		this.clinicOpenTimeMorninng = clinicOpenTimeMorninng;
	}

	public LocalTime getClinicClosingTimeMorning() {
		return clinicClosingTimeMorning;
	}

	public void setClinicClosingTimeMorning(LocalTime clinicClosingTimeMorning) {
		this.clinicClosingTimeMorning = clinicClosingTimeMorning;
	}

	public LocalTime getClinicOpenTimeEvening() {
		return clinicOpenTimeEvening;
	}

	public void setClinicOpenTimeEvening(LocalTime clinicOpenTimeEvening) {
		this.clinicOpenTimeEvening = clinicOpenTimeEvening;
	}

	public LocalTime getClinicClosingTimeEvening() {
		return clinicClosingTimeEvening;
	}

	public void setClinicClosingTimeEvening(LocalTime clinicClosingTimeEvening) {
		this.clinicClosingTimeEvening = clinicClosingTimeEvening;
	}

	public Boolean getIsClinicOpen() {
		return isClinicOpen;
	}

	public void setIsClinicOpen(Boolean isClinicOpen) {
		this.isClinicOpen = isClinicOpen;
	}

	public List<String> getClinicImages() {
		return clinicImages;
	}

	public void setClinicImages(List<String> clinicImages) {
		this.clinicImages = clinicImages;
	}

	public Set<Doctor> getClinicDoctors() {
		return clinicDoctors;
	}

	public void setClinicDoctors(Set<Doctor> clinicDoctors) {
		this.clinicDoctors = clinicDoctors;
	}

	@Override
	public String toString() {
		return "Clinic [clinicIdentifier=" + clinicIdentifier + ", clinicName=" + clinicName + ", clinicOpdCharges="
				+ clinicOpdCharges + ", clinicContactNumber=" + clinicContactNumber + ", clinicAddressLine1="
				+ clinicAddressLine1 + ", clinicAddressLine2=" + clinicAddressLine2 + ", clinicCity=" + clinicCity
				+ ", clinicDistrict=" + clinicDistrict + ", clinicCountry=" + clinicCountry + ", clinicPincode="
				+ clinicPincode + ", clinicOpenTimeMorninng=" + clinicOpenTimeMorninng + ", clinicClosingTimeMorning="
				+ clinicClosingTimeMorning + ", clinicOpenTimeEvening=" + clinicOpenTimeEvening
				+ ", clinicClosingTimeEvening=" + clinicClosingTimeEvening + ", isClinicOpen=" + isClinicOpen
				+ ", clinicImages=" + clinicImages + ", clinicDoctors=" + clinicDoctors + "]";
	}
	
}
