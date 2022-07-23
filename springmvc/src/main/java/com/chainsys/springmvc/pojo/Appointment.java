package com.chainsys.springmvc.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;



@Entity
@Table(name = "Appointments")
public class Appointment {
	private int APPOIMENT_ID;
	private Date APPOIMENT_DATE;
	private int DOC_ID;
	private String PATIENT_NAME;
	private float FEES_COLLECTED;

	public int getAPPOIMENT_ID() {
		return APPOIMENT_ID;
	}

	public void setAPPOIMENT_ID(int aPPOIMENT_ID) {
		APPOIMENT_ID = aPPOIMENT_ID;
	}

	public Date getAPPOIMENT_DATE() {
		return APPOIMENT_DATE;
	}

	public void setAPPOIMENT_DATE(Date aPPOIMENT_DATE) {
		APPOIMENT_DATE = aPPOIMENT_DATE;
	}

	public int getDOC_ID() {
		return DOC_ID;
	}

	public void setDOC_ID(int dOC_ID) {
		DOC_ID = dOC_ID;
	}

	public String getPATIENT_NAME() {
		return PATIENT_NAME;
	}

	public void setPATIENT_NAME(String pATIENT_NAME) {
		PATIENT_NAME = pATIENT_NAME;
	}

	public float getFEES_COLLECTED() {
		return FEES_COLLECTED;
	}

	public void setFEES_COLLECTED(float fEES_COLLECTED) {
		FEES_COLLECTED = fEES_COLLECTED;
	}

}
