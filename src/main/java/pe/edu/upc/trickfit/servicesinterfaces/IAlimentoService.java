package pe.edu.upc.trickfit.servicesinterfaces;

import pe.edu.upc.trickfit.entities.Alimento;

import java.util.List;

public interface IAlimentoService {
    public void insert(Alimento alimento);
    List<Alimento>list();
    public void delete(int idAlimento);
    List<Alimento> search(String nameAlimento);
}
