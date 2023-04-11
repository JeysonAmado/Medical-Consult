package com.jeyson.makeMedicalConsultation.Services;

import com.jeyson.makeMedicalConsultation.Entity.Consult;
import com.jeyson.makeMedicalConsultation.Interfaces.Services.ConsultServiceInterface;
import com.jeyson.makeMedicalConsultation.Interfaces.Repository.ConsultRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ConsultService implements ConsultServiceInterface {

    @Autowired
    private ConsultRespository consultRepository;
    @Override
    public Optional<Consult> getConsultById(String id) {
        return consultRepository.findById(id);
    }

    @Override
    public List<Consult> getAllConsults() {
        return consultRepository.findAll();
    }

    @Override
    public Consult saveConsult(Consult consult) {
        return consultRepository.save(consult);
    }

    @Override
    public void deleteConsultById(String id) {
        consultRepository.deleteById(id);
    }
}
