
package com.proyecto.integrador.repository;

import com.proyecto.integrador.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkiRepository extends JpaRepository <Skill, Long>{
    
}
