package pe.edu.upc.trickfit.servicesimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.trickfit.entities.Banco;
import pe.edu.upc.trickfit.repositories.IBancoRepository;
import pe.edu.upc.trickfit.servicesinterfaces.IBancoService;

import java.util.List;
@Service
public class BancoServiceImpl implements IBancoService {
    @Autowired
    private IBancoRepository bR;

    @Override
    public void insert(Banco banco) {
        bR.save(banco);
    }

    @Override
    public List<Banco> list() {
        return bR.findAll();
    }

    @Override
    public void delete(int idBanco) {
        bR.deleteById(idBanco);
    }

    @Override
    public List<Banco> search(String nameBanco) {
        return bR.search(nameBanco);
    }
}
