package com.example.demo.service;

import java.util.List;

import javax.ws.rs.Path;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.DoctorMapper;
import com.example.demo.model.Doctor;
import com.example.demo.model.Doctor_patient_mapping;
import com.example.demo.model.Patient;

@Service
@Path("/doctor")
public class DoctorService {
	private Logger logger = LogManager.getLogger(DoctorService.class);
	@Autowired
	DoctorMapper doctormapper;

	public List<Doctor> getAllDoctor() {
		logger.traceEntry();
		return logger.traceExit(doctormapper.getAllDoctor());
	}

	public Doctor getDoctorById(int userId) {
		logger.traceEntry();
		return logger.traceExit(doctormapper.getDoctorById(userId));
	}

	public int deleteDoctor(int userId) {
		logger.traceEntry();
		if (doctormapper.deleteDoctor(userId) == 1) {
			return logger.traceExit(1);
		} else {
			return logger.traceExit(0);
		}
	}

	public int updateDoctor(Doctor doctor, int id) {
		logger.traceEntry();
		if (doctormapper.updateDoctor(doctor, id) == 1) {
			return logger.traceExit(1);
		} else {
			return logger.traceExit(0);
		}
	}

	public int setDoctor(Doctor doctor) {
		logger.traceEntry();
		doctormapper.setUser(doctor);
		int result = doctormapper.setDoctor(doctor);
		return logger.traceExit(result);
	}

	public List<Patient> getAllPatientsOfDoctor(int doctorId) {
		return doctormapper.getAllPatientsOfDoctor(doctorId);
	}

	public List<Doctor_patient_mapping> getAllPatientsOfAllDoctors() {
		return doctormapper.getAllPatientsOfAllDoctors();
	}

}
