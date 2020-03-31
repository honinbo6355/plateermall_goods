package com.plateer.mapper;

import com.plateer.domain.Category;
import com.plateer.domain.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {

    String insert(Category category);

    Category select(String categoryCode);

    List<String> selectCategoryGoods(String categoryCode); // 카테고리의 상품 목록들을 가져올 때 사용

    List<Category> selectCategoryList(String categoryCode); // 카테고리의 하위 카테고리들을 가져올 때 사용

    void update(String categoryCode, Category newCategory);

    void delete(String categoryCode);
}