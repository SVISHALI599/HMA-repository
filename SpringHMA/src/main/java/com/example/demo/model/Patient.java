package com.example.demo.model;

public class Patient extends User{
	@Override
	public String toString() {
		return "Patient [pk_patient_id=" + pk_patient_id + ", fk_user_id=" + fk_user_id + " ,patient_disease=" + patient_disease + "]";
	}
	public int getpk_patient_id() {
		return pk_patient_id;
	}

	public void setpk_patient_id(int pk_patient_id) {
		this.pk_patient_id = pk_patient_id;
	}
	public int getfk_user_id() {
		return fk_user_id;
	}

	public void setfk_user_id(int fk_user_id) {
		this.fk_user_id = fk_user_id;
	}
	public String getpatient_disease() {
		return patient_disease;
	}

	public void setpatient_disease(String patient_disease) {
		this.patient_disease = patient_disease;
	}

	public int pk_patient_id;
	public int fk_user_id;
	public String patient_disease;
}
