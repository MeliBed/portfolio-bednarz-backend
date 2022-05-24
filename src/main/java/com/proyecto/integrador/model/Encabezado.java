
package com.proyecto.integrador.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter 
@Entity
public class Encabezado {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO) 
    private Long id;
    
    private String titulo;
    private String nombre;
    private String descripcion;
    private String ubicacion;
    private String contacto;
    private String linkedin;
    private String github;
    private String foto;
    
     public Encabezado() {
      }
    
    public Encabezado(Long id, String nombre, String descripcion, String 
            ubicacion, String contacto, String linkedin, String github, String foto) {
        this.id= id;
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.ubicacion=ubicacion;
        this.contacto=contacto;
        this.linkedin=linkedin;
        this.github=github;
        this.foto=foto;
      }
    
}
