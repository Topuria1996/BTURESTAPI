package com.btu.nodartopuria.restapi.service;

import com.btu.nodartopuria.restapi.dto.AddMovieDto;
import com.btu.nodartopuria.restapi.dto.DelMovieDto;
import com.btu.nodartopuria.restapi.dto.InputDtoForGetMovieWithId;
import com.btu.nodartopuria.restapi.dto.MovieDTO;

import java.util.List;

public interface Service {

    void add(AddMovieDto movieDto);

    void delete(DelMovieDto delMovieDto);

    List<MovieDTO> getAllMovies();

    MovieDTO getOneWithId(InputDtoForGetMovieWithId inputDtoForGetMovieWithId);
}
