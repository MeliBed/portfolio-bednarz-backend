
package com.proyecto.integrador.Controller;

import com.proyecto.integrador.model.Proyecto;
import com.proyecto.integrador.service.IProyectoService;
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
public class ProController {
    
    @Autowired
    private IProyectoService proServ;
 
    
    @PostMapping ("/new/proyecto")
    public void agregarProyecto (@RequestBody Proyecto pro){
       proServ.crearProyecto(pro);
    }
    
    @GetMapping ("/ver/proyecto")
    @ResponseBody
    public List<Proyecto> verProyecto() {
        return proServ.verProyecto();
    }
    
    @DeleteMapping ("/delete/proyecto/{id}")
    public void borrarProyecto(@PathVariable Long id){
        proServ.borrarProyecto(id);
        
    }
    
    @PutMapping("/update/proyecto")
    public void modificarProyecto(@RequestBody Proyecto pro) {
        proServ.modificarProyecto(pro);
    }
    
    
}
