
package com.proyecto.integrador.service;

import com.proyecto.integrador.model.Encabezado;
import com.proyecto.integrador.repository.EncRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EncabezadoService implements IEncabezadoService {

@Autowired
public EncRepository encRepo;

@Override
public List<Encabezado> verEncabezado() {
return encRepo.findAll();
}

@Override
public void crearEncabezado(Encabezado enc) {
encRepo.save(enc);
}

 
@Override
  public void modificarEncabezado(Encabezado enc) {
     encRepo.save(enc);
  } 


}
