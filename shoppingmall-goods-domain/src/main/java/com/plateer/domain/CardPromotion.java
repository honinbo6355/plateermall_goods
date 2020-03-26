package com.plateer.domain;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CardPromotion {

    String promotionId;
    String card;
    int maximum;
    int minimum;
    int percentage;
}
