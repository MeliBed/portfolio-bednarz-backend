
package com.proyecto.integrador.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter 
@Entity
public class Educacion {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO) 
    private Long id;
    
    private String nivel;
    private String institucion;
    private String descripcion;
    private String inicio;
    private String fin;
    private String logo;
    
     public Educacion() {
      }
    
    public Educacion(Long id, String nivel, String institucion, String 
            descripcion, String inicio, String fin, String logo) {
        this.id= id;
        this.nivel= nivel;
        this.institucion= institucion;
        this.descripcion= descripcion;
        this.inicio= inicio;
        this.fin= fin;
        this.logo= logo;
      }
            
    
}