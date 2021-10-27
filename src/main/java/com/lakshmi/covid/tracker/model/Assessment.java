package com.lakshmi.covid.tracker.model;

import java.util.List;

public class Assessment {

	private int userId;
	private List<String> symptoms;
	private Boolean travelHistory;
	private Boolean contactWithCovidPatient;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public List<String> getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(List<String> symptoms) {
		this.symptoms = symptoms;
	}

	public Boolean getTravelHistory() {
		return travelHistory;
	}

	public void setTravelHistory(Boolean travelHistory) {
		this.travelHistory = travelHistory;
	}

	public Boolean getContactWithCovidPatient() {
		return contactWithCovidPatient;
	}

	public void setContactWithCovidPatient(Boolean contactWithCovidPatient) {
		this.contactWithCovidPatient = contactWithCovidPatient;
	}

}
