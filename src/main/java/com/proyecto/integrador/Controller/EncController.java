
package com.proyecto.integrador.Controller;

import com.proyecto.integrador.model.Encabezado;
import com.proyecto.integrador.service.IEncabezadoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EncController {
    
     @Autowired
    private IEncabezadoService encServ;
 
    
    @PostMapping ("/new/encabezado")
    public void crearEncabezado(@RequestBody Encabezado enc){
       encServ.crearEncabezado(enc);
    }
    
    @GetMapping ("/ver/encabezado")
    @ResponseBody
    public List<Encabezado> verEncabezado() {
        return encServ.verEncabezado();
    }
    
     
   @PutMapping ("/update/encabezado")
   public void modificarEncabezado(@RequestBody Encabezado enc){
   encServ.modificarEncabezado(enc);   
    System.out.println (enc);
   }
    
}
