package com.portfolio.mgb.controller;

import com.portfolio.mgb.Interface.IPersonaService;
import com.portfolio.mgb.entity.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Personas")
@CrossOrigin(origins = "https://frontendprueba-5687a.web.app")
public class PersonaController {

    @Autowired
    IPersonaService ipersonaService;

    
    @GetMapping("/traer")
    public List<Persona> getPersona() {
        return ipersonaService.getpersona();
    }

    @PostMapping("/crear")
    public String createPersona(@RequestBody Persona persona) {
        ipersonaService.savepersona(persona);
        return "la persona fue creada correctamente";

    }

    @DeleteMapping("/borrar/{id}")
    public String deletePersona(@PathVariable Long id) {
        ipersonaService.deletepersona(id);
        return "La persona fue elimina correctamente";
    }

    @PutMapping("/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
            @RequestParam("nombre") String nuevoNombre,
            @RequestParam("apellido") String nuevoApellido,
            @RequestParam("img") String nuevoImg) {
        Persona persona = ipersonaService.findpersona(id);

        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setImg(nuevoImg);

        ipersonaService.savepersona(persona);
        return persona;

    }
}

