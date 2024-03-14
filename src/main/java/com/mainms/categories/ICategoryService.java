package com.mainms.categories;

import com.mainms.categories.dto.CategoryDto;

import java.util.List;


public interface ICategoryService {
    CategoryModel addCategory(CategoryModel category);

    CategoryModel getCategoryBody(CategoryDto categoryDto);

    List<CategoryModel> getAllCategories();
}
