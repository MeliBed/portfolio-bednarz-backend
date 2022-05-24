
package com.proyecto.integrador.service;

import com.proyecto.integrador.model.Experiencia;
import java.util.List;


public interface IExperienciaService {
    
    public List<Experiencia> verExperiencia(); 
    public void crearExperiencia(Experiencia exp);
    public void borrarExperiencia (Long id);
    public Experiencia buscarExperiencia (Long id);
    public void modificarExperiencia(Experiencia experiencia);
    
}
