
package com.proyecto.integrador.repository;

import com.proyecto.integrador.model.Encabezado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EncRepository extends JpaRepository <Encabezado, Long> {
    
}
