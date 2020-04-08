package com.plateer.controller;

import com.plateer.S3Client;
import com.plateer.domain.Category;
import com.plateer.logic.CategoryLogic;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.File;
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

    @Autowired
    private S3Client s3Client;

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

    @GetMapping("/s3test")
    public void fileUpload() {
        File file = new File("C:\\Users\\notebiz1029\\Desktop\\sloth_1f9a5.png");

        s3Client. fileUpload("iamnamuneulbo.png", file);
    }


}
