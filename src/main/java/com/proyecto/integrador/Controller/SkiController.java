
package com.proyecto.integrador.Controller;

import com.proyecto.integrador.model.Skill;
import com.proyecto.integrador.service.ISkillService;
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
public class SkiController {
    
      @Autowired
    private ISkillService skiServ;
 
    
    @PostMapping ("/new/skill")
    public void agregarSkill (@RequestBody Skill ski){
       skiServ.crearSkill(ski);
    }
    
    @GetMapping ("/ver/skill")
    @ResponseBody
    public List<Skill> verSkill() {
        return skiServ.verSkill();
    }
    
    @DeleteMapping ("/delete/skill/{id}")
    public void borrarSkill (@PathVariable Long id){
        skiServ.borrarSkill(id);
        
    }
    
      @PutMapping("/update/skill")
    public void modificarSkill(@RequestBody Skill ski) {
        skiServ.modificarSkill(ski);
    }
    
}
