package com.plateer.controller;

import com.plateer.domain.dto.CardPromotion;
import com.plateer.domain.dto.GoodsDto;

import com.plateer.domain.dto.InfoTableRow;
import com.plateer.domain.dto.Option;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(allowCredentials = "true", origins = {"*"}, methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT},
        allowedHeaders = {"Content-Type", "X-Requested-With", "accept", "Origin", "Access-Control-Request-Method",
                "Access-Control-Request-'head'ers", "Access-Control-Allow-Origin", "Set-Cookie"},
        exposedHeaders = {"Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"}, maxAge = 3000)
@RestController
@RequestMapping("/api/goods")
public class GoodsController {

    @GetMapping("/{goodsCode}")
    public GoodsDto getGoodsDto(@PathVariable String goodsCode) {
        GoodsDto goodsDto = new GoodsDto(
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
        table.add(new InfoTableRow("Size", "1 x 2"));
        List<Option> options = new ArrayList<>();
        options.add(new Option("220", "220"));
        List<CardPromotion> cards = new ArrayList<>();
        cards.add(new CardPromotion("하나카드", 70000, 100000, 10));

        goodsDto.setInfoTable(table);
        goodsDto.setOptions(options);
        goodsDto.setCardPromotions(cards);



        GoodsDto goodsDto2 = new GoodsDto(
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
        table2.add(new InfoTableRow("제품소재", "겉감 : 폴리에스터100%"));
        List<Option> options2 = new ArrayList<>();
        options2.add(new Option("아이보리", "0"));
        List<CardPromotion> cards2 = new ArrayList<>();
        cards2.add(new CardPromotion("KB국민카드", 70000, 100000, 10));

        goodsDto2.setInfoTable(table2);
        goodsDto2.setOptions(options2);
        goodsDto2.setCardPromotions(cards2);


        if(goodsDto.getGoodsCode().equals(goodsCode)) {
            return goodsDto;
        }
        else {
            return goodsDto2;
        }
    }

    @GetMapping("/goodslist/{goodsSet}")
    public List<GoodsDto> getGoodsDtoList(@PathVariable String goodsSet) {
        List<GoodsDto> goodsDtoList = new ArrayList<>();

        GoodsDto goodsDto1 = new GoodsDto(
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
        table.add(new InfoTableRow("Size", "1 x 2"));
        List<Option> options = new ArrayList<>();
        options.add(new Option("220", "220"));
        List<CardPromotion> cards = new ArrayList<>();
        cards.add(new CardPromotion("하나카드", 70000, 100000, 10));

        goodsDto1.setInfoTable(table);
        goodsDto1.setOptions(options);
        goodsDto1.setCardPromotions(cards);

        GoodsDto goodsDto2 = new GoodsDto(
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
        table2.add(new InfoTableRow("제품소재", "겉감 : 폴리에스터100%"));
        List<Option> options2 = new ArrayList<>();
        options2.add(new Option("아이보리", "0"));
        List<CardPromotion> cards2 = new ArrayList<>();
        cards2.add(new CardPromotion("KB국민카드", 70000, 100000, 10));

        goodsDto2.setInfoTable(table2);
        goodsDto2.setOptions(options2);
        goodsDto2.setCardPromotions(cards2);


        goodsDtoList.add(goodsDto1);
        goodsDtoList.add(goodsDto2);
        goodsDtoList.add(goodsDto1);
        goodsDtoList.add(goodsDto2);
        goodsDtoList.add(goodsDto1);
        goodsDtoList.add(goodsDto2);

        return goodsDtoList;
    }

    @GetMapping("/goodslist/{cartUserId}")
    public List<GoodsDto> getCartGoodsList(@PathVariable String cartUserId) {
//                select *
//                from goods
//                inner join cart
//                on goods.goodsCode = cart.goodsCode
//                        where user_id = 'aaa';

        List<GoodsDto> goodsDtoList = new ArrayList<>();

        GoodsDto goodsDto1 = new GoodsDto(
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
        table.add(new InfoTableRow("Size", "1 x 2"));
        List<Option> options = new ArrayList<>();
        options.add(new Option("220", "220"));
        List<CardPromotion> cards = new ArrayList<>();
        cards.add(new CardPromotion("하나카드", 70000, 100000, 10));

        goodsDto1.setInfoTable(table);
        goodsDto1.setOptions(options);
        goodsDto1.setCardPromotions(cards);

        GoodsDto goodsDto2 = new GoodsDto(
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
        table2.add(new InfoTableRow("제품소재", "겉감 : 폴리에스터100%"));
        List<Option> options2 = new ArrayList<>();
        options2.add(new Option("아이보리", "0"));
        List<CardPromotion> cards2 = new ArrayList<>();
        cards2.add(new CardPromotion("KB국민카드", 70000, 100000, 10));

        goodsDto2.setInfoTable(table2);
        goodsDto2.setOptions(options2);
        goodsDto2.setCardPromotions(cards2);


        goodsDtoList.add(goodsDto1);
        goodsDtoList.add(goodsDto2);
        goodsDtoList.add(goodsDto1);
        goodsDtoList.add(goodsDto2);
        goodsDtoList.add(goodsDto1);
        goodsDtoList.add(goodsDto2);

        return goodsDtoList;
    }
}
