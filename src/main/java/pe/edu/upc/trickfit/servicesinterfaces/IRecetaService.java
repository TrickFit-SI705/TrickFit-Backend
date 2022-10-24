package pe.edu.upc.trickfit.servicesinterfaces;

import pe.edu.upc.trickfit.entities.Receta;

import java.util.List;

public interface IRecetaService {
    public void insert(Receta receta);
    List<Receta>list();

    public void delete(int idReceta);

    List<Receta> search(String tituloReceta);
}
