package com.miguelboke3x.cinema.bokecinema.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.miguelboke3x.cinema.bokecinema.entities.Peliculas;
import com.miguelboke3x.cinema.bokecinema.services.IPeliculasService;


@Controller
public class CinemaController {
	@Autowired
	private IPeliculasService PeliculasService;
	
	@RequestMapping(value = "/crearPeliculas")
	public ModelAndView crearNuevoPeliculas(
			@RequestParam(required = false) String titulo,
			@RequestParam(required = false) String sinopsis,
			@RequestParam(required = false) Integer anyoestreno,
			@RequestParam(required = false) String imagen,
			@RequestParam(required = false) String video) 
	{
		if (titulo != null) {
			Peliculas c = new Peliculas(0, titulo, sinopsis, anyoestreno, imagen,video);
			PeliculasService.addPeliculas(c);
		}
		List<Peliculas> Peliculas = PeliculasService.findAll();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("crear_Peliculas");
		mav.addObject("tipos_peliculas", Peliculas);
		return mav;
	}
	
	@RequestMapping(value = "/borrarPeliculas") 
	public ModelAndView borrarPeliculas( 
			@RequestParam(required=false) Integer id){ 
			PeliculasService.delete(id);
			return new ModelAndView("redirect:./crearPeliculas");
	}
}