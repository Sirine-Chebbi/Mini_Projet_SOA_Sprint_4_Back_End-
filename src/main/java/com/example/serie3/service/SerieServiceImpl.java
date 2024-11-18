package com.example.serie3.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.serie3.entities.Genre;
import com.example.serie3.entities.Serie;
import com.example.serie3.repos.SerieRepository;

@Service
public class SerieServiceImpl implements SerieService{

	@Autowired
	SerieRepository serieRepository;
	
	@Override
	public Serie saveSerie(Serie p) {
		return serieRepository.save(p);
		
	}

	@Override
	public Serie updateSerie(Serie p) {
		return serieRepository.save(p);
		
	}

	@Override
	public void deleteSerie(Serie p) {
		serieRepository.delete(p);

	}

   @Override
	public void deleteSerieById(Long id) {
	   serieRepository.deleteById(id);
		
	}

	@Override
	public Serie getSerie(Long id) {
		return  serieRepository.findById(id).get();
	
	}

	@Override
	public List<Serie> getAllSeries() {
		return serieRepository.findAll();
	}
	
    @Override
	public List<Serie> findByNomSerie(String nom) {
		return serieRepository.findByNomSerie(nom);
	}

	@Override
	public List<Serie> findByNomSerieContains(String nom) {
		return serieRepository.findByNomSerieContains(nom);
	}

	@Override
	public List<Serie> findByNomNb(String nom, Double nbS) {
		return serieRepository.findByNomNbSaison(nom, nbS);
	}
	
	@Override
	public List<Serie> findByGenre(Genre categorie) {
		return serieRepository.findByGenre(categorie);
	}

	@Override
	public List<Serie> findByGenreIdG(Long id) {
		return serieRepository.findByGenreIdG(id);
	}

	@Override
	public List<Serie> findByOrderByNomSerieAsc() {
		return serieRepository.findByOrderByNomSerieAsc();
	}

	@Override
	public List<Serie> trierSeriesNomsNb() {
		return serieRepository.trierSeriesNomsNb();
	}



	
	}
