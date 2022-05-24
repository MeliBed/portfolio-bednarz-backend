
package com.proyecto.integrador.service;

import com.proyecto.integrador.model.Skill;
import java.util.List;


public interface ISkillService {
    
    public List<Skill> verSkill(); 
    public void crearSkill (Skill ski);
    public void borrarSkill(Long id);
    public Skill buscarSkill (Long id);
    public void modificarSkill(Skill skill);
    
}
