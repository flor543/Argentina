package com.portfolio.mgb.controller;

import com.portfolio.mgb.Interface.IPersonaService;
import com.portfolio.mgb.entity.persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController 
@CrossOrigin (origins ="https://frontendprueba-5687a.web.app")

public class PersonaController {
    @Autowired IPersonaService ipersonaService;
    
    
       
    @GetMapping("/Personas/traer")
    public List<persona> getPersona(){ 
        return ipersonaService.getpersona();
    }    
    

    @PostMapping("/Personas/crear")
    public String createpersona(@RequestBody persona Persona) {
        ipersonaService.savepersona(Persona);
        return "La persona fue creada correctamente";
    }
    
    @DeleteMapping("/Personas/borrar/{id}")
    public String Deletepersona(@PathVariable Long id) {
        ipersonaService.deletepersona(id);
        return "La persona fue eliminada correctamente";
        
    }
    
   
    @PutMapping("/Personas/editar/{id}")
    public persona editpersona(@PathVariable Long id,
                                @RequestParam("nombre") String nuevoNombre,        
                                @RequestParam("apellido") String nuevoApellido,        
                                @RequestParam("img") String nuevoImg) {
    persona Persona = ipersonaService.findpersona(id);
    Persona.setNombre(nuevoNombre);
    Persona.setApellido(nuevoApellido);
    Persona.setImg(nuevoImg);
    
    ipersonaService.savepersona(Persona);
    return Persona;
    
    }
    

    
}       
            
           
       
