package com.miguelboke3x.cinema.bokecinema.entities;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "peliculas")
public class Peliculas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int identificador;
	private String titulo;
	private String sinopsis;
	private Integer anyoestreno;
	private String imagen;
	private String video;
	
	public Peliculas() {
	}

	public Peliculas(int identificador, String titulo, String sinopsis, Integer anyoestreno, String imagen,
			String video) {
		this.identificador = identificador;
		this.titulo = titulo;
		this.sinopsis = sinopsis;
		this.anyoestreno = anyoestreno;
		this.imagen = imagen;
		this.video = video;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public Integer getAnyoestreno() {
		return anyoestreno;
	}

	public void setAnyoestreno(Integer anyoestreno) {
		this.anyoestreno = anyoestreno;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}
	
}
		