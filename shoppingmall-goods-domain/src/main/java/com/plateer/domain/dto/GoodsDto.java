package com.plateer.domain.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class GoodsDto {

    private String imgUrl;
    private String goodsCode;
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
