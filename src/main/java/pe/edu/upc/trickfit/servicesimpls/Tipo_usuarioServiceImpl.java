package pe.edu.upc.trickfit.servicesimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.trickfit.entities.Tipo_usuario;
import pe.edu.upc.trickfit.repositories.ITipo_usuarioRepository;
import pe.edu.upc.trickfit.servicesinterfaces.ITipo_usuarioService;

import java.util.List;
@Service
public class Tipo_usuarioServiceImpl implements ITipo_usuarioService {
    @Autowired
    private ITipo_usuarioRepository tuR;

    @Override
    public void insert(Tipo_usuario tipo_usuario) {
        tuR.save(tipo_usuario);
    }

    @Override
    public List<Tipo_usuario> list() {
        return tuR.findAll();
    }

    @Override
    public void delete(int idTipoUsuario) {
        tuR.deleteById(idTipoUsuario);
    }

    @Override
    public List<Tipo_usuario> search(String nameTipoUsuario) {
        return tuR.search(nameTipoUsuario);
    }
}
