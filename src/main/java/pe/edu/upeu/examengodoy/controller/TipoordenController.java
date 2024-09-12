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
import pe.edu.upeu.examengodoy.entity.Tipoorden;
import pe.edu.upeu.examengodoy.service.TipoordenService;


@RestController
@RequestMapping("tipoordenes")
public class TipoordenController {
	@Autowired
    private TipoordenService tipoordenService;

    @GetMapping
    public ResponseEntity<List<Tipoorden>> readAll() {
        try {
            List<Tipoorden> tipoordenes = tipoordenService.readAll();
            if (tipoordenes.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(tipoordenes, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity<Tipoorden> crear(@Valid @RequestBody Tipoorden tipoorden) {
        try {
            Tipoorden t = tipoordenService.create(tipoorden);
            return new ResponseEntity<>(t, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tipoorden> getTipoordenById(@PathVariable("id") Long id) {
        try {
            Tipoorden t = tipoordenService.read(id);
            if (t != null) {
                return new ResponseEntity<>(t, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteTipoorden(@PathVariable("id") Long id) {
        try {
            tipoordenService.delete(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Tipoorden> updateTipoorden(@PathVariable("id") Long id, @Valid @RequestBody Tipoorden tipoorden) {
        Tipoorden t = tipoordenService.read(id);
        if (t != null) {
            return new ResponseEntity<>(tipoordenService.update(tipoorden), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
