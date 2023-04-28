package com.portfolio.mgb.service;

import com.portfolio.mgb.Interface.IPersonaService;
import com.portfolio.mgb.entity.persona;
import com.portfolio.mgb.repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service 
public class ImpPersonaService implements IPersonaService{
@Autowired IPersonaRepository iPersonaRepository;   

    @Override
    public List<persona> getpersona() {
        List<persona>Persona = iPersonaRepository.findAll();
        return Persona;         
                
    }

    @Override
    public void savepersona(persona persona) {
        iPersonaRepository.save(persona);
    }

    @Override
    public void deletepersona(Long id) {
        iPersonaRepository.deleteById(id);
    }

    @Override
    public persona findpersona(Long id) {
       persona Persona = iPersonaRepository.findById(id).orElse(null);
       return Persona;
    }
    
    
}
