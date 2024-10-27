package com.example.clase.persistance.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.clase.persistance.models.Alumno;
import com.example.clase.persistance.models.Contacto;
import com.example.clase.services.ContactoServiceI;

@RequestMapping("/api/v1/contacto")
public class ContactoController {

    @Autowired
    private ContactoServiceI contactMngmnt;

    @GetMapping
    public List<Contacto> getAllContactos(){
        return contactMngmnt.showAllContactos();
    }

    @GetMapping("direccion/{direccion}")
    public Contacto getMethodName(@PathVariable String direccion){
        return contactMngmnt.showContactoByDireccion(direccion);
    }

    @GetMapping("telefono/{telefono}")
    public Contacto getMethodName(@PathVariable int telefono){
        return contactMngmnt.showContactoByTelefono(telefono);
    }

    @GetMapping("alumnos_idalumno/{idAlumno}")
    public Contacto getMethodName(@PathVariable Long id){
        return contactMngmnt.showContactoByAlumno(id);
    }

    @PostMapping("/insert")
    public String postContacto(@RequestBody Contacto contacto) {
        contactMngmnt.saveContacto(contacto);
        
        return "Contacto registrado";
    }

    @PostMapping("/edit/{id}")
    public String editContacto(@PathVariable Long id) {
        contactMngmnt.editContacto(id, null);
        
        return "Contacto editado";
    }

    @DeleteMapping("delete/{id}")
    public String deleteContacto(@PathVariable Long id){
        contactMngmnt.deleteContacto(id);
        return "Contacto eliminado";
    }   

}