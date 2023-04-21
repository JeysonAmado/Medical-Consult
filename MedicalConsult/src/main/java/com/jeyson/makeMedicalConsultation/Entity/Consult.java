package com.jeyson.makeMedicalConsultation.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import org.springframework.data.mongodb.core.mapping.Document;

@Entity
@Table(name = "consult")
public class Consult {
    @Id
    private int id;

    @Column(name = "symptoms")
    private String symptoms;

    @Column(name = "diagnostic")
    private String diagnostic;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getDiagnostic() {
        return diagnostic;
    }

    public void setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }
}
