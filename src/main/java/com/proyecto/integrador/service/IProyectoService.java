
package com.proyecto.integrador.service;

import com.proyecto.integrador.model.Proyecto;
import java.util.List;


public interface IProyectoService {
    
    public List<Proyecto> verProyecto(); 
    public void crearProyecto(Proyecto pro);
    public void borrarProyecto (Long id);
    public Proyecto buscarProyecto(Long id);
    public void modificarProyecto(Proyecto proyecto);
    
}
