package pe.edu.upc.trickfit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trickfit.entities.Tipo_usuario;
import pe.edu.upc.trickfit.servicesinterfaces.ITipo_usuarioService;

import java.util.List;

@RestController
@RequestMapping("/tipo_usuarios")
public class Tipo_usuarioController {
@Autowired
    private ITipo_usuarioService pService;

    @PostMapping
    public void registrar(@RequestBody Tipo_usuario tu) {
        pService.insert(tu);
    }

    @GetMapping
    public List<Tipo_usuario> listar() {
        return pService.list();
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        pService.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody Tipo_usuario tipo_usuario){
        pService.insert(tipo_usuario);
    }

    @PostMapping("/buscar")
    public List<Tipo_usuario> buscar(@RequestBody Tipo_usuario tipo_usuario){
        List<Tipo_usuario> lista;
        tipo_usuario.setNameTipoUsuario(tipo_usuario.getNameTipoUsuario());
        lista= pService.search(tipo_usuario.getNameTipoUsuario());
        return lista;
    }
}
