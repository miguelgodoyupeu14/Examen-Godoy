package pe.edu.upeu.examengodoy.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.examengodoy.dao.OrdenDao;
import pe.edu.upeu.examengodoy.entity.Orden;
import pe.edu.upeu.examengodoy.repository.OrdenRepository;



@Component
public class OdenDaoImpl implements OrdenDao{
	@Autowired
    private OrdenRepository ordenRepository;

    @Override
    public Orden create(Orden o) {
        return ordenRepository.save(o);
    }

    @Override
    public Orden update(Orden o) {
        return ordenRepository.save(o);
    }

    @Override
    public void delete(Long id) {
        ordenRepository.deleteById(id);
    }

    @Override
    public Orden read(Long id) {
        return ordenRepository.findById(id).orElse(null);
    }

    @Override
    public List<Orden> readAll() {
        return ordenRepository.findAll();
    }
}
