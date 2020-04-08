package com.plateer;

import com.plateer.domain.Category;
import com.plateer.domain.Goods;

import java.util.List;

public interface CategoryDao {

    void save(Category category);

    Category find(String categoryCode);

    List<String> findCategoryGoodsList(String categoryCode);

    List<Category> findGoodsCategoryList(String goodsCode);

    List<Category> findCategoryList(String categoryCode);

    void update(String categoryCode, Category newCategory);

    void delete(String categoryCode);
}
