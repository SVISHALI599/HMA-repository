package com.example.demo.service;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.mapper.PatientMapper;
import com.example.demo.model.Patient;

@Service
// TODO class names  
public class PatientService {
	private Logger logger = LogManager.getLogger(PatientService.class);
	@Autowired
	PatientMapper mapper;

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

	public int createPatient(Patient patient) {
		logger.traceEntry();
		mapper.createUser(patient);
		int result = mapper.createPatient(patient);
		return logger.traceExit(result);
	}

}
