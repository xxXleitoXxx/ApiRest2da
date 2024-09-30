package com.example.inicial1.services;

import java.util.List;

public interface BaseService<E>{

    public List<E> findALL() throws Exception;
    public E findByID(Long id) throws Exception;
    public E save(E entity) throws Exception;
    public E update(Long id,E entity) throws Exception;
    public Boolean delete(Long id) throws Exception;

}
