package com.example.demo.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Patient;
import com.example.demo.service.*;

@RestController
public class PatientController {

	patientService patientService;

	public PatientController(patientService patientService) {
		this.patientService = patientService;
	}

	@GetMapping("/allpatients")

	public List<Patient> getAllPatient() {
		return patientService.getAllPatient();
	}

	@GetMapping("/patientid/{id}")

	public Patient getPatientById(@PathParam("id") int id) {
		return patientService.getPatientById(id);
	}

	@PostMapping("/setPatient")
	public ResponseEntity<Integer> createPatient(@RequestBody Patient patient) {
		int noRowsAffected = patientService.setPatient(patient);
		return ResponseEntity.status(HttpStatus.OK).body(noRowsAffected);

	}

	@PutMapping("/deletepatient/{pk_user_id}")
	public int deletePatient(@PathParam("pk_user_id") int pk_user_id) {
		return patientService.deletePatient(pk_user_id);
	}

	@PutMapping("/updatePatient")
	public ResponseEntity<Integer> updatePatient(@RequestBody Patient patient) {
		int status = patientService.updatePatient(patient);
		return ResponseEntity.status(HttpStatus.OK).body(status);

	}

}
