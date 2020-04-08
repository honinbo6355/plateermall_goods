package com.plateer.domain;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class GoodsThumbnail {

    private String goodsCode;
    private String imgUrl;
    private String seller;
    private String copy;
    private String title;
    private int originalPrice;
    private int dcRate;
    private int saleCnt;
    private int benefitPrice;
}
