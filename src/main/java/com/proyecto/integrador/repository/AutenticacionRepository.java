
package com.proyecto.integrador.repository;

import com.proyecto.integrador.model.Usuarios;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutenticacionRepository extends JpaRepository <Usuarios, Long>{
    List<Usuarios> findByEmailAndIsEnabledTrue(String email);
    
}
