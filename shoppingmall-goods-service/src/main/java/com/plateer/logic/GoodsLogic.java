package com.plateer.logic;

import com.plateer.GoodsService;
import com.plateer.domain.CartGoods;
import com.plateer.domain.Goods;
import com.plateer.domain.GoodsThumbnail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsLogic implements GoodsService {
    @Autowired
    private GoodsDaoImpl goodsDao;


    @Override
    public void createGoods(Goods goods) {

        //goodsDao.save(goods);
    }

    @Override
    public Goods readGoods(String goodsCode) {
        //
        return goodsDao.find(goodsCode);
    }

    @Override
    public List<GoodsThumbnail> readThumbnailGoods(String category, int quantity) {

        return goodsDao.findThumbnail(category, quantity);
    }

    @Override
    public List<CartGoods> readCartGoods(List<String> goodsCodeList) {

        return goodsDao.findCart(goodsCodeList);
    }

    @Override
    public void updateGoods(Goods goods) {

        //goodsDao.update(goods);
    }

    @Override
    public void deleteGoods(String goodsCode) {

        //goodsDao.delete(goodsCode);
    }
}
