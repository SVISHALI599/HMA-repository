package com.example.demo.model;

public class Patient extends User {
	private int pk_patient_id;

	@Override
	public String toString() {
		return "Patient [pk_patient_id=" + pk_patient_id + ", fk_user_id=" + fk_user_id + " ,patient_disease="
				+ patient_disease + "]";
	}

	public int getPk_patient_id() {
		return pk_patient_id;
	}

	public void setPk_patient_id(int pk_patient_id) {
		this.pk_patient_id = pk_patient_id;
	}

	public int getFk_user_id() {
		return fk_user_id;
	}

	public void setFk_user_id(int fk_user_id) {
		this.fk_user_id = fk_user_id;
	}

	public String getPatient_disease() {
		return patient_disease;
	}

	public void setPatient_disease(String patient_disease) {
		this.patient_disease = patient_disease;
	}

	private int fk_user_id;
	private String patient_disease;

}
