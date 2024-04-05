package com.medimeet.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medimeet.main.entities.Prescription;

@Repository
public interface PrescriptionRepository extends JpaRepository<Prescription, Integer> {

}
