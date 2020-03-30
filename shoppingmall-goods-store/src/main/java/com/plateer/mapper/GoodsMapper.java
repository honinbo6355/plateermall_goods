package com.plateer.mapper;

import com.plateer.domain.CartGoods;
import com.plateer.domain.Goods;
import com.plateer.domain.GoodsThumbnail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GoodsMapper {

    String insert(Goods goods);

    Goods select(String goodsCode);

    List<GoodsThumbnail> selectThumbnail(@Param("categoryCode") String categoryCode, @Param("quantity") int quantity);

    List<CartGoods> selectCart(List<String> goodsCodeList);

    void update(String goodsCode, Goods newGoods);

    void delete(String goodsCode);
}
