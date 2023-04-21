package com.jeyson.makeMedicalConsultation.Interfaces.Repository;

import com.jeyson.makeMedicalConsultation.Entity.Consult;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultRespository extends JpaRepository<Consult, Long> {
}
