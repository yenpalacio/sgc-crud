package co.edu.cesde.sgccrud.modules;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "estudiante")
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long estudianteId;
    @Column(name = "nombre",nullable = false,length = 100)
    @NotNull
    @Size(max = 100)
    @NotEmpty
    private String nombre;
    @Column(name = "correo",nullable = false,length = 100)
    @NotNull
    @Size(max = 100)
    @NotEmpty
    @Email
    private String correo;
    @Column(name = "activo",nullable = false)
    @NotNull
    private EstatusEstudiante activo;

    public Estudiante() {
    }

    public Estudiante(String correo, String nombre) {
        this.activo = EstatusEstudiante.ACTIVO;
        this.correo = correo;
        this.nombre = nombre;

    }

    public Long getEstudianteId() {
        return estudianteId;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public EstatusEstudiante getActivo() {
        return activo;
    }

    public void setActivo(EstatusEstudiante activo) {
        this.activo = activo;
    }



    @Override
    public String toString() {
        return "Estudiante{" +
                "estudianteId=" + estudianteId +
                ", nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", activo=" + activo +
                '}';
    }


}
