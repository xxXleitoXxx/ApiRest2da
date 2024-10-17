package com.example.inicial1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import com.example.inicial1.entities.Base;
import java.io.Serializable;

@NoRepositoryBean //no permite que se creen instancias
public interface BaseRepository<E extends Base , ID extends Serializable> extends JpaRepository<E,ID> {

}
