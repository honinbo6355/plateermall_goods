package com.plateer.domain;

import java.util.List;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Goods {

    private String uuid;
    private String goodsCode;
    private String imgUrl;
    private String modelNo;
    private String seller;
    private String copy;
    private String title;
    private int originalPrice;
    private int shippingFee;
    private int dcRate;
    private int saleCnt;
    private int shippingDays;
    private String notice;
    private String goodsDetail;
    private List<InfoTableRow> infoTable;
    private List<Option> options;
    private List<CardPromotion> cardPromotions;
}
