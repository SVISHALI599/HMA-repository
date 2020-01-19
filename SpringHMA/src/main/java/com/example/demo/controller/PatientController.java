package com.example.demo.controller;

import java.util.List;

import javax.websocket.server.PathParam;
import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
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
@Path("/controller/patient")
public class PatientController {
	@Autowired
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
	public ResponseEntity<Integer> setPatient(@RequestBody Patient patient) {
		int status = patientService.setPatient(patient);
		return ResponseEntity.status(HttpStatus.OK).body(status);

	}

	@PutMapping("/deletepatient/{pk_user_id}")
	public int deletePatient(@PathParam("pk_user_id") int pk_user_id) {
		return patientService.deletePatient(pk_user_id);
	}

	@PutMapping("/updatePatient/{id}")
	public ResponseEntity<Integer> updatePatient(@RequestBody Patient patient,@PathParam("pk_user_id") int id) {
		int status = patientService.updatePatient(patient,id);
		return ResponseEntity.status(HttpStatus.OK).body(status);

	}

}
