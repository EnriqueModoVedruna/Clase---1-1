package com.example.clase.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.clase.persistance.models.Contacto;

@Repository
public interface ContactoRepositoryI extends JpaRepository<Contacto, Long> {
    
    Contacto findByDireccion(String direccion);
    Contacto findByTelefono(int telefono);
    Contacto findByIdAlumno(Long idAlumno);
}
