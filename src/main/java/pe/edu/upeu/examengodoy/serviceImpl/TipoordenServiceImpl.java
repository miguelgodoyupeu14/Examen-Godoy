package pe.edu.upeu.examengodoy.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.examengodoy.dao.TipoordenDao;
import pe.edu.upeu.examengodoy.entity.Tipoorden;
import pe.edu.upeu.examengodoy.service.TipoordenService;



@Service
public class TipoordenServiceImpl implements TipoordenService {

    @Autowired
    private TipoordenDao tipoordenDao;

    @Override
    public Tipoorden create(Tipoorden t) {
        return tipoordenDao.create(t);
    }

    @Override
    public Tipoorden update(Tipoorden t) {
        return tipoordenDao.update(t);
    }

    @Override
    public void delete(Long id) {
        tipoordenDao.delete(id);
    }

    @Override
    public Tipoorden read(Long id) {
        return tipoordenDao.read(id);
    }

    @Override
    public List<Tipoorden> readAll() {
        return tipoordenDao.readAll();
    }
}

