package com.plateer.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QueryDto {
    private String query;
    private String sort;
    private String minPrice;
    private String maxPrice;
    private String categoryCode;
}
