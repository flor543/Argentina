package com.portfolio.mgb.Interface;

import com.portfolio.mgb.entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Traer una lista de personas
    public List<Persona> getpersona();
    
    //Guardar un objeto de tipo Persona
    public void savepersona(Persona Persona);
    
    //Eliminar un objeto pero lo buscamos por ID
    public void deletepersona(Long id);
     
    //Busar una Persona por ID
    public Persona findpersona(Long id);
       
}
