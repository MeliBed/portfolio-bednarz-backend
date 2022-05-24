
package com.proyecto.integrador.repository;

import com.proyecto.integrador.model.Educacion;
import com.proyecto.integrador.model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ExpRepository extends JpaRepository <Experiencia, Long>{
    
}
