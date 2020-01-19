package com.example.demo.service;

import java.util.List;

import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.DoctorMapper;
import com.example.demo.model.Doctor;

@Service
@Path("/service/doctor")
public class DoctorService {
	@Autowired
	DoctorMapper doctormapper;

	public DoctorService(DoctorMapper doctormapper) {
		this.doctormapper = doctormapper;
	}

	public List<Doctor> getAllDoctor() {

		return doctormapper.getAllDoctor();
	}

	public Doctor getDoctorById(int userId) {

		return doctormapper.getDoctorById(userId);
	}

	public int deleteDoctor(int userId) {
		if (doctormapper.deleteDoctor(userId) == 1) {
			return 1;
		} else {
			return 0;
		}
	}

	public int updateDoctor(Doctor doctor) {
		if (doctormapper.updateDoctor(doctor) == 1) {
			return 1;
		} else {
			return 0;
		}
	}

	public int setDoctor(Doctor doctor) {

		doctormapper.setUser(doctor);
		int result = doctormapper.setDoctor(doctor);
		return result;
	}

}
