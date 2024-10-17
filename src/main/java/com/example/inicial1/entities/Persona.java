package com.example.inicial1.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.envers.Audited;
import org.hibernate.envers.NotAudited;
import org.w3c.dom.stylesheets.LinkStyle;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
@Table(name="Persona")
@Audited
public class Persona extends Base {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
 //   private Long id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;

    @OneToOne(cascade = CascadeType.ALL)//Se puede hacer la persistencia,actualizacion y eliminacion atravez de esta clase
    @JoinColumn(name = "fk_domicilio")
    private Domicilio domicilio;
    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)//cuando se elimina una persona se eliminan todos los libros que le perteneces
    @JoinTable(
            name="persona_libro",
            joinColumns = @JoinColumn(name = "persona_id"),
            inverseJoinColumns = @JoinColumn(name ="libro_id")
    )
    private List<Libro> libros= new ArrayList<Libro>();
}

