package pe.edu.upeu.examengodoy.service;

import java.util.List;

import pe.edu.upeu.examengodoy.entity.Almacen;


public interface AlmacenService {
	Almacen create(Almacen a);
    Almacen update(Almacen a);
    void delete(Long id);
    Almacen read(Long id);
    List<Almacen> readAll();
}
