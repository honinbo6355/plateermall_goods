package com.plateer.logic;

import com.plateer.GoodsDao;
import com.plateer.GoodsService;
import com.plateer.domain.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public void updateGoods(Goods goods) {

        //goodsDao.update(goods);
    }

    @Override
    public void deleteGoods(String goodsCode) {

        //goodsDao.delete(goodsCode);
    }
}
