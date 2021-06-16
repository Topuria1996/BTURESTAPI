package com.btu.nodartopuria.restapi.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieDTO {
    public Long id;
    public String title;
    public String country;
    public List<CategoryDTO> categoryDTOList;
}
