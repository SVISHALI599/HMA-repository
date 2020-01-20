package com.example.demo.service;

import java.util.List;

import javax.ws.rs.Path;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.mapper.PatientMapper;
import com.example.demo.model.Patient;

@Service
@Path("/patient")
public class patientService {
	private Logger logger = LogManager.getLogger(patientService.class);
	@Autowired
	PatientMapper mapper;

	public void PatientService(PatientMapper mapper) {
		this.mapper = mapper;
	}

	public List<Patient> getAllPatient() {
		logger.traceEntry();
		return logger.traceExit(mapper.getAllPatient());
	}

	public Patient getPatientById(int userId) {
		logger.traceEntry();
		return logger.traceExit(mapper.getPatientById(userId));
	}

	public int deletePatient(int userId) {
		logger.traceEntry();
		if (mapper.deletePatient(userId) == 1) {
			return logger.traceExit(1);
		} else {
			return logger.traceExit(0);
		}
	}

	public int updatePatient(Patient patient, int id) {
		logger.traceEntry();
		if (mapper.updatePatient(patient, id) == 1) {
			return logger.traceExit(1);
		} else {
			return logger.traceExit(0);
		}
	}

	public int setPatient(Patient patient) {
		logger.traceEntry();
		mapper.setUser(patient);
		int result = mapper.setPatient(patient);
		return logger.traceExit(result);
	}

}
