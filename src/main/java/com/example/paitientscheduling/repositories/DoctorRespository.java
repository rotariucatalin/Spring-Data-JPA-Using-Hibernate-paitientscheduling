package com.example.paitientscheduling.repositories;

import com.example.paitientscheduling.models.Doctor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRespository extends CrudRepository<Doctor, Integer> {
}
