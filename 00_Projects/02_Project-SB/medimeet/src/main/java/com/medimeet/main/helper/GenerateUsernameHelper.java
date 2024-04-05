package com.medimeet.main.helper;

import java.time.LocalDate;
import java.util.Random;
import java.util.stream.IntStream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class GenerateUsernameHelper {
	
	Logger logger = LogManager.getLogger(GenerateUsernameHelper.class);
	
	
	public String generateUsername() {
		// we need to generate username in the format of YYYYMMDD{randomNumber}
		
		LocalDate localDate = LocalDate.now();
		
		int dayOfMonth = localDate.getDayOfMonth();
		int monthValue = localDate.getMonthValue();
		int year = localDate.getYear();
		
		// generate random number between 1 - 10000
		Random random = new Random();

		int nextInt = random.nextInt(10000);

		System.out.println(nextInt);

		// concatenate(convert int to String) to get YYYYMMDD{randomNumber} in String format
		String generatedUsername = ""+dayOfMonth+""+monthValue+""+year+""+nextInt;
		System.out.println(generatedUsername);
		 
		logger.info("GenerateUsernameHelper - generateUsername - username generated.");
		
		return generatedUsername;
	}
	
}