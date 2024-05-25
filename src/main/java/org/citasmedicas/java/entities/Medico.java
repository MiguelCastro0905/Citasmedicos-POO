package org.citasmedicas.java.entities;

import org.citasmedicas.Especialidad;

public class Medico extends Usuario{   

    protected Integer registroMedico;
    protected Especialidad especialidad;
    
    public Medico(Integer id, String nombres, String apellidos, TipoIdentificacion tipoIdentificacion,
                    Integer numeroIdentificacion, Integer registroMedico, Especialidad especialidad) {
                
                //super(): llamada al constructor de la clase padre
                
                super(id, nombres, apellidos, tipoIdentificacion, numeroIdentificacion);
                //inicializacion de los atributospropios de la clase hija
                this.registroMedico = registroMedico;
                this.especialidad = especialidad;

    }

}


   
    
    
    



