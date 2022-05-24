
package com.proyecto.integrador.repository;

import com.proyecto.integrador.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProRepository  extends JpaRepository <Proyecto, Long> {
    
}
