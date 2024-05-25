package org.citasmedicas.java.entities;

public class CitaEnfermero {
    Enfermero enfermero;
    Estado estado;
    public CitaEnfermero(Enfermero enfermero, Estado estado) {
        this.enfermero = enfermero;
        this.estado = estado;
    }
    public Enfermero getEnfermero() {
        return enfermero;
    }
    public void setEnfermero(Enfermero enfermero) {
        this.enfermero = enfermero;
    }
    public Estado getEstado() {
        return estado;
    }
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
}
