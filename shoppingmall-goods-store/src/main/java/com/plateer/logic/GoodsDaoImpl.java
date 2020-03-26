package com.plateer.logic;

import com.plateer.GoodsDao;
import com.plateer.domain.*;
import com.plateer.mapper.GoodsMapper;
import com.plateer.mapper.GoodsCardPromotionMapper;
import com.plateer.mapper.GoodsInfoMapper;
import com.plateer.mapper.GoodsOptionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GoodsDaoImpl implements GoodsDao {
    //
    @Autowired
    private GoodsMapper goodsMapper;
    @Autowired
    private GoodsInfoMapper goodsInfoMapper;
    @Autowired
    private GoodsOptionMapper goodsOptionMapper;
    @Autowired
    private GoodsCardPromotionMapper goodsCardPromotionMapper;


    @Override
    public void save(Goods goods) {

        this.goodsMapper.insert(goods);
    }

    @Override
    public Goods find(String goodsCode) {
        Goods foundedGoods = null;
        List<CardPromotion> cardPromotion = null;
        List<InfoTableRow> infoTableRow = null;
        List<Option> option = null;

        foundedGoods = this.goodsMapper.select(goodsCode);

        try {
            infoTableRow = this.goodsInfoMapper.select(goodsCode);
        } catch (Exception e) {
            e.printStackTrace();
        }

        foundedGoods.setInfoTable(infoTableRow);

        try {
            option = this.goodsOptionMapper.select(goodsCode);
        } catch (Exception e) {
            e.printStackTrace();
        }

        foundedGoods.setOptions(option);

        try {
            cardPromotion = this.goodsCardPromotionMapper.select(goodsCode);
        } catch (Exception e) {
            e.printStackTrace();
        }

        foundedGoods.setCardPromotions(cardPromotion);

        return foundedGoods;
    }

    @Override
    public List<GoodsThumbnail> findThumbnail(String categoryCode, int quantity) {

        return this.goodsMapper.selectThumbnail(categoryCode, quantity);
    }

    @Override
    public List<CartGoods> findCart(List<String> goodsCodeList) {

        return this.goodsMapper.selectCart(goodsCodeList);
    }

    @Override
    public void update(Goods goods) {

        this.goodsMapper.update(goods);
    }

    @Override
    public void delete(String goodsCode) {

        this.goodsMapper.delete(goodsCode);
    }

}
