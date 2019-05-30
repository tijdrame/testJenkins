package com.emard.webSoap.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.emard.webSoap.dao.IPersonneDao;
import com.emard.webSoap.entity.Personne;
@Service
public class PersonneService implements IPersonneService{

	public static  IPersonneDao personneDao;
	public PersonneService(IPersonneDao iPersonneDao) {
		personneDao = iPersonneDao;
	}
	@Override
	public Personne addPersonne(Personne personne) {
		return personneDao.save(personne);
		 
	}

	@Override
	public Personne modifyPersonne(Personne personne) {
		return personneDao.save(personne);
	}

	@Override
	public Iterable<Personne> listPersonnes() {
		return personneDao.findAll();
	}

	@Override
	public List<Personne> searchByName(String name) {
		// TODO Auto-generated method stub
		return null;
				//personneDao.findByName(name);
	}

	@Override
	public void deletePersonne(Long id) {
		// TODO Auto-generated method stub
		personneDao.deleteById(id);
	}

}
