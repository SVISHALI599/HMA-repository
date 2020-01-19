package com.example.demo.model;

public class Doctor extends User {
	private int pk_doctor_id;

	public int getPk_doctor_id() {
		return pk_doctor_id;
	}

	public void setPk_doctor_id(int pk_doctor_id) {
		this.pk_doctor_id = pk_doctor_id;
	}

	public int getFk_user_id() {
		return fk_user_id;
	}

	public void setFk_user_id(int fk_user_id) {
		this.fk_user_id = fk_user_id;
	}

	public String getDoctor_specialization() {
		return doctor_specialization;
	}

	public void setDoctor_specialization(String doctor_specialization) {
		this.doctor_specialization = doctor_specialization;
	}

	public int getDoctor_experience() {
		return doctor_experience;
	}

	public void setDoctor_experience(int doctor_experience) {
		this.doctor_experience = doctor_experience;
	}

	private int fk_user_id;
	private String doctor_specialization;
	private int doctor_experience;

	@Override
	public String toString() {
		return "Doctor [pk_doctor_id=" + pk_doctor_id + ", fk_user_id=" + fk_user_id + " , doctor_experience="
				+ doctor_experience + ",doctor_specialization=" + doctor_specialization + "]";
	}

}
