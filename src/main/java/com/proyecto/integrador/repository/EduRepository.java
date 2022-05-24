package com.proyecto.integrador.repository;

import com.proyecto.integrador.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EduRepository extends JpaRepository <Educacion, Long>{
    
    
}
