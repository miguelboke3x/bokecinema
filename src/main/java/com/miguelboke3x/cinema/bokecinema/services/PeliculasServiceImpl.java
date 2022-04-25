package com.miguelboke3x.cinema.bokecinema.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.miguelboke3x.cinema.bokecinema.entities.Peliculas;
import com.miguelboke3x.cinema.bokecinema.repository.IPeliculasRepository;



@Service
public class PeliculasServiceImpl implements IPeliculasService {
	@Autowired
	IPeliculasRepository repo;

	@Override
	public void addPeliculas(Peliculas c) {
		repo.save(c);
	}

	@Override
	public List<Peliculas> findAll() {
		return repo.findAll();
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}
	

}