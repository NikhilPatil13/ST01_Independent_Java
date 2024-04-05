package com.medimeet.main.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_prescription")
public class Prescription {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer prescriptionIdentifier;
	
	private Integer ageOfPatient;
	private Double weightOfPatient;
	private Integer heightOfPatient;
	
	private List<String> prescribedMedicines;
	
	// jyane appointment ghetli ahe toch....	
	@OneToOne(fetch = FetchType.EAGER)
	private Appointment prescriptionAppointment;

	public Prescription() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Prescription(Integer prescriptionIdentifier, Integer ageOfPatient, Double weightOfPatient,
			Integer heightOfPatient, List<String> prescribedMedicines, Appointment prescriptionAppointment) {
		super();
		this.prescriptionIdentifier = prescriptionIdentifier;
		this.ageOfPatient = ageOfPatient;
		this.weightOfPatient = weightOfPatient;
		this.heightOfPatient = heightOfPatient;
		this.prescribedMedicines = prescribedMedicines;
		this.prescriptionAppointment = prescriptionAppointment;
	}

	public Integer getPrescriptionIdentifier() {
		return prescriptionIdentifier;
	}

	public void setPrescriptionIdentifier(Integer prescriptionIdentifier) {
		this.prescriptionIdentifier = prescriptionIdentifier;
	}

	public Integer getAgeOfPatient() {
		return ageOfPatient;
	}

	public void setAgeOfPatient(Integer ageOfPatient) {
		this.ageOfPatient = ageOfPatient;
	}

	public Double getWeightOfPatient() {
		return weightOfPatient;
	}

	public void setWeightOfPatient(Double weightOfPatient) {
		this.weightOfPatient = weightOfPatient;
	}

	public Integer getHeightOfPatient() {
		return heightOfPatient;
	}

	public void setHeightOfPatient(Integer heightOfPatient) {
		this.heightOfPatient = heightOfPatient;
	}

	public List<String> getPrescribedMedicines() {
		return prescribedMedicines;
	}

	public void setPrescribedMedicines(List<String> prescribedMedicines) {
		this.prescribedMedicines = prescribedMedicines;
	}

	public Appointment getPrescriptionAppointment() {
		return prescriptionAppointment;
	}

	public void setPrescriptionAppointment(Appointment prescriptionAppointment) {
		this.prescriptionAppointment = prescriptionAppointment;
	}

	@Override
	public String toString() {
		return "Prescription [prescriptionIdentifier=" + prescriptionIdentifier + ", ageOfPatient=" + ageOfPatient
				+ ", weightOfPatient=" + weightOfPatient + ", heightOfPatient=" + heightOfPatient
				+ ", prescribedMedicines=" + prescribedMedicines + ", prescriptionAppointment="
				+ prescriptionAppointment + "]";
	}

}
