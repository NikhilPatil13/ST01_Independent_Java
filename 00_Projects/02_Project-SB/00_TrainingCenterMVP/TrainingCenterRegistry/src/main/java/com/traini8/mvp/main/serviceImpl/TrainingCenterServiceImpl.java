package com.traini8.mvp.main.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.traini8.mvp.main.entities.TrainingCenter;
import com.traini8.mvp.main.exception.InvalidTrainingCenterNameAndCodeFormatException;
import com.traini8.mvp.main.exception.TrainingCenterFoundException;
import com.traini8.mvp.main.repo.TrainingCenterRepository;
import com.traini8.mvp.main.serviceI.TrainingCenterServiceI;

/*
 * This is service provider class which provides logic for all the methods/features declared in service interface.
 * */


@Service
public class TrainingCenterServiceImpl implements TrainingCenterServiceI {

	@Autowired
	TrainingCenterRepository trainingCenterRepository;
	
	@Override
	public TrainingCenter saveTrainingCenter(TrainingCenter trainingCenter) {
		
		// checking is TrainingCenter is already registered or not
		TrainingCenter byContactEmailIdAndContactPhoneNo = this.trainingCenterRepository.findByContactEmailIdAndContactPhoneNo(trainingCenter.getContactEmailId(), trainingCenter.getContactPhoneNo());
		
		System.out.println(byContactEmailIdAndContactPhoneNo);
		
		Optional<TrainingCenter> optionalTrainingCenter = Optional.ofNullable(byContactEmailIdAndContactPhoneNo);
		if(optionalTrainingCenter.isPresent()) {
			// if TrainingCenter is present then throwing exception
			throw new TrainingCenterFoundException();
		}
		else{
			// if TrainingCenter is not present
			
			// TrainingCenter name should be less than 40 characters
			int trainingCenterNameLength = trainingCenter.getCenterName().length();
			System.out.println(trainingCenterNameLength);
			
			
			// TrainingCenterCode should be exactly 12 characters alphanumeric. Returns true if matches.
			boolean isTrainingCenterCodeProper = trainingCenter.getCenterCode().matches("^[a-zA-Z0-9]{12}$");
			
			System.out.println(isTrainingCenterCodeProper);
			
			if(trainingCenterNameLength < 40 && isTrainingCenterCodeProper) {
			
				TrainingCenter savedTrainingCenter = this.trainingCenterRepository.save(trainingCenter);
				
				return savedTrainingCenter;	
			}
			else {
				throw new InvalidTrainingCenterNameAndCodeFormatException();
			}
		}
	}

	@Override
	public Iterable<TrainingCenter> getAllTrainingCenters() {
		Iterable<TrainingCenter> listOfTrainingCenters = this.trainingCenterRepository.findAll();
		
		return listOfTrainingCenters;
	}

}
