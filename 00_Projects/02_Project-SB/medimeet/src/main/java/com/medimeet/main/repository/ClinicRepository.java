package com.medimeet.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medimeet.main.entities.Clinic;

@Repository
public interface ClinicRepository extends JpaRepository<Clinic, Integer> {

}
