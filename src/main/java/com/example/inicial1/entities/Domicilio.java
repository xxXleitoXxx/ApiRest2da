package com.example.inicial1.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;

@Entity
@Table(name = "Domicilio")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
@Audited
public class Domicilio extends Base{
    /*@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
         //ESta es un serializable que se hereda de Base

   private Long id;
    */
    @Column(name="calle")
    private String calle;

    @Column(name = "numero")
    private int numero;
    @ManyToOne(optional = true)//siempre que quiera crear una persona el domicilio si o si debe tener una localidad
    @JoinColumn(name = "fk_localidad")
    private Localidad localidad;

}
