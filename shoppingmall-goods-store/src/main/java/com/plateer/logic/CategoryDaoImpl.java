package com.plateer.logic;

import com.plateer.CategoryDao;
import com.plateer.domain.*;
import com.plateer.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryDaoImpl implements CategoryDao {
    //
    @Autowired
    private CategoryMapper categoryMapper;


    @Override
    public void save(Category category) {

        this.categoryMapper.insert(category);
    }

    @Override
    public Category find(String categoryCode) {

        Category foundedCategory = null;

        foundedCategory = this.categoryMapper.select(categoryCode);

        return foundedCategory;
    }

    @Override
    public List<String> findCategoryGoodsList(String categoryCode) {

        List<String> foundedGoods = null;

        foundedGoods = this.categoryMapper.selectCategoryGoods(categoryCode); // 카테고리의 상품 목록을 가져올 때 사용

        return foundedGoods;
    }

    @Override
    public List<Category> findGoodsCategoryList(String goodsCode) {

        List<Category> foundedCategory = null;

        foundedCategory = this.categoryMapper.selectGoodsCategory(goodsCode); // 카테고리의 상품 목록을 가져올 때 사용

        return foundedCategory;
    }

    @Override
    public List<Category> findCategoryList(String categoryCode) {

        List<Category> categoryList = null;

        categoryList = this.categoryMapper.selectCategoryList(categoryCode); // 카테고리의 하위 카테고리들을 가져올 때 사용

        return categoryList;
    }

    @Override
    public void update(String categoryCode, Category newCategory) {

        this.categoryMapper.update(categoryCode, newCategory);
    }

    @Override
    public void delete(String categoryCode) {

        this.categoryMapper.delete(categoryCode);
    }

}
