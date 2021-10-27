package com.lakshmi.covid.tracker.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.lakshmi.covid.tracker.controller.UserController;
import com.lakshmi.covid.tracker.exception.ResourceNotFoundException;
import com.lakshmi.covid.tracker.model.Assessment;
import com.lakshmi.covid.tracker.model.CovidRisk;
import com.lakshmi.covid.tracker.service.SelfAssessmentService;
import com.lakshmi.covid.tracker.service.UserService;

@Service
public class SelfAssessmentServiceImpl implements SelfAssessmentService {
	
	private Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	UserService userService;
	
	@Override
	public CovidRisk selfAssess(Assessment assessment) {
		
		if(userService.getUserById(assessment.getUserId()) == null) {
			logger.warn("User with id {} not found", assessment.getUserId());
			throw new ResourceNotFoundException(String.format("User with id %s not found", assessment.getUserId()));
		}
		
		CovidRisk covidRisk = new CovidRisk();
		
		if(!CollectionUtils.isEmpty(assessment.getSymptoms()) && (assessment.getTravelHistory() || assessment.getContactWithCovidPatient())){
			if(assessment.getSymptoms().size() == 1) {
				covidRisk.setRiskPercentage(50.0);
			} else if(assessment.getSymptoms().size() == 2) {
				covidRisk.setRiskPercentage(75.0);
			} else if(assessment.getSymptoms().size() > 2) {
				covidRisk.setRiskPercentage(95.0);
			}
		}else {
			covidRisk.setRiskPercentage(5.0);
			}
		return covidRisk;
	}
}
