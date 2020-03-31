package com.plateer.logic;

import com.plateer.CategoryService;
import com.plateer.domain.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryLogic implements CategoryService {
    @Autowired
    private CategoryDaoImpl categoryDao;

    @Override
    public void createCategory(Category category) {

        categoryDao.save(category);
    }

    @Override
    public Category readCategory(String categoryCode) {
        //
        return categoryDao.find(categoryCode);
    }

    @Override
    public List<Category> readCategoryList(String categoryCode) {

        return categoryDao.findCategoryList(categoryCode);
    }

    @Override
    public List<String> readCategoryGoodsList(String categoryCode) {

        return categoryDao.findCategoryGoodsList(categoryCode);
    }

    @Override
    public void updateCategory(String categoryCode, Category newCategory) {

        categoryDao.update(categoryCode, newCategory);
    }

    @Override
    public void deleteCategory(String categoryCode) {

        categoryDao.delete(categoryCode);
    }
}
