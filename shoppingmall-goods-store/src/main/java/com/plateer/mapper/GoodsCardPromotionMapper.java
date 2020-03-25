package com.plateer.mapper;

import com.plateer.domain.CardPromotion;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodsCardPromotionMapper {

    List<CardPromotion> select(String goodsCode);

}
