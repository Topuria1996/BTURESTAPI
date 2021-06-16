package com.btu.nodartopuria.restapi;

import com.btu.nodartopuria.restapi.model.Movie;
import com.btu.nodartopuria.restapi.repository.MovieRepository;
import com.btu.nodartopuria.restapi.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestapiApplication.class, args);
    }

}
