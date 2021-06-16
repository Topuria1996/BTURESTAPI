package com.btu.nodartopuria.restapi.controller;

import com.btu.nodartopuria.restapi.dto.AddMovieDto;
import com.btu.nodartopuria.restapi.dto.DelMovieDto;
import com.btu.nodartopuria.restapi.dto.InputDtoForGetMovieWithId;
import com.btu.nodartopuria.restapi.dto.MovieDTO;
import com.btu.nodartopuria.restapi.service.Service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/movies")
public class MovieController {

    @Autowired
    public Service service;


    @PostMapping("/getMovie")
    public MovieDTO getMovie(InputDtoForGetMovieWithId inputDtoForGetMovieWithId) {
        return service.getOneWithId(inputDtoForGetMovieWithId);
    }

    @GetMapping("/getAllMovies")
    public List<MovieDTO> getMovies() {
        return service.getAllMovies();
    }

    @PostMapping("/addMovie")
    public void addMovie(AddMovieDto addMovieDto) {
        service.add(addMovieDto);
    }

    @DeleteMapping
    public void delMovie(DelMovieDto delMovieDto) {
        service.delete(delMovieDto);
    }


}
