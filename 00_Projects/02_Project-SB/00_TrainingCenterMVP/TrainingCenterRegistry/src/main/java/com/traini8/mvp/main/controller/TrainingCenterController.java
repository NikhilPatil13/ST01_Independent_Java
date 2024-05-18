package com.traini8.mvp.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.traini8.mvp.main.dto.BaseResponse;
import com.traini8.mvp.main.entities.TrainingCenter;
import com.traini8.mvp.main.serviceI.TrainingCenterServiceI;

@RestController
public class TrainingCenterController {
	@Autowired
	TrainingCenterServiceI	trainingCenterServiceI;
	
	
	// Mapping for saving new TrainingCenter
	@PostMapping("/save-trainingcenter")
	public ResponseEntity<BaseResponse<TrainingCenter>> saveTrainingCenter(@RequestBody TrainingCenter trainingCenter){
		
		BaseResponse<TrainingCenter> baseResponse =  new BaseResponse<>(201,"Training Center Saved!",this.trainingCenterServiceI.saveTrainingCenter(trainingCenter));
		
		return new ResponseEntity<>(baseResponse,HttpStatus.CREATED);
	}
	
	// Mapping for getting all saved TrainingCenter
	@GetMapping(path="/get-alltrainingcenters" ,produces = "application/json")
	public ResponseEntity<BaseResponse<Iterable<TrainingCenter>>> getAllTrainingCenters(){
		
		BaseResponse<Iterable<TrainingCenter>> baseResponse = new BaseResponse<>(200, "All Training Center Data Got!", this.trainingCenterServiceI.getAllTrainingCenters());
	
		return new ResponseEntity<>(baseResponse,HttpStatus.FOUND);
	}
	
	
}
