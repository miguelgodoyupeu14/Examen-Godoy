package pe.edu.upeu.examengodoy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.examengodoy.entity.Almacen;



@Repository
public interface AlmacenRepository extends JpaRepository<Almacen, Long> {

}
