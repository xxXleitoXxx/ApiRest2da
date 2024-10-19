package com.example.inicial1.repositories;

import com.example.inicial1.entities.Persona;
import lombok.Value;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/*ESte en nuestro repositorio para persona*/
@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {
    // Aquí puedes agregar métodos personalizados si es necesario


    List<Persona> finbyNombreContainingOrApellidoContaining(String nombre, String apellido);
    //boolean existsByDni(int dni);
    @Query(value ="SELECT p FROM Persona p WHERE p.nombre LIKE %:filtro% OR p.apellido LIKE %:filtro%")
    List<Persona> search(@Param("filtro") String filtro);
    @Query(
            value = "SELECT * FROM personas WHERE persona.nombre LIKE %:filtro% OR persona.apellido LIKE %:filtro%"
            ,nativeQuery= true)
    List<Persona> searchNativo(@Param("filtro") String filtro);



}