package pe.edu.upeu.examengodoy.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.examengodoy.dao.TipoordenDao;
import pe.edu.upeu.examengodoy.entity.Tipoorden;
import pe.edu.upeu.examengodoy.repository.TipoordenRepository;



@Component
public class TipoordenDaoImpl implements TipoordenDao {
	@Autowired
    private TipoordenRepository tipoordenRepository;

    @Override
    public Tipoorden create(Tipoorden t) {
        return tipoordenRepository.save(t);
    }

    @Override
    public Tipoorden update(Tipoorden t) {
        return tipoordenRepository.save(t);
    }

    @Override
    public void delete(Long id) {
        tipoordenRepository.deleteById(id);
    }

    @Override
    public Tipoorden read(Long id) {
        return tipoordenRepository.findById(id).orElse(null);
    }

    @Override
    public List<Tipoorden> readAll() {
        return tipoordenRepository.findAll();
    }
}
