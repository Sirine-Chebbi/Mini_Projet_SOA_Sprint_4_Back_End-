package com.example.serie3;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.serie3.entities.Serie;
import com.example.serie3.repos.SerieRepository;

@SpringBootTest
class Serie3ApplicationTests {

	@Autowired
	private SerieRepository serieRepository;
	
	@Test
	public void testCreateSerie() {
	Serie sers = new Serie("Love next door",1.0,new Date());
	serieRepository.save(sers);
	}
	
	@Test
	public void testFindSerie()
	{
		Serie s = serieRepository.findById(1L).get();
		System.out.println(s);
	}
	
	@Test
	public void testUpdateSerie()
	{
		Serie s = serieRepository.findById(1L).get();
		s.setNbSerie(2.0);
		serieRepository.save(s);
	}
	
	@Test
	public void testDeleteSerie()
	{
		serieRepository.deleteById(1L);;
	}

	@Test
	public void testListerTousSeries()
	{
		List<Serie> sers = serieRepository.findAll();
		for (Serie s : sers)
		{
			System.out.println(s);
		}
	}
	
	 @Test
	 public void testFindByNomSerie()
	 {
		 List<Serie> sers = serieRepository.findByNomSerie("Love next door");
		 for (Serie s : sers)
		 {
			 System.out.println(s);
		 }
	 }
	 
	 @Test
	 public void testFindByNomSerieContains ()
	 {
		 List<Serie> sers=serieRepository.findByNomSerieContains("Love");
		 for (Serie s : sers)
		 {
			 System.out.println(s);
		 } 
	}
	 
	 @Test
		public void testfindByNomNbSaison() {
			List<Serie> series = serieRepository.findByNomNbSaison("Love next door",1.0);
			for (Serie s : series)
				System.out.println(s);
		}
				
		@Test
		public void findByGenreIdG()
		{
			List<Serie> series = serieRepository.findByGenreIdG(2L);
			for (Serie s : series)
			{
				System.out.println(s);
			}
		 }
		
		@Test
		public void testfindByOrderByNomSerieDesc()
		{
			List<Serie> series =serieRepository.findByOrderByNomSerieAsc();
			for (Serie s : series)
			{
				System.out.println(s);
			}
		}
		
		@Test
		public void testTrierSeriesNomsNb()
		{
			List<Serie> series = serieRepository.trierSeriesNomsNb();
			for (Serie s : series)
			{
				System.out.println(s);
			}
		}


}
