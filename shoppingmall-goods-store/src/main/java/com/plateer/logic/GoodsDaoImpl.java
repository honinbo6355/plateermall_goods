package com.plateer.logic;

import com.plateer.GoodsDao;
import com.plateer.domain.CardPromotion;
import com.plateer.domain.Goods;
import com.plateer.domain.InfoTableRow;
import com.plateer.domain.Option;
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
    private GoodsCardPromotionMapper goodsCardPromotionMapperMapper;
    @Autowired
    private GoodsInfoMapper goodsInfoMapper;
    @Autowired
    private GoodsOptionMapper goodsOptionMapper;


    @Override
    public void save(Goods goods) {

        this.goodsMapper.insert(goods);
    }

    @Override
    public Goods find(String goodsCode) {
        Goods foundedGoods;
        List<CardPromotion> cardPromotion;
        List<InfoTableRow> infoTableRow;
        List<Option> option;

        cardPromotion = this.goodsCardPromotionMapperMapper.select(goodsCode);
        infoTableRow = this.goodsInfoMapper.select(goodsCode);
        option = this.goodsOptionMapper.select(goodsCode);
        foundedGoods = this.goodsMapper.select(goodsCode);

        foundedGoods.setCardPromotions(cardPromotion);
        foundedGoods.setInfoTable(infoTableRow);
        foundedGoods.setOptions(option);

        return foundedGoods;
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
