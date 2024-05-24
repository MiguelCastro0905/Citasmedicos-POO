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
public class Cita {
    
    private Integer id;
    private LocalDate fecha;

}
