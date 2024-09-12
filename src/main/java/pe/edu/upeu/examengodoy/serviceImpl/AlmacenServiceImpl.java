package pe.edu.upeu.examengodoy.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.examengodoy.dao.AlmacenDao;
import pe.edu.upeu.examengodoy.entity.Almacen;
import pe.edu.upeu.examengodoy.service.AlmacenService;



@Service
public class AlmacenServiceImpl implements AlmacenService {

    @Autowired
    private AlmacenDao almacenDao;

    @Override
    public Almacen create(Almacen a) {
        return almacenDao.create(a);
    }

    @Override
    public Almacen update(Almacen a) {
        return almacenDao.update(a);
    }

    @Override
    public void delete(Long id) {
        almacenDao.delete(id);
    }

    @Override
    public Almacen read(Long id) {
        return almacenDao.read(id);
    }

    @Override
    public List<Almacen> readAll() {
        return almacenDao.readAll();
    }
}

