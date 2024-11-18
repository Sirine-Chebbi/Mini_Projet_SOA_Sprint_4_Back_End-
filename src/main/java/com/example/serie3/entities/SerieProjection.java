package com.example.serie3.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomSerie", types = { Serie.class })
public interface SerieProjection {
	public String getNomSerie();
}
