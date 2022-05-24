
package com.proyecto.integrador.service;

import com.proyecto.integrador.model.Proyecto;
import com.proyecto.integrador.repository.ProRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService {
    
    @Autowired
    public ProRepository proRepo;

    @Override
    public List<Proyecto> verProyecto() {
        return proRepo.findAll();
    }

    @Override
    public void crearProyecto(Proyecto pro) {
        proRepo.save(pro);
    }

    @Override
    public void borrarProyecto(Long id) {
        proRepo.deleteById(id);
    }

    @Override
    public Proyecto buscarProyecto(Long id) {
        return proRepo.findById(id).orElse(null);
    }
    
      @Override
    public void modificarProyecto(Proyecto pro) {
        proRepo.save(pro);
    }
}
