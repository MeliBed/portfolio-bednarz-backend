
package com.proyecto.integrador.service;

import com.proyecto.integrador.model.Usuarios;
import com.proyecto.integrador.model.dto.UsuarioDto;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proyecto.integrador.repository.AutenticacionRepository;
import org.springframework.security.crypto.password.PasswordEncoder;


@Service

public class AutenticacionService {
    
    @Autowired
    AutenticacionRepository repository;
    
    @Autowired
    PasswordEncoder passwordEncoder;
    
  public boolean isUserEnabled(UsuarioDto userDto) {
        boolean isUserEnabled = false;
        List<Usuarios> usuarios = repository.findByEmailAndIsEnabledTrue(userDto.getEmail());
        if (!usuarios.isEmpty()) {
            Usuarios usuario = usuarios.get(0);
            if (passwordEncoder.matches(userDto.getPassword(), usuario.getPassword()))
                isUserEnabled = true;
        }
        return isUserEnabled;
    }
    
    public void crearUsuario(Usuarios usuario) throws Exception {
        List<Usuarios> usuarios = repository.findByEmailAndIsEnabledTrue(usuario.getEmail());
        if (!usuarios.isEmpty()) {
            throw new Exception("El email ya se encuentra registrado");
        } else {
            usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
            usuario.setIsEnabled(true);
            repository.save(usuario);
        }
    }
    
}
