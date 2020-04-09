package com.plateer;

import com.plateer.domain.CartGoods;
import com.plateer.domain.Goods;
import com.plateer.domain.GoodsThumbnail;
import com.plateer.domain.dto.QueryDto;

import java.util.List;

public interface GoodsDao {
    void save(Goods goods);

    Goods find(String goodsCode);

    List<GoodsThumbnail> findThumbnail(String categoryCode, int quantity);

    List<CartGoods> findCart(List<String> goodsCodeList);

    List<GoodsThumbnail> findPageGoods(QueryDto queryDto);

    void update(String goodsCode, Goods newGoods);

    void delete(String goodsCode);
}
