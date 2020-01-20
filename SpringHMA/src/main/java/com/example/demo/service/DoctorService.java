package com.example.demo.service;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.mapper.DoctorMapper;
import com.example.demo.model.Doctor;
import com.example.demo.model.Patient;

@Service
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

	public int createDoctor(Doctor doctor) {
		logger.traceEntry();
		doctormapper.setUser(doctor);
		int result = doctormapper.createDoctor(doctor);
		return logger.traceExit(result);
	}

	public List<Patient> getAllPatientsOfDoctor(int doctorId) {
		logger.traceEntry();
		return logger.traceExit(doctormapper.getAllPatientsOfDoctor(doctorId));
	}

	public List<Doctor> getAllPatientsOfAllDoctors() {
		logger.traceEntry();
		return logger.traceExit(doctormapper.getAllPatientsOfAllDoctors());
	}

}
