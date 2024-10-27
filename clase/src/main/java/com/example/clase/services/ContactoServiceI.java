package com.example.clase.services;

import java.util.List;

import com.example.clase.persistance.models.Contacto;

public interface ContactoServiceI {

    List<Contacto> showAllContactos();
    Contacto showContactoByDireccion(String direccion);
    Contacto showContactoByTelefono(int telefono);
    Contacto showContactoByAlumno(Long idAlumno);
    
    void saveContacto(Contacto contacto);
    void deleteContacto(Long id);
    Contacto editContacto(Long id, Contacto contacto);
}