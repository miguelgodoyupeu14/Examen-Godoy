package pe.edu.upeu.examengodoy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.examengodoy.entity.Orden;



@Repository
public interface OrdenRepository extends JpaRepository<Orden, Long> {

}
