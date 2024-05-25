package org.citasmedicas.java.entities;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

public class Paciente extends Usuario{
    protected Integer id;
    protected String nombre;
    protected String apellidos;
    protected TipoIdentificacion tipoIdentificacion;
    protected Integer numeroIdentificacion;
    protected String correoElectronico;
    protected Integer celular;
    protected LocalDate fechaNacimiento;
    protected double altura;
    protected double peso;
    protected TipoSangre tipoSangre;
    protected Character factorRH;

    public Paciente(Integer id, String nombres, String apellidos, TipoIdentificacion tipoIdentificacion,
            Integer numeroIdentificacion, Integer id2, String nombre, String apellidos2,
            TipoIdentificacion tipoIdentificacion2, Integer numeroIdentificacion2, String correoElectronico,
            Integer celular, LocalDate fechaNacimiento, double altura, double peso, TipoSangre tipoSangre,
            Character factorRH) {

                    super(id, nombres, apellidos, tipoIdentificacion, numeroIdentificacion);
                    id = id2;
                    this.nombre = nombre;
                    apellidos = apellidos2;
                    tipoIdentificacion = tipoIdentificacion2;
                    numeroIdentificacion = numeroIdentificacion2;
                    this.correoElectronico = correoElectronico;
                    this.celular = celular;
                    this.fechaNacimiento = fechaNacimiento;
                    this.altura = altura;
                    this.peso = peso;
                    this.tipoSangre = tipoSangre;
                    this.factorRH = factorRH;
                }
    

}
