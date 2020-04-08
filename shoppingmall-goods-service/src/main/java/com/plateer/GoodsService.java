package com.plateer;

import com.plateer.domain.CartGoods;
import com.plateer.domain.Goods;
import com.plateer.domain.GoodsThumbnail;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GoodsService {

    void createGoods(Goods goods);

    Goods readGoods(String goodsCode);

    List<GoodsThumbnail> readCategoryGoods(String categoryCode, String sort);

    List<GoodsThumbnail> readThumbnailGoods(String category, int quantity);

    List<CartGoods> readCartGoods(List<String> goodsCodeList);

    List<GoodsThumbnail> readSearchGoods(String query, String sort);

    void updateGoods(String goodsCode, Goods newGoods);

    void deleteGoods(String goodsCode);
}
