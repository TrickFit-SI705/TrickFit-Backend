package pe.edu.upc.trickfit.entities;

import javax.persistence.*;

@Entity
@Table(name = "Banco")
public class Banco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBanco;
    @Column(name = "nameBanco", length = 30, nullable = false)
    private String nameBanco;

    public Banco() {
    }

    public Banco(int idBanco, String nameBanco) {
        this.idBanco = idBanco;
        this.nameBanco = nameBanco;
    }

    public int getIdBanco() {
        return idBanco;
    }

    public void setIdBanco(int idBanco) {
        this.idBanco = idBanco;
    }

    public String getNameBanco() {
        return nameBanco;
    }

    public void setNameBanco(String nameBanco) {
        this.nameBanco = nameBanco;
    }
}
