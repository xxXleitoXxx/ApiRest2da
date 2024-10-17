package com.example.inicial1.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;
@MappedSuperclass
@Getter
@Setter
@Audited
@NoArgsConstructor
@AllArgsConstructor
//comprobar que base esté mapeado como superclase
public class Base implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    



}
