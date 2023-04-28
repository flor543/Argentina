package com.portfolio.mgb.Interface;

import com.portfolio.mgb.entity.persona;
import java.util.List;


public interface IPersonaService {
    //Traer una lista de personas
    public List<persona> getpersona();
    
    //Guardar un objeto de tipo persona
    public void savepersona(persona Persona);
    
    //Eliminar un objeto pero lo buscamos por ID
    public void deletepersona(Long id);
     
    //Busar una persona por ID
    public persona findpersona(Long id);
       
}
