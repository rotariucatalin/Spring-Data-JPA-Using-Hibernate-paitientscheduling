package com.example.paitientscheduling.models;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    private String phone;
    @Embedded
    private Insurance insurance;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable( name = "patients_doctors",
                joinColumns =@JoinColumn(name="patient_id", referencedColumnName = "id"),
                inverseJoinColumns =@JoinColumn(name="doctor_id", referencedColumnName = "id")
              )
    private List<Doctor> doctors;

    @OneToMany
    private List<Appointment> appointments;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }


    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", insurance=" + insurance +
                ", doctors=" + doctors +
                ", appointments=" + appointments +
                '}';
    }
}
