package com.medimeet.main.entities;

import java.util.Date;
import java.util.Set;

import org.hibernate.annotations.CurrentTimestamp;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.medimeet.main.enums.UserRoles;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_doctor")
public class Doctor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer doctorIdentifier;
	
	private String username;
	private String password;
	
	private String doctorFirstName;
	private String doctorLastName;
	private String doctorLicense;
	private String doctorEmailId;
	private Long doctorContactNumber;
	private String doctorSpecilization;
	private Double experienceInYears;
	private String doctorGender;

	private UserRoles userRole;
	
	@CurrentTimestamp
	@Column(updatable = false)
	private Date doctorRegistrationDate;

	@Lob
	private String doctorProfileImage;
	
	@ManyToOne(cascade = CascadeType.ALL , fetch = FetchType.EAGER)
	@JoinColumn(name="FK_clinicId")
	private Clinic doctorClinic;

	@OneToMany(mappedBy = "appointmentDoctor", cascade = CascadeType.ALL , fetch = FetchType.EAGER)
	private Set<Appointment> doctorAppointments;

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doctor(Integer doctorIdentifier, String username, String password, String doctorFirstName,
			String doctorLastName, String doctorLicense, String doctorEmailId, Long doctorContactNumber,
			String doctorSpecilization, Double experienceInYears, String doctorGender, UserRoles userRole,
			Date doctorRegistrationDate, String doctorProfileImage, Clinic doctorClinic,
			Set<Appointment> doctorAppointments) {
		super();
		this.doctorIdentifier = doctorIdentifier;
		this.username = username;
		this.password = password;
		this.doctorFirstName = doctorFirstName;
		this.doctorLastName = doctorLastName;
		this.doctorLicense = doctorLicense;
		this.doctorEmailId = doctorEmailId;
		this.doctorContactNumber = doctorContactNumber;
		this.doctorSpecilization = doctorSpecilization;
		this.experienceInYears = experienceInYears;
		this.doctorGender = doctorGender;
		this.userRole = userRole;
		this.doctorRegistrationDate = doctorRegistrationDate;
		this.doctorProfileImage = doctorProfileImage;
		this.doctorClinic = doctorClinic;
		this.doctorAppointments = doctorAppointments;
	}

	public Integer getDoctorIdentifier() {
		return doctorIdentifier;
	}

	public void setDoctorIdentifier(Integer doctorIdentifier) {
		this.doctorIdentifier = doctorIdentifier;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDoctorFirstName() {
		return doctorFirstName;
	}

	public void setDoctorFirstName(String doctorFirstName) {
		this.doctorFirstName = doctorFirstName;
	}

	public String getDoctorLastName() {
		return doctorLastName;
	}

	public void setDoctorLastName(String doctorLastName) {
		this.doctorLastName = doctorLastName;
	}

	public String getDoctorLicense() {
		return doctorLicense;
	}

	public void setDoctorLicense(String doctorLicense) {
		this.doctorLicense = doctorLicense;
	}

	public String getDoctorEmailId() {
		return doctorEmailId;
	}

	public void setDoctorEmailId(String doctorEmailId) {
		this.doctorEmailId = doctorEmailId;
	}

	public Long getDoctorContactNumber() {
		return doctorContactNumber;
	}

	public void setDoctorContactNumber(Long doctorContactNumber) {
		this.doctorContactNumber = doctorContactNumber;
	}

	public String getDoctorSpecilization() {
		return doctorSpecilization;
	}

	public void setDoctorSpecilization(String doctorSpecilization) {
		this.doctorSpecilization = doctorSpecilization;
	}

	public Double getExperienceInYears() {
		return experienceInYears;
	}

	public void setExperienceInYears(Double experienceInYears) {
		this.experienceInYears = experienceInYears;
	}

	public String getDoctorGender() {
		return doctorGender;
	}

	public void setDoctorGender(String doctorGender) {
		this.doctorGender = doctorGender;
	}

	public UserRoles getUserRole() {
		return userRole;
	}

	public void setUserRole(UserRoles userRole) {
		this.userRole = userRole;
	}

	public Date getDoctorRegistrationDate() {
		return doctorRegistrationDate;
	}

	public void setDoctorRegistrationDate(Date doctorRegistrationDate) {
		this.doctorRegistrationDate = doctorRegistrationDate;
	}

	public String getDoctorProfileImage() {
		return doctorProfileImage;
	}

	public void setDoctorProfileImage(String doctorProfileImage) {
		this.doctorProfileImage = doctorProfileImage;
	}

	public Clinic getDoctorClinic() {
		return doctorClinic;
	}

	public void setDoctorClinic(Clinic doctorClinic) {
		this.doctorClinic = doctorClinic;
	}

	public Set<Appointment> getDoctorAppointments() {
		return doctorAppointments;
	}

	public void setDoctorAppointments(Set<Appointment> doctorAppointments) {
		this.doctorAppointments = doctorAppointments;
	}

	@Override
	public String toString() {
		return "Doctor [doctorIdentifier=" + doctorIdentifier + ", username=" + username + ", password=" + password
				+ ", doctorFirstName=" + doctorFirstName + ", doctorLastName=" + doctorLastName + ", doctorLicense="
				+ doctorLicense + ", doctorEmailId=" + doctorEmailId + ", doctorContactNumber=" + doctorContactNumber
				+ ", doctorSpecilization=" + doctorSpecilization + ", experienceInYears=" + experienceInYears
				+ ", doctorGender=" + doctorGender + ", userRole=" + userRole + ", doctorRegistrationDate="
				+ doctorRegistrationDate + ", doctorProfileImage=" + doctorProfileImage + ", doctorClinic="
				+ doctorClinic + ", doctorAppointments=" + doctorAppointments + "]";
	}

}


