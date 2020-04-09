package com.plateer.domain;

import lombok.*;

import java.util.List;

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
    private List<CardPromotion> cardPromotions;
}
