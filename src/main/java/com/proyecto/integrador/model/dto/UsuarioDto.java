
package com.proyecto.integrador.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UsuarioDto {
    private String email;
    private String password;
    
    public UsuarioDto(){}

    public UsuarioDto(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return "UsuarioDto{" + "email=" + email + ", password=" + password + '}';
    }
    
    
    
}
