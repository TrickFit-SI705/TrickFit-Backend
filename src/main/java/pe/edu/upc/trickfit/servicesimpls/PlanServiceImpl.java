package pe.edu.upc.trickfit.servicesimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.trickfit.entities.Plan;
import pe.edu.upc.trickfit.repositories.IPlanRepository;
import pe.edu.upc.trickfit.servicesinterfaces.IPlanService;

import java.util.List;
@Service
public class PlanServiceImpl implements IPlanService {
    @Autowired
    private IPlanRepository pR;

    @Override
    public void insert(Plan plan) {
        pR.save(plan);
    }

    @Override
    public List<Plan> list() {
        return pR.findAll();
    }

    @Override
    public void delete(int idPlan) {
        pR.deleteById(idPlan);
    }

    @Override
    public List<Plan> search(String namePlan) {
        return pR.search(namePlan);
    }
}
