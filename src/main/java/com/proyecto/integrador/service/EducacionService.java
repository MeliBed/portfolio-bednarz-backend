
package com.proyecto.integrador.service;

import com.proyecto.integrador.model.Educacion;
import com.proyecto.integrador.repository.EduRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService {
    @Autowired
    public EduRepository eduRepo;

    @Override
    public List<Educacion> verEducacion() {
        return eduRepo.findAll();
    }

    @Override
    public void crearEducacion(Educacion edu) {
        eduRepo.save(edu);
    }
    

  @Override
  public void borrarEducacion(Long id) {
    eduRepo.deleteById(id);
  }

   @Override
  public Educacion buscarEducacion(Long id) {
   return eduRepo.findById(id).orElse(null);    }

  @Override
  public void modificarEducacion(Educacion edu) {
     eduRepo.save(edu);
  }
    

}