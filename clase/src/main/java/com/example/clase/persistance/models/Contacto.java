package com.example.clase.persistance.models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "infocontacto")
public class Contacto implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "idinfocontacto")
    private Long idContacto;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "telefono")
    private int telefono;

    @Column(name = "alumnos_idalumno")
    private Long idAlumno;
}
