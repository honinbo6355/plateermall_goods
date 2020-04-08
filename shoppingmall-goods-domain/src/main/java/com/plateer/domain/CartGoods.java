package com.plateer.domain;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CartGoods {

    private String imgUrl;
    private String goodsCode;
    private String seller;
    private String title;
    private int originalPrice;
    private int shippingFee;
    private int dcRate;
    private int benefitPrice;
}
