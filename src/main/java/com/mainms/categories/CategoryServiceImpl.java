package com.mainms.categories;

import com.mainms.categories.dto.CategoryDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
public class CategoryServiceImpl implements ICategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public CategoryModel addCategory(CategoryModel category) {
        return categoryRepository.save(category);
    }

    @Override
    public List<CategoryModel> getAllCategories() {
        return categoryRepository.findAll();
    }


    @Override
    public CategoryModel getCategoryBody(CategoryDto categoryDto) {
        return CategoryModel.builder()
                .description(categoryDto.getDescription())
                .name(categoryDto.getName())
                .build();
    }
}
