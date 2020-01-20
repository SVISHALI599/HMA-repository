package com.example.demo.model;

import java.util.List;

public class Doctor extends User {
	private int pkDoctorId;
	private int fkUserId;
	private String doctorSpecialization;
	private int doctorExperience;
	private List<Patient> patientList;
	public int getPkDoctorId() {
		return pkDoctorId;
	}
	public void setPkDoctorId(int pkDoctorId) {
		this.pkDoctorId = pkDoctorId;
	}
	public int getFkUserId() {
		return fkUserId;
	}
	public void setFkUserId(int fkUserId) {
		this.fkUserId = fkUserId;
	}
	public String getDoctorSpecialization() {
		return doctorSpecialization;
	}
	public void setDoctorSpecialization(String doctorSpecialization) {
		this.doctorSpecialization = doctorSpecialization;
	}
	public int getDoctorExperience() {
		return doctorExperience;
	}
	public void setDoctorExperience(int doctorExperience) {
		this.doctorExperience = doctorExperience;
	}
	public List<Patient> getPatientList() {
		return patientList;
	}
	public void setPatientList(List<Patient> patientList) {
		this.patientList = patientList;
	}
	
	@Override
	public String toString() {
		return "Doctor [pkDoctorId=" + pkDoctorId + ", fkUserId=" + fkUserId + " , doctorExperience="
				+ doctorExperience + ",doctorSpecialization=" + doctorSpecialization + "]";
	}

}
