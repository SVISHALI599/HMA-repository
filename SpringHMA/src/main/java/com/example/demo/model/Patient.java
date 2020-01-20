package com.example.demo.model;

public class Patient extends User {
	private int pkPatientId;
	private int fkUserId;
	private String patientDisease;
	public int getPkPatientId() {
		return pkPatientId;
	}
	public void setPkPatientId(int pkPatientId) {
		this.pkPatientId = pkPatientId;
	}
	public int getFkUserId() {
		return fkUserId;
	}
	public void setFkUserId(int fkUserId) {
		this.fkUserId = fkUserId;
	}
	public String getPatientDisease() {
		return patientDisease;
	}
	public void setPatientDisease(String patientDisease) {
		this.patientDisease = patientDisease;
	}
	@Override
	public String toString() {
		return "Patient [pkPatientId=" + pkPatientId + ", fkUserId=" + fkUserId + " ,patientDisease="
				+ patientDisease + "]";
	}

}
