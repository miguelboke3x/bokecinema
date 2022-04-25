package com.miguelboke3x.cinema.bokecinema.services;

import java.util.List;



import com.miguelboke3x.cinema.bokecinema.entities.Peliculas;


public interface IPeliculasService {
	public void addPeliculas(Peliculas c);
	public List<Peliculas> findAll();
	public void delete(Integer id);

}