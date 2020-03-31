package com.plateer.controller;

import com.plateer.domain.Category;
import com.plateer.logic.CategoryLogic;
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
@RequestMapping("/api/category")
public class CategoryController {
    //
    @Autowired
    private CategoryLogic categoryLogic;

    @GetMapping("/")
    public List<Category> getTopCategoryList() {
        // root 카테고리 코드: 10000
        return categoryLogic.readCategoryList("10000");
    }

    @GetMapping("/{categoryCode}")
    public Category getCategory(@PathVariable String categoryCode) {

        return categoryLogic.readCategory(categoryCode);
    }

    @GetMapping("/list/{categoryCode}")
    public List<Category> getCategoryList(@PathVariable String categoryCode) {

        return categoryLogic.readCategoryList(categoryCode);
    }

    @GetMapping("/{categoryCode}/goods")
    public List<String> getCategoryGoods(@PathVariable String categoryCode) {

        return categoryLogic.readCategoryGoodsList(categoryCode);
    }

}
