package pe.edu.upc.trickfit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trickfit.entities.Plan;
import pe.edu.upc.trickfit.servicesinterfaces.IPlanService;

import java.util.List;

@RestController
@RequestMapping("/planes")
public class PlanController {
    @Autowired
    private IPlanService pService;

    @PostMapping
    public void registrar(@RequestBody Plan p) {
        pService.insert(p);
    }

    @GetMapping
    public List<Plan> listar() {
        return pService.list();
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        pService.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody Plan plan){
        pService.insert(plan);
    }

    @PostMapping("/buscar")
    public List<Plan>buscar(@RequestBody Plan plan){
        List<Plan>lista;
        plan.setNamePlan(plan.getNamePlan());
        lista=pService.search(plan.getNamePlan());
        return lista;
    }
}
