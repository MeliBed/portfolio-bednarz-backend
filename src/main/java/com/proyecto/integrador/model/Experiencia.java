
package com.proyecto.integrador.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter 
@Entity
public class Experiencia {
    
     @Id
    @GeneratedValue(strategy=GenerationType.AUTO) 
    private Long id;
    
    private String tarea;
    private String institucion;
    private String descripcion;
    private String inicio;
    private String fin;
    private String logo;
    
     public Experiencia() {
      }
    
    public Experiencia (Long id, String nivel, String institucion, String 
            descripcion, String inicio, String fin, String logo) {
        this.id= id;
        this.tarea= tarea;
        this.institucion= institucion;
        this.descripcion= descripcion;
        this.inicio= inicio;
        this.fin= fin;
        this.logo= logo;
      }
            
    
}
