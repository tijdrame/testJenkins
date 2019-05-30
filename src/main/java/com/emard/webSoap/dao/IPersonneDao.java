package com.emard.webSoap.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.emard.webSoap.entity.Personne;

@Repository
public interface IPersonneDao extends  CrudRepository<Personne, Long>{

}
