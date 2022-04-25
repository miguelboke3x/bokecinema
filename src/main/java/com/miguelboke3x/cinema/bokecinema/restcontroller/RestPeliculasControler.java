package com.miguelboke3x.cinema.bokecinema.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miguelboke3x.cinema.bokecinema.entities.Peliculas;
import com.miguelboke3x.cinema.bokecinema.services.IPeliculasService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class RestPeliculasControler {
	@Autowired
	IPeliculasService ips;

	@GetMapping(path = "/peliculas", produces = { MediaType.APPLICATION_JSON_VALUE })
	List<Peliculas> getPeliculas() {
		System.err.println("******************************** PELICULAS ****");
		return ips.findAll();
	}

}
