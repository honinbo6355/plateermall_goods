package com.plateer;

import com.plateer.domain.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {

    void createCategory(Category category);

    Category readCategory(String categoryCode);

    List<Category> readCategoryList(String categoryCode);

    List<String> readCategoryGoodsList(String categoryCode);

    void updateCategory(String categoryCode, Category newCategory);

    void deleteCategory(String categoryCode);
}
