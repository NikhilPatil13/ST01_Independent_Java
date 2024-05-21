package com.traini8.mvp.main.repo;

import org.springframework.data.repository.CrudRepository;

import com.traini8.mvp.main.entities.TrainingCenter;

/*
 * Repository interface which provides us multiple database related methods to perform CRUD operations.
 * */


public interface TrainingCenterRepository extends CrudRepository<TrainingCenter, Integer> {

	TrainingCenter findByContactEmailIdAndContactPhoneNo(String contactEmailId, String contactPhoneNo);

}
