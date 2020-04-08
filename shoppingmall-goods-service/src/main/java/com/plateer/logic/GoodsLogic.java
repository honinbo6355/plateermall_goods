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

        goodsDao.save(goods);
    }

    @Override
    public Goods readGoods(String goodsCode) {
        //
        return goodsDao.find(goodsCode);
    }

    @Override
    public List<GoodsThumbnail> readCategoryGoods(String categoryCode, String sort) {

        return goodsDao.findCategory(categoryCode, sort);
    }

    @Override
    public List<GoodsThumbnail> readThumbnailGoods(String categoryCode, int quantity) {

        return goodsDao.findThumbnail(categoryCode, quantity);
    }

    @Override
    public List<CartGoods> readCartGoods(List<String> goodsCodeList) {

        return goodsDao.findCart(goodsCodeList);
    }

    @Override
    public List<GoodsThumbnail> readSearchGoods(String query, String sort) {

        return goodsDao.findSearchResult(query, sort);
    }

    @Override
    public void updateGoods(String goodsCode, Goods newGoods) {

        goodsDao.update(goodsCode, newGoods);
    }

    @Override
    public void deleteGoods(String goodsCode) {

        goodsDao.delete(goodsCode);
    }
}
