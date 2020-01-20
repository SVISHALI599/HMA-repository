package com.example.demo.controller;

import java.util.List;

import javax.websocket.server.PathParam;
import javax.ws.rs.Path;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Patient;
import com.example.demo.service.*;

@RestController
@Path("/patient")
public class PatientController {
	private Logger logger = LogManager.getLogger(PatientController.class);
	@Autowired
	patientService patientService;

	@GetMapping("/allpatients")

	public List<Patient> getAllPatient() {
		logger.traceEntry();
		return logger.traceExit(patientService.getAllPatient());
	}

	@RequestMapping(value = "/patientid/{id}", method = RequestMethod.GET)
	public Patient getPatientById(@PathParam("id") int id) {
		logger.traceEntry();
		return logger.traceExit(patientService.getPatientById(id));
	}

	@PostMapping("/setPatient")
	public ResponseEntity<Integer> setPatient(@RequestBody Patient patient) {
		logger.traceEntry();
		int patientId = patientService.setPatient(patient);
		return logger.traceExit(ResponseEntity.status(HttpStatus.OK).body(patientId));

	}

	@RequestMapping(value = "/deletepatient/{id}", method = RequestMethod.PUT)
	public int deletePatient(@PathParam("pk_user_id") int pk_user_id) {
		logger.traceEntry();
		return logger.traceExit(patientService.deletePatient(pk_user_id));
	}

	@RequestMapping(value = "/updatepatient/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Integer> updatePatient(@RequestBody Patient patient, @PathParam("pk_user_id") int id) {
		logger.traceEntry();
		int status = patientService.updatePatient(patient, id);
		return logger.traceExit(ResponseEntity.status(HttpStatus.OK).body(status));

	}

}
