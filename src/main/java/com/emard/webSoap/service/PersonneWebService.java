package com.emard.webSoap.service;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.emard.webSoap.entity.Personne;

@RestController
@RequestMapping("/api")
public class PersonneWebService {

	private static PersonneService personneServ;
	
	public PersonneWebService(PersonneService personneServ) {
		this.personneServ = personneServ;
	}
	@GetMapping(path = "/personnes", produces = MediaType.APPLICATION_JSON_VALUE)
	public Iterable<Personne> allPers(){
		return personneServ.listPersonnes();
	}
	@PostMapping("/personnes")
	public Personne addPersonne(@RequestBody() Personne personne) {
		System.out.println("pers==="+personne);
		return this.personneServ.addPersonne(personne);
	}
}
