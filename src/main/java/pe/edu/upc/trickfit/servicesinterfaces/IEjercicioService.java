package pe.edu.upc.trickfit.servicesinterfaces;

import pe.edu.upc.trickfit.entities.Ejercicio;

import java.util.List;

public interface IEjercicioService {
    public void insert(Ejercicio ejercicio);
    List<Ejercicio>list();
    public void delete(int idEjercicio);
    List<Ejercicio> search(String tituloEjercicio);
}
