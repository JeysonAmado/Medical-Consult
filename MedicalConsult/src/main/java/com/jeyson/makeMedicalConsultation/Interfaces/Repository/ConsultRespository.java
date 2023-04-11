package com.jeyson.makeMedicalConsultation.Interfaces.Repository;

import com.jeyson.makeMedicalConsultation.Entity.Consult;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ConsultRespository extends MongoRepository<Consult, String> {
}
