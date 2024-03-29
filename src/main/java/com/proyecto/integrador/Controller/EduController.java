
package com.proyecto.integrador.Controller;

import com.proyecto.integrador.model.Educacion;
import com.proyecto.integrador.service.IEducacionService;
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
public class EduController {
       @Autowired
    private IEducacionService eduServ;
 
    
    @PostMapping ("/new/educacion")
    public void agregarNuevaEducacion (@RequestBody Educacion edu){
       eduServ.crearEducacion(edu);
    }
    
    @GetMapping ("/ver/educacion")
    @ResponseBody
    public List<Educacion> verEducacion() {
        return eduServ.verEducacion();
    }
    
    @DeleteMapping ("/delete/educacion/{id}")
    public void borrarEducacion (@PathVariable Long id){
        eduServ.borrarEducacion(id);
        
    }
    
     @PutMapping("/update/educacion")
    public void modificarEducacion(@RequestBody Educacion edu) {
        System.out.println(edu);
        eduServ.modificarEducacion(edu);
    }
    
    
}
