package pe.edu.upeu.examengodoy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import pe.edu.upeu.examengodoy.entity.Formapago;
import pe.edu.upeu.examengodoy.service.FormapagoService;




@RestController
@RequestMapping("formapagos")
public class FormapagoController {
	@Autowired
    private FormapagoService formapagoService;

    @GetMapping
    public ResponseEntity<List<Formapago>> readAll() {
        try {
            List<Formapago> formapagos = formapagoService.readAll();
            if (formapagos.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(formapagos, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity<Formapago> crear(@Valid @RequestBody Formapago formapago) {
        try {
            Formapago f = formapagoService.create(formapago);
            return new ResponseEntity<>(f, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Formapago> getFormapagoById(@PathVariable("id") Long id) {
        try {
            Formapago f = formapagoService.read(id);
            if (f != null) {
                return new ResponseEntity<>(f, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteFormapago(@PathVariable("id") Long id) {
        try {
            formapagoService.delete(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Formapago> updateFormapago(@PathVariable("id") Long id, @Valid @RequestBody Formapago formapago) {
        Formapago f = formapagoService.read(id);
        if (f != null) {
            return new ResponseEntity<>(formapagoService.update(formapago), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
