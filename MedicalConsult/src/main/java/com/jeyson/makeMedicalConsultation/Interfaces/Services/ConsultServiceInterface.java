package com.jeyson.makeMedicalConsultation.Interfaces.Services;

import com.jeyson.makeMedicalConsultation.Entity.Consult;

import java.util.List;

public interface ConsultServiceInterface {

    List<Consult> getAllConsults();

    Consult getConsultById(Long id);

    Consult saveConsult(Consult consult);

    void deleteConsultById(Long id);
}
