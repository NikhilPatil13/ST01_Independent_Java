package com.medimeet.main.entities;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_appointment")
public class Appointment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer appointmentIdentifier;

	@CreationTimestamp
	private LocalDateTime appointmentBookingDateTime;
	
	private Date appointmentScheduledDate;
	private LocalTime appointmentScheduledTime;

	@Column(columnDefinition = "BOOLEAN DEFAULT FALSE")
	private Boolean isAppointmentSuccessful;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private User appointmentUser;
	
	@ManyToOne(cascade = CascadeType.ALL , fetch = FetchType.EAGER)
	@JoinColumn(name="FK_doctorId")
	private Doctor appointmentDoctor;

	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Appointment(Integer appointmentIdentifier, LocalDateTime appointmentBookingDateTime,
			Date appointmentScheduledDate, LocalTime appointmentScheduledTime, Boolean isAppointmentSuccessful,
			User appointmentUser, Doctor appointmentDoctor) {
		super();
		this.appointmentIdentifier = appointmentIdentifier;
		this.appointmentBookingDateTime = appointmentBookingDateTime;
		this.appointmentScheduledDate = appointmentScheduledDate;
		this.appointmentScheduledTime = appointmentScheduledTime;
		this.isAppointmentSuccessful = isAppointmentSuccessful;
		this.appointmentUser = appointmentUser;
		this.appointmentDoctor = appointmentDoctor;
	}

	public Integer getAppointmentIdentifier() {
		return appointmentIdentifier;
	}

	public void setAppointmentIdentifier(Integer appointmentIdentifier) {
		this.appointmentIdentifier = appointmentIdentifier;
	}

	public LocalDateTime getAppointmentBookingDateTime() {
		return appointmentBookingDateTime;
	}

	public void setAppointmentBookingDateTime(LocalDateTime appointmentBookingDateTime) {
		this.appointmentBookingDateTime = appointmentBookingDateTime;
	}

	public Date getAppointmentScheduledDate() {
		return appointmentScheduledDate;
	}

	public void setAppointmentScheduledDate(Date appointmentScheduledDate) {
		this.appointmentScheduledDate = appointmentScheduledDate;
	}

	public LocalTime getAppointmentScheduledTime() {
		return appointmentScheduledTime;
	}

	public void setAppointmentScheduledTime(LocalTime appointmentScheduledTime) {
		this.appointmentScheduledTime = appointmentScheduledTime;
	}

	public Boolean getIsAppointmentSuccessful() {
		return isAppointmentSuccessful;
	}

	public void setIsAppointmentSuccessful(Boolean isAppointmentSuccessful) {
		this.isAppointmentSuccessful = isAppointmentSuccessful;
	}

	public User getAppointmentUser() {
		return appointmentUser;
	}

	public void setAppointmentUser(User appointmentUser) {
		this.appointmentUser = appointmentUser;
	}

	public Doctor getAppointmentDoctor() {
		return appointmentDoctor;
	}

	public void setAppointmentDoctor(Doctor appointmentDoctor) {
		this.appointmentDoctor = appointmentDoctor;
	}

	@Override
	public String toString() {
		return "Appointment [appointmentIdentifier=" + appointmentIdentifier + ", appointmentBookingDateTime="
				+ appointmentBookingDateTime + ", appointmentScheduledDate=" + appointmentScheduledDate
				+ ", appointmentScheduledTime=" + appointmentScheduledTime + ", isAppointmentSuccessful="
				+ isAppointmentSuccessful + ", appointmentUser=" + appointmentUser + ", appointmentDoctor="
				+ appointmentDoctor + "]";
	}

}
