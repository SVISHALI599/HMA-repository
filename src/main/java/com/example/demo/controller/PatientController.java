package com.example.demo.controller;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Patient;
import com.example.demo.service.*;

@CrossOrigin
@RestController
public class PatientController {
	private Logger logger = LogManager.getLogger(PatientController.class);
	@Autowired
	PatientService patientService;

	@GetMapping("/all_patients")

	public List<Patient> getAllPatient() {
		logger.traceEntry();
		return logger.traceExit(patientService.getAllPatient());
	}

	@RequestMapping(value = "/patient_id/{id}", method = RequestMethod.GET)
	public Patient getPatientById(@PathVariable int id) {
		logger.traceEntry();
		return logger.traceExit(patientService.getPatientById(id));
	}

	@PostMapping("/create_patient")
	public ResponseEntity<Integer> createPatient(@RequestBody Patient patient) {
		logger.traceEntry();
		int patientId = patientService.createPatient(patient);
		return logger.traceExit(ResponseEntity.status(HttpStatus.OK).body(patientId));

	}

	@RequestMapping(value = "/delete_patient/{id}", method = RequestMethod.PUT)
	public int deletePatient(@PathVariable int pk_user_id) {
		logger.traceEntry();
		return logger.traceExit(patientService.deletePatient(pk_user_id));
	}

	@RequestMapping(value = "/update_patient/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Integer> updatePatient(@RequestBody Patient patient, @PathVariable int id) {
		logger.traceEntry();
		int status = patientService.updatePatient(patient, id);
		return logger.traceExit(ResponseEntity.status(HttpStatus.OK).body(status));

	}

}
