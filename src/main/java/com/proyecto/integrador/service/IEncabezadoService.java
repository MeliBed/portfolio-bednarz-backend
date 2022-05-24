
package com.proyecto.integrador.service;

import com.proyecto.integrador.model.Encabezado;
import java.util.List;


public interface IEncabezadoService {
    
    public List<Encabezado> verEncabezado(); 
    public void crearEncabezado (Encabezado enc);
    public void modificarEncabezado(Encabezado encabezado);
}
