package org.citasmedicas.java.entities;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
@Setter

public class Paciente {
    private Integer id;
    private String nombre;
    private String apellidos;
    private TipoIdentificacion tipoIdentificacion;
    private Integer numeroIdentificacion;
    private String correoElectronico;
    private Integer celular;
    private LocalDate fechaNacimiento;
    private double altura;
    private double peso;
    private TipoSangre tipoSangre;
    private Character factorRH;

}
