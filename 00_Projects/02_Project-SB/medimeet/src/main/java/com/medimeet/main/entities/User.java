package com.medimeet.main.entities;

import java.util.Date;
import java.util.Set;

import org.hibernate.annotations.CurrentTimestamp;

import com.medimeet.main.enums.UserRoles;

import jakarta.persistence.CascadeType;
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
@Table(name="tbl_user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userIdentifier;
	
	@Column(unique = true)
	private String username;
	private String password;

	private String userFirstName;
	private String userLastName;
	private String userEmailId;
	private String userGender;
	private String userDob;	
	private Long userContactDetails;
	
	@Lob
	@Column(columnDefinition = "LONGTEXT")
	private String userProfileImage;
	
	@CurrentTimestamp
	@Column(updatable = false)
	private Date userRegistrationDate;

	private Boolean isPatient;
	
	@OneToMany(cascade = CascadeType.ALL , fetch = FetchType.EAGER) 
	private Set<Appointment> userAppointment;
	
	@OneToMany(cascade = CascadeType.ALL , fetch = FetchType.EAGER)
	private Set<Prescription> userPrescription;
	
	private UserRoles userRole; 
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Integer userIdentifier, String username, String password, String userFirstName, String userLastName,
			String userEmailId, String userGender, String userDob, Long userContactDetails, String userProfileImage,
			Date userRegistrationDate, Boolean isPatient, Set<Appointment> userAppointment,
			Set<Prescription> userPrescription, UserRoles userRole) {
		super();
		this.userIdentifier = userIdentifier;
		this.username = username;
		this.password = password;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.userEmailId = userEmailId;
		this.userGender = userGender;
		this.userDob = userDob;
		this.userContactDetails = userContactDetails;
		this.userProfileImage = userProfileImage;
		this.userRegistrationDate = userRegistrationDate;
		this.isPatient = isPatient;
		this.userAppointment = userAppointment;
		this.userPrescription = userPrescription;
		this.userRole = userRole;
	}

	public Integer getUserIdentifier() {
		return userIdentifier;
	}

	public void setUserIdentifier(Integer userIdentifier) {
		this.userIdentifier = userIdentifier;
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

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public String getUserEmailId() {
		return userEmailId;
	}

	public void setUserEmailId(String userEmailId) {
		this.userEmailId = userEmailId;
	}

	public String getUserGender() {
		return userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	public String getUserDob() {
		return userDob;
	}

	public void setUserDob(String userDob) {
		this.userDob = userDob;
	}

	public Long getUserContactDetails() {
		return userContactDetails;
	}

	public void setUserContactDetails(Long userContactDetails) {
		this.userContactDetails = userContactDetails;
	}

	public String getUserProfileImage() {
		return userProfileImage;
	}

	public void setUserProfileImage(String userProfileImage) {
		this.userProfileImage = userProfileImage;
	}

	public Date getUserRegistrationDate() {
		return userRegistrationDate;
	}

	public void setUserRegistrationDate(Date userRegistrationDate) {
		this.userRegistrationDate = userRegistrationDate;
	}

	public Boolean getIsPatient() {
		return isPatient;
	}

	public void setIsPatient(Boolean isPatient) {
		this.isPatient = isPatient;
	}

	public Set<Appointment> getUserAppointment() {
		return userAppointment;
	}

	public void setUserAppointment(Set<Appointment> userAppointment) {
		this.userAppointment = userAppointment;
	}

	public Set<Prescription> getUserPrescription() {
		return userPrescription;
	}

	public void setUserPrescription(Set<Prescription> userPrescription) {
		this.userPrescription = userPrescription;
	}

	public UserRoles getUserRole() {
		return userRole;
	}

	public void setUserRole(UserRoles userRole) {
		this.userRole = userRole;
	}

	@Override
	public String toString() {
		return "User [userIdentifier=" + userIdentifier + ", username=" + username + ", password=" + password
				+ ", userFirstName=" + userFirstName + ", userLastName=" + userLastName + ", userEmailId=" + userEmailId
				+ ", userGender=" + userGender + ", userDob=" + userDob + ", userContactDetails=" + userContactDetails
				+ ", userProfileImage=" + userProfileImage + ", userRegistrationDate=" + userRegistrationDate
				+ ", isPatient=" + isPatient + ", userAppointment=" + userAppointment + ", userPrescription="
				+ userPrescription + ", userRole=" + userRole + "]";
	}

}
