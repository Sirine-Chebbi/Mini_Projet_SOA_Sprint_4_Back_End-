package com.example.serie3.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.serie3.entities.Genre;

@RepositoryRestResource(path = "g")
public interface GenreRepository  extends JpaRepository<Genre, Long>  {

}
