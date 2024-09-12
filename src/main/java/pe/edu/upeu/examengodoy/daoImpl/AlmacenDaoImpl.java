package pe.edu.upeu.examengodoy.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.examengodoy.dao.AlmacenDao;
import pe.edu.upeu.examengodoy.entity.Almacen;
import pe.edu.upeu.examengodoy.repository.AlmacenRepository;



@Component
public class AlmacenDaoImpl implements AlmacenDao{
	@Autowired
    private AlmacenRepository almacenRepository;

    @Override
    public Almacen create(Almacen a) {
        return almacenRepository.save(a);
    }

    @Override
    public Almacen update(Almacen a) {
        return almacenRepository.save(a);
    }

    @Override
    public void delete(Long id) {
        almacenRepository.deleteById(id);
    }

    @Override
    public Almacen read(Long id) {
        return almacenRepository.findById(id).orElse(null);
    }

    @Override
    public List<Almacen> readAll() {
        return almacenRepository.findAll();
    }
}
