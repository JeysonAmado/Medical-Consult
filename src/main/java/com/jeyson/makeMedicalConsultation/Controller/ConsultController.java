package com.jeyson.makeMedicalConsultation.Controller;

import com.jeyson.makeMedicalConsultation.Entity.Consult;
import com.jeyson.makeMedicalConsultation.Interfaces.Services.ConsultServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/consult")
public class ConsultController {
    @Autowired
    private ConsultServiceInterface consultService;

    @GetMapping("")
    public List<Consult> getAllConsults() {
        return consultService.getAllConsults();
    }

    @GetMapping("/{id}")
    public Consult getConsultById(@PathVariable Long id) {
        return consultService.getConsultById(id);
    }

    @PostMapping("/save")
    public Consult createConsult(@RequestBody Consult consult) {
        return consultService.saveConsult(consult);
    }

    @PutMapping("/{id}")
    public Consult updateConsult(@PathVariable Long id, @RequestBody Consult consult) {
        Consult consultToUpdate = consultService.getConsultById(id);
        if (consultToUpdate != null) {
            consultToUpdate.setSymptoms(consult.getSymptoms());
            consultToUpdate.setDiagnostic(consult.getDiagnostic());
            return consultService.saveConsult(consultToUpdate);
        } else {
            return null;
        }
    }

    @DeleteMapping("/delete/{id}")
    public void deleteConsultById(@PathVariable Long id) {
        consultService.deleteConsultById(id);
    }

    @GetMapping("/verificar/test")
    public String verificar() {
        return "Conexión Exitosa";
    }
}