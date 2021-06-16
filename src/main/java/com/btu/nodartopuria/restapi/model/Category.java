package com.btu.nodartopuria.restapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Category {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "title")
    private String title;

    //    @Column(name = "movie_fk")
//    @ManyToMany
//    private List<Movie> movieList;
    public Category(String title) {
        this.title = title;
    }
}
