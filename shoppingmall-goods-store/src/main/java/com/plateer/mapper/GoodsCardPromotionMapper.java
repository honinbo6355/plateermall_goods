package com.plateer.mapper;

import com.plateer.domain.CardPromotion;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodsCardPromotionMapper {
    String insert(String promotionId, String goodsCode);

    List<CardPromotion> select(String goodsCode);

    void update(String promotionId, String goodsCode, String newPromotionId, String newGoodsCode);

    void delete(String promotionId, String goodsCode);
}
