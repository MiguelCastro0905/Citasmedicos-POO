package org.citasmedicas.java.entities;



public class CitaMedico {

    Medico medico;
    Estado estado;

    public CitaMedico(Medico medico, Estado estado) {
        this.medico = medico;
        this.estado = estado;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    

}
