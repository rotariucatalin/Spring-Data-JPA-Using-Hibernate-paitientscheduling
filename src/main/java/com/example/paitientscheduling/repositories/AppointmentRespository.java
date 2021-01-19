package com.example.paitientscheduling.repositories;

import com.example.paitientscheduling.models.Appointment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRespository extends CrudRepository<Appointment, Integer> {
}
