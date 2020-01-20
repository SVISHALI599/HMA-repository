
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

import com.example.demo.model.Doctor;
import com.example.demo.model.Patient;
import com.example.demo.service.DoctorService;

@RestController
@Path("/doctor")
public class DoctorController {
	private Logger logger = LogManager.getLogger(DoctorController.class);
	@Autowired
	DoctorService doctorservice;

	@GetMapping("/alldoctors")

	public List<Doctor> getAllDoctor() {
		logger.traceEntry();
		return logger.traceExit(doctorservice.getAllDoctor());
	}

	@RequestMapping(value = "/doctorid/{id}", method = RequestMethod.GET)
	public Doctor getDoctorById(@PathParam("id") int id) {
		logger.traceEntry();
		return logger.traceExit(doctorservice.getDoctorById(id));
	}

	@PostMapping("/setDoctor")
	public ResponseEntity<Integer> createPatient(@RequestBody Doctor doctor) {
		logger.traceEntry();
		int noRowsAffected = doctorservice.setDoctor(doctor);
		return logger.traceExit(ResponseEntity.status(HttpStatus.OK).body(noRowsAffected));

	}

	@RequestMapping(value = "/deletedoctor/{pk_user_id}", method = RequestMethod.PUT)
	public int deleteDoctor(@PathParam("pk_user_id") int pk_user_id) {
		logger.traceEntry();
		return logger.traceExit(doctorservice.deleteDoctor(pk_user_id));
	}

	@RequestMapping(value = "/updatedoctor/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Integer> updatePatient(@RequestBody Doctor doctor, @PathParam("id") int id) {
		logger.traceEntry();
		int status = doctorservice.updateDoctor(doctor, id);
		return logger.traceExit(ResponseEntity.status(HttpStatus.OK).body(status));

	}

	@RequestMapping(value = "/getAllpatients/{doctorId}", method = RequestMethod.GET)
	public List<Patient> getAllPatientsOfDoctor(@PathParam("pk_doctor_id") int pk_doctor_id) {
		logger.traceEntry();
		return logger.traceExit(doctorservice.getAllPatientsOfDoctor(pk_doctor_id));
	}
}
