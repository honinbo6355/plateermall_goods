package com.plateer.controller;

import com.plateer.domain.*;

import com.plateer.domain.dto.GoodsSetDto;
import com.plateer.logic.GoodsLogic;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@CrossOrigin(allowCredentials = "true", origins = {"*"}, methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT},
        allowedHeaders = {"Content-Type", "X-Requested-With", "accept", "Origin", "Access-Control-Request-Method",
                "Access-Control-Request-'head'ers", "Access-Control-Allow-Origin", "Set-Cookie", "Authorization"},
        exposedHeaders = {"Access-Control-Allow-Origin", "Access-Control-Allow-Credentials", "token"}, maxAge = 3000)
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

    @GetMapping("/goodslist")
    public List<GoodsThumbnail> getGoodsList(GoodsSetDto goodsSetDto) {

        return goodsLogic.readThumbnailGoods(goodsSetDto.getCategoryCode(), goodsSetDto.getQuantity());
    }

    @PostMapping("/goodslist/cart")
    public List<CartGoods> getCartGoodsList(@RequestBody List<String> goodsCodeList) {

        return goodsLogic.readCartGoods(goodsCodeList);
    }
}
