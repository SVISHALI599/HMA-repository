
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

import com.example.demo.model.Doctor;
import com.example.demo.service.DoctorService;

@RestController
@Path("/controller/doctor")
public class DoctorController {
	@Autowired
	DoctorService doctorservice;

	public DoctorController(DoctorService doctorservice) {
		this.doctorservice = doctorservice;
	}

	@GetMapping("/alldoctors")

	public List<Doctor> getAllDoctor() {
		return doctorservice.getAllDoctor();
	}

	@GetMapping("/doctorid/{id}")

	public Doctor getDoctorById(@PathParam("id") int id) {
		return doctorservice.getDoctorById(id);
	}

	@PostMapping("/setDoctor")
	public ResponseEntity<Integer> createPatient(@RequestBody Doctor doctor) {
		int noRowsAffected = doctorservice.setDoctor(doctor);
		return ResponseEntity.status(HttpStatus.OK).body(noRowsAffected);

	}

	@PutMapping("/deletedoctor/{pk_user_id}")
	public int deleteDoctor(@PathParam("pk_user_id") int pk_user_id) {
		return doctorservice.deleteDoctor(pk_user_id);
	}

	@PutMapping("/updateDoctor")
	public ResponseEntity<Integer> updatePatient(@RequestBody Doctor doctor) {
		int status = doctorservice.updateDoctor(doctor);
		return ResponseEntity.status(HttpStatus.OK).body(status);

	}
}
