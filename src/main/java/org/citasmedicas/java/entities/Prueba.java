package org.citasmedicas.java.entities;

import java.time.LocalDate;

import org.citasmedicas.Especialidad;



public class Prueba {
    public static void main(String[] args) {
        
        //instanciar medico con constructor
        //por defecto
        Medico m = new Medico(1,
                             "Alvaro", 
                             "Rosales",
                             TipoIdentificacion.REGISTRO_CIVIL,
                            100277638,
                            5663,
                            Especialidad.ONCOLOGIA);
        //accediendo a atributos del medico
        //para asignar el id al medico: Utilizar el setterid
        m.setId(1);
        //imprimir el id del medico: utlizo el getId
        /*System.out.println(m.getId())*/;

        //Crear paciente
        Paciente p1 = new Paciente(1,
                                   "Carlos",
                                "Sarmiento",
                                TipoIdentificacion.CEDULA_CIUDADANIA,
                                10002665,
                                2,
                                "Julian",
                                "Marin",
                                TipoIdentificacion.CEDULA_EXTRANEJRIA,
                                26625471,
                                "juli@gmail.com",
                                320543678,
                                LocalDate.of(24, 8, 8),
                                1.78,
                                99,
                                TipoSangre.AB,
                                '+');


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
