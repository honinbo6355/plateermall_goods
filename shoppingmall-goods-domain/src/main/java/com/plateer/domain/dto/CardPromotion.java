package com.plateer.domain.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CardPromotion {
    String card;
    int maximum;
    int minimum;
    int percentage;
}
