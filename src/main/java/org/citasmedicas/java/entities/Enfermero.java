package org.citasmedicas.java.entities;
import java.util.List;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class Enfermero{

    private String nombre;
    private Integer id;
    private String especialidad;
    private String horarioTrabajo;
    private String telefono;
    private String correo;
    private Integer experencia;
    private boolean disponible;
    private List<Paciente> pacienteAsignado;



    public Enfermero(String nombre, Integer id, String especialidad, String horarioTrabajo, String telefono,
            String correo, Integer experencia, boolean disponible, List<Paciente> pacienteAsignado) {
        this.nombre = nombre;
        this.id = id;
        this.especialidad = especialidad;
        this.horarioTrabajo = horarioTrabajo;
        this.telefono = telefono;
        this.correo = correo;
        this.experencia = experencia;
        this.disponible = disponible;
        this.pacienteAsignado = pacienteAsignado;
    } 



}
