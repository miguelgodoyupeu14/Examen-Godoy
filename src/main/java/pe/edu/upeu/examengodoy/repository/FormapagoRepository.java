package pe.edu.upeu.examengodoy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.examengodoy.entity.Formapago;



@Repository
public interface FormapagoRepository extends JpaRepository<Formapago, Long> {

}
