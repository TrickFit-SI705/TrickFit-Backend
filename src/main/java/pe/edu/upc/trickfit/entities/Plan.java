package pe.edu.upc.trickfit.entities;

import javax.persistence.*;

@Entity
@Table(name = "Plan")
public class Plan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPlan;
    @Column(name = "namePlan", length = 30, nullable = false)
    private String namePlan;
    @Column(name = "detallesPlan", length = 500, nullable = false)
    private String detallesPlan;
    @Column(name = "tiempoPlan", length = 20, nullable = false)
    private String tiempoPlan;
    @Column(name = "precioPlan", nullable = false)
    private int precioPlan;

    public Plan() {
    }

    public Plan(int idPlan, String namePlan, String detallesPlan, String tiempoPlan, int precioPlan) {
        this.idPlan = idPlan;
        this.namePlan = namePlan;
        this.detallesPlan = detallesPlan;
        this.tiempoPlan = tiempoPlan;
        this.precioPlan = precioPlan;
    }

    public int getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(int idPlan) {
        this.idPlan = idPlan;
    }

    public String getNamePlan() {
        return namePlan;
    }

    public void setNamePlan(String namePlan) {
        this.namePlan = namePlan;
    }

    public String getDetallesPlan() {
        return detallesPlan;
    }

    public void setDetallesPlan(String detallesPlan) {
        this.detallesPlan = detallesPlan;
    }

    public String getTiempoPlan() {
        return tiempoPlan;
    }

    public void setTiempoPlan(String tiempoPlan) {
        this.tiempoPlan = tiempoPlan;
    }

    public int getPrecioPlan() {
        return precioPlan;
    }

    public void setPrecioPlan(int precioPlan) {
        this.precioPlan = precioPlan;
    }
}
