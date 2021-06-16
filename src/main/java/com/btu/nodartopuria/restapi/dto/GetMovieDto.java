package com.btu.nodartopuria.restapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetMovieDto {
    public List<MovieDTO> getMoviesList = new ArrayList<>();

}
