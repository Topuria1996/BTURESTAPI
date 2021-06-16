package com.btu.nodartopuria.restapi.repository;

import com.btu.nodartopuria.restapi.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie,Long> {

}
