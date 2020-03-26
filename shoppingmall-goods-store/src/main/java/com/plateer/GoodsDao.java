package com.plateer;

import com.plateer.domain.CartGoods;
import com.plateer.domain.Goods;
import com.plateer.domain.GoodsThumbnail;

import java.util.List;

public interface GoodsDao {
    void save(Goods goods);

    Goods find(String goodsCode);

    List<GoodsThumbnail> findThumbnail(String category, int quantity);

    List<CartGoods> findCart(List<String> goodsCodeList);

    void update(Goods goods);

    void delete(String goodsCode);
}
