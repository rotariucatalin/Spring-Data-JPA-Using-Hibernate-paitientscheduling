package com.example.paitientscheduling.repositories;

import com.example.paitientscheduling.models.Patient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends CrudRepository<Patient, Integer> {
}
