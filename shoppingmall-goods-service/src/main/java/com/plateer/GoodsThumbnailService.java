package com.plateer;

import com.plateer.domain.Goods;

import java.util.List;

public interface GoodsThumbnailService {
    List<Goods> readGoodsList(String goodsSet);
}
