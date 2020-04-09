package com.plateer.logic;

import com.plateer.GoodsDao;
import com.plateer.domain.*;
import com.plateer.domain.dto.QueryDto;
import com.plateer.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
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
    @Autowired
    private CategoryMapper categoryMapper;

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
        List<Category> categories = null;

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
        List<CartGoods> foundedGoodsList = this.goodsMapper.selectCart(goodsCodeList);

        for (CartGoods goods : foundedGoodsList) {
            List<CardPromotion> cardPromotion = null;
            try {
                cardPromotion = this.goodsCardPromotionMapper.select(goods.getGoodsCode());
            } catch (Exception e) {
                e.printStackTrace();
            }

            goods.setCardPromotions(cardPromotion);
        }

        return foundedGoodsList;
    }

    @Override
    public List<GoodsThumbnail> findPageGoods(QueryDto queryDto) {

        return this.goodsMapper.selectPageGoods(queryDto.getQuery(), queryDto.getSort(), queryDto.getCategoryCode(), queryDto.getMinPrice(), queryDto.getMaxPrice());
    }

    @Override
    public void update(String goodsCode, Goods newGoods) {

        this.goodsMapper.update(goodsCode, newGoods);
    }

    @Override
    public void delete(String goodsCode) {

        this.goodsMapper.delete(goodsCode);
    }

}
