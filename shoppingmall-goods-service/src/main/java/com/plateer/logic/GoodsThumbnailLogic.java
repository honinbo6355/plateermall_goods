package com.plateer.logic;

import com.plateer.GoodsDao;
import com.plateer.GoodsThumbnailService;
import com.plateer.domain.Goods;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsThumbnailLogic implements GoodsThumbnailService {
    private GoodsDao goodsDao;

    public GoodsThumbnailLogic(GoodsDao goodsDao) {

        goodsDao = goodsDao;
    }
    @Override
    public List<Goods> readGoodsList(String goodsSet) {

        return null;
    }
}
