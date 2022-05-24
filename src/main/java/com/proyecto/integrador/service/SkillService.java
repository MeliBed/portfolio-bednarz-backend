
package com.proyecto.integrador.service;

import com.proyecto.integrador.model.Skill;
import com.proyecto.integrador.repository.SkiRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService implements ISkillService{
    
    @Autowired
    public SkiRepository skiRepo;

    @Override
    public List<Skill> verSkill() {
        return skiRepo.findAll();
    }

    @Override
    public void crearSkill(Skill ski) {
        skiRepo.save(ski);
    }

    @Override
    public void borrarSkill(Long id) {
        skiRepo.deleteById(id);
    }

    @Override
    public Skill buscarSkill(Long id) {
        return skiRepo.findById(id).orElse(null);
    }
    
  @Override
    public void modificarSkill(Skill ski) {
        skiRepo.save(ski);
    }
}
