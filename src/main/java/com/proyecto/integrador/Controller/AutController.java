
package com.proyecto.integrador.Controller;

import com.proyecto.integrador.model.Usuarios;
import com.proyecto.integrador.model.dto.UsuarioDto;
import com.proyecto.integrador.service.AutenticacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutController {
    @Autowired
    AutenticacionService service; 
    @PostMapping ("/login")
    public boolean login (@RequestBody UsuarioDto userDto){
        return service.isUserEnabled(userDto);
    }
    
     @PostMapping("/register")
    public void register(@RequestBody Usuarios usuario) throws Exception {
        service.crearUsuario(usuario);
    }
}
