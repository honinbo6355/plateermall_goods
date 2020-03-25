package com.plateer;

import com.plateer.domain.Goods;

public interface GoodsDao {
    void save(Goods goods);

    Goods find(String goodsCode);

    void update(Goods goods);

    void delete(String goodsCode);
}
