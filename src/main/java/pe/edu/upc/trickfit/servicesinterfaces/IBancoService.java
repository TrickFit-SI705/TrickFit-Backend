package pe.edu.upc.trickfit.servicesinterfaces;

import pe.edu.upc.trickfit.entities.Banco;

import java.util.List;

public interface IBancoService {
    public void insert(Banco banco);
    List<Banco>list();

    public void delete (int idBanco);

    List<Banco> search(String nameBanco);
}
