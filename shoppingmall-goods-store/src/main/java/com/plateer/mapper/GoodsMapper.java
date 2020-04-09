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

    List<GoodsThumbnail> selectCategory(@Param("categoryCode") String categoryCode, @Param("sort") String sort);

    List<GoodsThumbnail> selectThumbnail(@Param("categoryCode") String categoryCode, @Param("quantity") int quantity);

    List<CartGoods> selectCart(List<String> goodsCodeList);

    List<GoodsThumbnail> selectSearch(@Param("query") String query, @Param("sort") String sort, @Param("categoryCode") String categoryCode, @Param("minPrice") String minPrice, @Param("maxPrice") String maxPrice);

    void update(String goodsCode, Goods newGoods);

    void delete(String goodsCode);

}
