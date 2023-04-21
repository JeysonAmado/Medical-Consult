package com.jeyson.makeMedicalConsultation.Interfaces.Repository;

import com.jeyson.makeMedicalConsultation.Entity.Consult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultRespository extends JpaRepository<Consult, Long> {
}
