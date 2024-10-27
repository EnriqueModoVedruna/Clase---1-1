package com.example.clase.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.clase.persistance.models.Alumno;

@Repository
public interface AlumnoRepositoryI extends JpaRepository<Alumno, Long> {
    
    Alumno findByNombre(String nombre);
    Alumno findByApellidos(String apellidos);
    Alumno findByNameAndApellidos(String name, String apellidos);

}
