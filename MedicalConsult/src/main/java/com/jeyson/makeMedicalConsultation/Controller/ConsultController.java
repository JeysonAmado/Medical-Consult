package com.jeyson.makeMedicalConsultation.Controller;

import com.jeyson.makeMedicalConsultation.Entity.Consult;
import com.jeyson.makeMedicalConsultation.Interfaces.Services.ConsultServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/consult")
public class ConsultController {
    @Autowired
    private ConsultServiceInterface consultService;

    @GetMapping("/{id}")
    public ResponseEntity<Consult> getConsultById(@PathVariable String id) {
        Optional<Consult> consult = consultService.getConsultById(id);
        if (consult.isPresent()) {
            return new ResponseEntity<>(consult.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    public ResponseEntity<List<Consult>> getAllConsults() {
        List<Consult> consults = consultService.getAllConsults();
        return new ResponseEntity<>(consults, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Consult> saveConsult(@RequestBody Consult consult) {
        Consult savedConsult = consultService.saveConsult(consult);
        return new ResponseEntity<>(savedConsult, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteConsultById(@PathVariable String id) {
        consultService.deleteConsultById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}