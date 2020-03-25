package com.plateer.domain;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Shipping {

    int shippingFee;
    int shippingDays;
    String companyCode;
}
