package pe.edu.upeu.examengodoy.dao;

import java.util.List;

import pe.edu.upeu.examengodoy.entity.Orden;



public interface OrdenDao {
	Orden create(Orden o);
    Orden update(Orden o);
    void delete(Long id);
    Orden read(Long id);
    List<Orden> readAll();
}
