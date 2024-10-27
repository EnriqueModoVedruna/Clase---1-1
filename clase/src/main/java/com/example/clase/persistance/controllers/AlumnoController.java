package com.example.clase.persistance.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.clase.persistance.models.Alumno;
import com.example.clase.persistance.models.Contacto;
import com.example.clase.services.AlumnoServiceI;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/clase/v1/alumno")
public class AlumnoController {
    
    @Autowired
    private AlumnoServiceI alumMngmnt;

    @GetMapping
    public List<Alumno> getAllAlumnos() {
        return alumMngmnt.showAllAlumnos();
    }

    @GetMapping("/nombre/{nombre}")
    public Alumno getMethodNombre(@PathVariable String nombre) {
        return alumMngmnt.showAlumnoByNombre(nombre);
    }

    @GetMapping("/apellido/{apellido}")
    public Alumno getMethodApellido(@PathVariable String apellido) {
        return alumMngmnt.showAlumnoByApellidos(apellido);
    }
    
    @PostMapping("/insert")
    public ResponseEntity <Alumno> postAlumno(@RequestBody Alumno alumno){
        Alumno alumno2 = alumMngmnt.saveAlumno(alumno);

        return ResponseEntity.ok(alumno2);
    }

    

    @PutMapping("/edit/{id}")
    public String editAlumno(@PathVariable Long id, @RequestBody Alumno alumno) {
        alumMngmnt.editAlumno(id, alumno);        
        return "Alumno modificado";
    }


    @DeleteMapping("delete/{id}")
    public ResponseEntity <String> deleteAlumno(@PathVariable Long id){
        alumMngmnt.deleteAlumno(id);
        return ResponseEntity.ok("Alumno y datos eliminados");
    }    
    
}
