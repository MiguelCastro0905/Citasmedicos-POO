package org.citasmedicas.java.entities;

import java.time.LocalDate;



public class Prueba {
    public static void main(String[] args) {
        
        //instanciar medico con constructor
        //por defecto
        Medico m = new Medico();
        //accediendo a atributos del medico
        //para asignar el id al medico: Utilizar el setterid
        m.setId(1);
        //imprimir el id del medico: utlizo el getId
        /*System.out.println(m.getId())*/;

        //Crear paciente
        Paciente p1 = new Paciente(1,
                            "Andres", 
                            "Herrera", 
                            TipoIdentificacion.CEDULA_EXTRANEJRIA,
                            1342552, 
                            "nder@gmail.com", 
                            319267982, 
                            LocalDate.of(2003, 12, 24), 
                            1.78, 54, TipoSangre.AB, 
                            '-');


        //Utilizar los getter y setter del lombok
        /*System.out.println("Nombre: " + p1.getNombre() + " Apellidos: " + p1.getApellidos());*/ 
       
         
         Consultorio co1 = new Consultorio(1,
                        "calle 22 #34-23",
                        101);

        /*System.out.println("direccion: " + co1.getDireccion() + " numero: " + co1.getNumero());*/



        Cita ci1 = new Cita(1, LocalDate.of(2024, 12, 7));
        System.out.println("Cita: " + ci1.getId() + " fecha:" + ci1.getFecha() + " Medico: " + m.getId() + " Paciente: " + p1.getNombre() + " En el Consultorio: " + co1.getNumero());
    }
  
}
