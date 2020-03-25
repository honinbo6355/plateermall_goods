package com.plateer;

import com.plateer.domain.Goods;
import org.springframework.stereotype.Service;

@Service
public interface GoodsService {

    void createGoods(Goods goods);

    Goods readGoods(String goodsCode);

    void updateGoods(Goods goods);

    void deleteGoods(String goodsCode);
}
