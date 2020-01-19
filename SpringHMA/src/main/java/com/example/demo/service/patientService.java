package com.example.demo.service;

import java.util.List;

import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.PatientMapper;
import com.example.demo.model.Patient;

@Service
@Path("/service/patient")
public class patientService {
	@Autowired
	PatientMapper mapper;

	public void PatientService(PatientMapper mapper) {
		this.mapper = mapper;
	}

	public List<Patient> getAllPatient() {

		return mapper.getAllPatient();
	}

	public Patient getPatientById(int userId) {

		return mapper.getPatientById(userId);
	}

	public int deletePatient(int userId) {
		if (mapper.deletePatient(userId) == 1) {
			return 1;
		} else {
			return 0;
		}
	}

	public int updatePatient(Patient patient,int id) {
		if (mapper.updatePatient(patient,id) == 1) {
			return 1;
		} else {
			return 0;
		}
	}

	public int setPatient(Patient patient) {

		mapper.setUser(patient);
		int result = mapper.setPatient(patient);
		return result;
	}

}
