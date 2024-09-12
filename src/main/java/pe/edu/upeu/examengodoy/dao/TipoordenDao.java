package pe.edu.upeu.examengodoy.dao;

import java.util.List;

import pe.edu.upeu.examengodoy.entity.Tipoorden;



public interface TipoordenDao {
	 	Tipoorden create(Tipoorden t);
	    Tipoorden update(Tipoorden t);
	    void delete(Long id);
	    Tipoorden read(Long id);
	    List<Tipoorden> readAll();
}
