package com.example.inicial1.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

@Entity
@Table(name="Localidad")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Audited

public class Localidad extends Base {

    //private long id;
    @Column(name = "denominacion")
    private String denominacion;


}
