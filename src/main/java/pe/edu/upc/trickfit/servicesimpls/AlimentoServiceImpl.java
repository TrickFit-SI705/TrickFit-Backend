package pe.edu.upc.trickfit.servicesimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.trickfit.entities.Alimento;
import pe.edu.upc.trickfit.repositories.IAlimentoRepository;
import pe.edu.upc.trickfit.servicesinterfaces.IAlimentoService;

import java.util.List;
@Service
public class AlimentoServiceImpl implements IAlimentoService {
    @Autowired
    private IAlimentoRepository aR;

    @Override
    public void insert(Alimento alimento) {
        aR.save(alimento);
    }

    @Override
    public List<Alimento> list() {
        return aR.findAll();
    }

    @Override
    public void delete(int idAlimento) {
        aR.deleteById(idAlimento);
    }

    @Override
    public List<Alimento> search(String nameAlimento) {
        return aR.search(nameAlimento);
    }
}
