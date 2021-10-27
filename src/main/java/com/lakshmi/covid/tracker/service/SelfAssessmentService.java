package com.lakshmi.covid.tracker.service;

import com.lakshmi.covid.tracker.model.Assessment;
import com.lakshmi.covid.tracker.model.CovidRisk;

public interface SelfAssessmentService {
	
	public CovidRisk selfAssess(Assessment assessment);
	
}
