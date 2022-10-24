package pe.edu.upc.trickfit.servicesinterfaces;

import pe.edu.upc.trickfit.entities.Plan;

import java.util.List;

public interface IPlanService {
    public void insert(Plan plan);
    List<Plan>list();

    public void delete(int idPlan);

    List<Plan> search(String namePlan);
}
