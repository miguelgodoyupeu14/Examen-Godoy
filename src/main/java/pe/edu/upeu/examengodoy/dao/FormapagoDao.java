package pe.edu.upeu.examengodoy.dao;

import java.util.List;

import pe.edu.upeu.examengodoy.entity.Formapago;



public interface FormapagoDao {
	Formapago create(Formapago f);
    Formapago update(Formapago f);
    void delete(Long id);
    Formapago read(Long id);
    List<Formapago> readAll();
}
