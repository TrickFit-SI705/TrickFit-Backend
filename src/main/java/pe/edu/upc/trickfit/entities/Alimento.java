package pe.edu.upc.trickfit.entities;

import javax.persistence.*;

@Entity
@Table(name = "Alimento")
public class Alimento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAlimento;
    @Column(name = "nameAlimento", length = 30, nullable = false)
    private String nameAlimento;
    @Column(name = "calAlimento", nullable = false)
    private int calAlimento;

    public Alimento() {
    }

    public Alimento(int idAlimento, String nameAlimento, int calAlimento) {
        this.idAlimento = idAlimento;
        this.nameAlimento = nameAlimento;
        this.calAlimento = calAlimento;
    }

    public int getIdAlimento() {
        return idAlimento;
    }

    public void setIdAlimento(int idAlimento) {
        this.idAlimento = idAlimento;
    }

    public String getNameAlimento() {
        return nameAlimento;
    }

    public void setNameAlimento(String nameAlimento) {
        this.nameAlimento = nameAlimento;
    }

    public int getCalAlimento() {
        return calAlimento;
    }

    public void setCalAlimento(int calAlimento) {
        this.calAlimento = calAlimento;
    }
}
