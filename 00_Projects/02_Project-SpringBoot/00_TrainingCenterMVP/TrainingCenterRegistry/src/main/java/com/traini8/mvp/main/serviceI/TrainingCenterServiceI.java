package com.traini8.mvp.main.serviceI;

import com.traini8.mvp.main.entities.TrainingCenter;

/*
 * This is a service interface it contains declaration for all the features/operations/functions those available in our project.
 * */

public interface TrainingCenterServiceI {
	public TrainingCenter saveTrainingCenter(TrainingCenter trainingCenter);
	
	public Iterable<TrainingCenter> getAllTrainingCenters();
}
