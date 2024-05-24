package org.citasmedicas.java.entities;

import org.citasmedicas.Especialidad;

public class Medico {   
    //el modificador de acceso 
    //se pone antes del tipo de dato
    //del atributo
    //default

    
    // se recomienda para implementar el encapsulamiento
    // que todos los atributos de una clase 
    // sean privados
    private Integer id;
    private String nombres;
    private String apellidos;
    private TipoIdentificacion tipoIdentificacion;
    private Integer numeroIdentificacion;
    private Integer registroMedico;
    private Especialidad especialidad;
    
    public Medico(Integer id, String nombres, String apellidos, TipoIdentificacion tipoIdentificacion,
            Integer numeroIdentificacion, Integer registroMedico, Especialidad especialidad) {
       
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroIdentificacion = numeroIdentificacion;
        this.registroMedico = registroMedico;
        this.especialidad = especialidad;
    }
    public Medico() {
    }

    //set para id
    //getter y setter deben ser publicos
    //setter no retornan valor: void
    //el parametro : valor a asignar el atributo:
    //  valor que debe ser del tipo de dato del atributo

    public void setId(Integer id){
        //asignacion del valor a atributo
        //de izquierda a derecha
        this.id = id;
    } 
    //get : retorna el valor del tipo de dato del atributo
    // los get no tiene parametros
    public Integer getId(){
        //retorna el valor del atributo
        return this.id;
    }
    
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    @Override
    public String toString() {
        return "Medico [id=" + id + ", nombres=" + nombres + ", apellidos=" + apellidos + ", tipoIdentificacion="
                + tipoIdentificacion + ", numeroIdentificacion=" + numeroIdentificacion + ", registroMedico="
                + registroMedico + ", especialidad=" + especialidad + "]";
    }

    

}
