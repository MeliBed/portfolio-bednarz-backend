
package com.proyecto.integrador.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter 
@Entity
public class Skill {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO) 
    private Long id;
    
    private String acreditador;
    private String skill;
    private int nivel;
    private String denominacion;
    
     public Skill() {
      }
    
    public Skill(Long id, String acreditador, String 
            skill, int nivel, String denominacion) {
    this.id= id;
    this.acreditador=acreditador;
    this.skill=skill;
    this.nivel=nivel;
    this.denominacion=denominacion;
      }
}
