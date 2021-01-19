package com.example.paitientscheduling;

import com.example.paitientscheduling.models.Appointment;
import com.example.paitientscheduling.models.Doctor;
import com.example.paitientscheduling.models.Insurance;
import com.example.paitientscheduling.models.Patient;
import com.example.paitientscheduling.repositories.AppointmentRespository;
import com.example.paitientscheduling.repositories.DoctorRespository;
import com.example.paitientscheduling.repositories.PatientRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@SpringBootTest
class PaitientschedulingApplicationTests {

	@Autowired
	DoctorRespository doctorRespository;

	@Autowired
	PatientRepository patientRepository;

	@Autowired
	AppointmentRespository appointmentRespository;

	@Test
	public void testCreateDoctor() {

		Doctor doctor = new Doctor();
		doctor.setFirstName("Doctor1");
		doctor.setLastName("Doctor1");
		doctor.setSpeciality("All");

		doctorRespository.save(doctor);

	}

	@Test
	public void testCreatePatient() {

		Patient patient = new Patient();

		patient.setFirstName("FirstName");
		patient.setLastName("LastName");
		patient.setPhone("PhoneNumber");

		Insurance insurance = new Insurance();
		insurance.setCopay("Copay");
		insurance.setProviderName("ProviderName");

		patient.setInsurance(insurance);

		Doctor doctor = doctorRespository.findById(1).get();
		List<Doctor> doctorList = Arrays.asList(doctor);

		patient.setDoctors(doctorList);

		patientRepository.save(patient);
	}

	@Test
	public void testCreateAppointment() {

		Timestamp timestamp = new Timestamp(new Date().getTime());

		Appointment appointment = new Appointment();

		appointment.setApointmentTime(timestamp);
		appointment.setStarted(true);
		appointment.setReason("I have a problem");

		Patient patient = patientRepository.findById(1).get();
		appointment.setPatient(patient);

		Doctor doctor = doctorRespository.findById(1).get();
		appointment.setDoctor(doctor);

		appointmentRespository.save(appointment);
	}
}
