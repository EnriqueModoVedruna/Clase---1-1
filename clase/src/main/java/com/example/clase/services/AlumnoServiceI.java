package com.example.clase.services;

import java.util.List;
import com.example.clase.persistance.models.Alumno;
import com.example.clase.persistance.models.Contacto;
public interface AlumnoServiceI {
    
    List<Alumno> showAllAlumnos();
    Alumno showAlumnoByNombre(String nombre);
    Alumno showAlumnoByApellidos(String apellidos);
    Alumno showAlumnoByNombreAndApellidos(String nombre, String apellidos);

    Alumno saveAlumno(Alumno alumno);
    void deleteAlumno(Long id);
    Alumno editAlumno(Long id, Alumno alumno);

}
