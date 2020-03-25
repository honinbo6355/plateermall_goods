package com.plateer.controller;

import com.plateer.domain.CardPromotion;
import com.plateer.domain.Goods;

import com.plateer.domain.InfoTableRow;
import com.plateer.domain.Option;
import com.plateer.logic.GoodsLogic;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@CrossOrigin(allowCredentials = "true", origins = {"*"}, methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT},
        allowedHeaders = {"Content-Type", "X-Requested-With", "accept", "Origin", "Access-Control-Request-Method",
                "Access-Control-Request-'head'ers", "Access-Control-Allow-Origin", "Set-Cookie"},
        exposedHeaders = {"Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"}, maxAge = 3000)
@RestController
@RequestMapping("/api/goods")
public class GoodsController {
    //
    @Autowired
    private GoodsLogic goodsLogic;

    @GetMapping("/{goodsCode}")
    public Goods getGoods(@PathVariable String goodsCode) {
        return goodsLogic.readGoods(goodsCode);
    }

    @GetMapping("/goodslist/{goodsSet}")
    public List<Goods> getGoodsList(@PathVariable String goodsSet) {
        List<Goods> goodsList = new ArrayList<>();

        Goods goods1 = new Goods(
                "https://image.ellotte.com/ellt.static.lotteeps.com/goods/img/48/37/97/03/12/1203973748_1.jpg/chg/resize/714x714/extent/714x714"
                , "1203973748"
                , "921733-100"
                , "나이키"
                , "새 신을 신고 뛰어보자 폴짝"
                , "W 에어 맥스 97 트리플 화이트 921733-100"
                , 199000
                , 3000
                , 10
                , 53
                , 3
                , "판매자 공지"
                , "상품 상세 설명"
                , null
                , null
                , null
        );
        List<InfoTableRow> table = new ArrayList<>();
        table.add(new InfoTableRow("0", "Size", "1 x 2"));
        List<Option> options = new ArrayList<>();
        options.add(new Option("220", "220"));
        options.add(new Option("230", "230"));
        options.add(new Option("240", "240"));
        List<CardPromotion> cards = new ArrayList<>();
        cards.add(new CardPromotion("하나카드", 70000, 100000, 10));

        goods1.setInfoTable(table);
        goods1.setOptions(options);
        goods1.setCardPromotions(cards);

        Goods goods2 = new Goods(
                "https://image.ellotte.com/ellt.static.lotteeps.com/goods/img/00/77/91/03/12/1203917700_1.jpg/chg/resize/714x714/extent/714x714"
                , "1203917700"
                , "SO3OP04A"
                , "SOUP"
                , "플라워 패턴이 예쁜 원피스"
                , "넥리본 밑단 프릴 플라워 원피스(SO3OP04)"
                , 22000
                , 3000
                , 15
                , 24
                , 3
                , "판매자 공지"
                , "상품 상세 설명"
                , null
                , null
                , null
        );
        List<InfoTableRow> table2 = new ArrayList<>();
        table2.add(new InfoTableRow("0", "제품소재", "겉감 : 폴리에스터100%"));
        List<Option> options2 = new ArrayList<>();
        options2.add(new Option("아이보리", "아이보리"));
        options2.add(new Option("그레이", "그레이"));
        List<CardPromotion> cards2 = new ArrayList<>();
        cards2.add(new CardPromotion("KB국민카드", 70000, 100000, 10));

        goods2.setInfoTable(table2);
        goods2.setOptions(options2);
        goods2.setCardPromotions(cards2);


        goodsList.add(goods1);
        goodsList.add(goods2);
        goodsList.add(goods1);
        goodsList.add(goods2);
        goodsList.add(goods1);
        goodsList.add(goods2);

        return goodsList;
    }

    @PostMapping("/goodslist/cart/")
    public List<Goods> getCartGoodsList(@RequestBody List<String> goodsCodeList) {
        System.out.println(goodsCodeList);

//        select * from goods where goodscode in (goodsCode1, goodsCode2, goodsCode3);

        List<Goods> goodsList = new ArrayList<>();

        Goods goods1 = new Goods(
                "https://image.ellotte.com/ellt.static.lotteeps.com/goods/img/48/37/97/03/12/1203973748_1.jpg/chg/resize/714x714/extent/714x714"
                , "1203973748"
                , "921733-100"
                , "나이키"
                , "새 신을 신고 뛰어보자 폴짝"
                , "W 에어 맥스 97 트리플 화이트 921733-100"
                , 199000
                , 3000
                , 10
                , 53
                , 3
                , "판매자 공지"
                , "상품 상세 설명"
                , null
                , null
                , null
        );
        List<InfoTableRow> table = new ArrayList<>();
        table.add(new InfoTableRow("0", "Size", "1 x 2"));
        List<Option> options = new ArrayList<>();
        options.add(new Option("220", "220"));
        options.add(new Option("230", "230"));
        options.add(new Option("240", "240"));
        List<CardPromotion> cards = new ArrayList<>();
        cards.add(new CardPromotion("하나카드", 70000, 100000, 10));

        goods1.setInfoTable(table);
        goods1.setOptions(options);
        goods1.setCardPromotions(cards);

        Goods goods2 = new Goods(
                "https://image.ellotte.com/ellt.static.lotteeps.com/goods/img/00/77/91/03/12/1203917700_1.jpg/chg/resize/714x714/extent/714x714"
                , "1203917700"
                , "SO3OP04A"
                , "SOUP"
                , "플라워 패턴이 예쁜 원피스"
                , "넥리본 밑단 프릴 플라워 원피스(SO3OP04)"
                , 22000
                , 3000
                , 15
                , 24
                , 3
                , "판매자 공지"
                , "상품 상세 설명"
                , null
                , null
                , null
        );
        List<InfoTableRow> table2 = new ArrayList<>();
        table2.add(new InfoTableRow("0", "제품소재", "겉감 : 폴리에스터100%"));
        List<Option> options2 = new ArrayList<>();
        options2.add(new Option("아이보리", "아이보리"));
        options2.add(new Option("그레이", "그레이"));
        List<CardPromotion> cards2 = new ArrayList<>();
        cards2.add(new CardPromotion("KB국민카드", 70000, 100000, 10));

        goods2.setInfoTable(table2);
        goods2.setOptions(options2);
        goods2.setCardPromotions(cards2);


        goodsList.add(goods1);
        goodsList.add(goods2);
        goodsList.add(goods1);
        goodsList.add(goods2);

        return goodsList;
    }

}
