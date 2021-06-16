package com.btu.nodartopuria.restapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DelMovieDto {
    public Long id;
    public List<CategoryDTO> categoryDTOList;
}
