package pe.edu.upc.trickfit.entities;

import javax.persistence.*;

@Entity
@Table(name = "Tipo_usuario")
public class Tipo_usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoUsuario;
    @Column(name = "nameTipoUsuario", length = 30, nullable = false)
    private String nameTipoUsuario;

    public Tipo_usuario() {
    }

    public Tipo_usuario(int idTipoUsuario, String nameTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
        this.nameTipoUsuario = nameTipoUsuario;
    }

    public int getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(int idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    public String getNameTipoUsuario() {
        return nameTipoUsuario;
    }

    public void setNameTipoUsuario(String nameTipoUsuario) {
        this.nameTipoUsuario = nameTipoUsuario;
    }
}
