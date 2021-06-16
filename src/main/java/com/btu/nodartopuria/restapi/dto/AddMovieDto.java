package com.btu.nodartopuria.restapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddMovieDto {
    public String title;
    public String country;
    public List<CategoryDTO> categoryDTOS;
}
