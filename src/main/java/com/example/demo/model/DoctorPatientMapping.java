package com.example.demo.model;

public class DoctorPatientMapping extends User {
	private int doctor_patient_key;
	public int getDoctor_patient_key() {
		return doctor_patient_key;
	}
	public void setDoctor_patient_key(int doctor_patient_key) {
		this.doctor_patient_key = doctor_patient_key;
	}
	public int getFk_doctor_id() {
		return fk_doctor_id;
	}
	public void setFk_doctor_id(int fk_doctor_id) {
		this.fk_doctor_id = fk_doctor_id;
	}
	public int getFk_patient_id() {
		return fk_patient_id;
	}
	public void setFk_patient_id(int fk_patient_id) {
		this.fk_patient_id = fk_patient_id;
	}
	private int fk_doctor_id;
	private int fk_patient_id;
	@Override
	public String toString() {
		return "Doctor_patient_mapping [doctor_patient_key=" + doctor_patient_key + ", fk_doctor_id=" + fk_doctor_id + " , fk_patient_id="
				+ fk_patient_id + "]";
	}

}
