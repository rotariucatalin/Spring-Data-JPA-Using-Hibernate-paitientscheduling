package com.example.paitientscheduling.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "apointment_time")
    private Timestamp apointmentTime;
    private Boolean started;
    @Column(name = "ended")
    private Boolean finished;
    private String reason;

    @ManyToOne
    private Patient patient;
    @ManyToOne
    private Doctor doctor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getApointmentTime() {
        return apointmentTime;
    }

    public void setApointmentTime(Timestamp apointmentTime) {
        this.apointmentTime = apointmentTime;
    }

    public Boolean getStarted() {
        return started;
    }

    public void setStarted(Boolean started) {
        this.started = started;
    }

    public Boolean getFinished() {
        return finished;
    }

    public void setFinished(Boolean finished) {
        this.finished = finished;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "id=" + id +
                ", apointmentTime=" + apointmentTime +
                ", started=" + started +
                ", finished=" + finished +
                ", reason='" + reason + '\'' +
                ", patient=" + patient +
                ", doctor=" + doctor +
                '}';
    }
}
