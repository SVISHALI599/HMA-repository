
package com.example.demo.controller;

import java.util.List;
import javax.ws.rs.Path;
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
import com.example.demo.model.Doctor;
import com.example.demo.model.Patient;
import com.example.demo.service.DoctorService;

@CrossOrigin
@RestController
public class DoctorController {
	private Logger logger = LogManager.getLogger(DoctorController.class);
	@Autowired
	DoctorService doctorservice;
	@GetMapping("/all_doctors")
	public List<Doctor> getAllDoctor() {
		logger.traceEntry();
		return logger.traceExit(doctorservice.getAllDoctor());
	}

	@RequestMapping(value = "/doctor_id/{id}", method = RequestMethod.GET)
	public Doctor getDoctorById(@PathVariable int id) {
		logger.traceEntry();
		return logger.traceExit(doctorservice.getDoctorById(id));
	}

	@PostMapping("/create_doctor")
	public ResponseEntity<Integer> createDoctor(@RequestBody Doctor doctor) {
		logger.traceEntry();
		int noRowsAffected = doctorservice.createDoctor(doctor);
		return logger.traceExit(ResponseEntity.status(HttpStatus.OK).body(noRowsAffected));
	}

	@RequestMapping(value = "/delete_doctor/{doctorId}", method = RequestMethod.PUT)
	public int deleteDoctor(@PathVariable int doctorId) {
		logger.traceEntry();
		return logger.traceExit(doctorservice.deleteDoctor(doctorId));
	}

	@RequestMapping(value = "/update_doctor/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Integer> updatePatient(@RequestBody Doctor doctor, @PathVariable int id) {
		logger.traceEntry();
		int status = doctorservice.updateDoctor(doctor, id);
		return logger.traceExit(ResponseEntity.status(HttpStatus.OK).body(status));

	}

	@RequestMapping(value = "/get_all_patients/{doctorId}", method = RequestMethod.GET)
	public List<Patient> getAllPatientsOfDoctor(@PathVariable int doctorId) {
		logger.traceEntry();
		return logger.traceExit(doctorservice.getAllPatientsOfDoctor(doctorId));
	}

	@GetMapping("/all_patients_of_all_doctors")
	public List<Doctor> getAllPatientsOfallDoctors() {
		logger.traceEntry();
		return logger.traceExit(doctorservice.getAllPatientsOfAllDoctors());
	}
}
