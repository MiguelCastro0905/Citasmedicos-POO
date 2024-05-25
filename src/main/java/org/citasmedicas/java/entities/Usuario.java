package org.citasmedicas.java.entities;


import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public abstract class Usuario {
//de una clase abastracta no se pueden crear objetos
//no se pueden instanciar 
//ej: uduario u = 

    protected Integer id;
    protected String nombres;
    protected String apellidos;
    protected TipoIdentificacion tipoIdentificacion;
    protected Integer numeroIdentificacion;


    public Usuario(Integer id, String nombres, String apellidos, TipoIdentificacion tipoIdentificacion,
            Integer numeroIdentificacion) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroIdentificacion = numeroIdentificacion;
    }
   
}
