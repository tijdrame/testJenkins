package com.emard.webSoap.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.emard.webSoap.entity.Personne;

public interface IPersonneService {

	public Personne addPersonne(Personne personne);
	public Personne modifyPersonne(Personne personne);
	public Iterable<Personne> listPersonnes();
	public List<Personne> searchByName(String name);
	public void deletePersonne(Long id);
}
