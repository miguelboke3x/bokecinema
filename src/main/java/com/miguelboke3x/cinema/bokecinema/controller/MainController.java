package com.miguelboke3x.cinema.bokecinema.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.miguelboke3x.cinema.bokecinema.entities.Peliculas;
import com.miguelboke3x.cinema.bokecinema.services.IPeliculasService;


@Controller
public class MainController {

	
		
		@Autowired
		IPeliculasService servicioPeliculas;
		
		@RequestMapping(value="/")
		public ModelAndView mostrarPricipal() {
			List<Peliculas>peliculas = servicioPeliculas.findAll();
			ModelAndView mav = new ModelAndView();
			mav.setViewName("principal");//Indicación del template o plantilla
			mav.addObject("tipos_peliculas",peliculas);//Indicación de los datos
			return mav;
		}
}
