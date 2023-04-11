package com.jeyson.makeMedicalConsultation.Interfaces.Services;

import com.jeyson.makeMedicalConsultation.Entity.Consult;

import java.util.List;
import java.util.Optional;

public interface ConsultServiceInterface {

    Optional<Consult> getConsultById(String id);

    List<Consult> getAllConsults();

    Consult saveConsult(Consult consult);

    void deleteConsultById(String id);
}
