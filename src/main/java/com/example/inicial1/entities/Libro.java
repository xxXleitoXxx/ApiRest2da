package com.example.inicial1.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import java.util.List;

@Entity
@Table(name = "Libro")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Audited

public class Libro extends Base{
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "fecha")
    private int fecha;
    @Column(name = "genero")
    private String genero;
    @Column(name = "paginas")
    private int paginas;

    @OneToMany(cascade = CascadeType.REFRESH)//Cuando se modifique un autor, se va a actualizar en libro
    private List<Autor> autores;
}
