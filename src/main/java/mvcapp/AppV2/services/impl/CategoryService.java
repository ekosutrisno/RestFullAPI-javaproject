package mvcapp.AppV2.services.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mvcapp.AppV2.models.entity.CategoryModel;
import mvcapp.AppV2.repositories.CategoryRepository;
import mvcapp.AppV2.services.impl.ICategoryService;

/**
 * CategoryService
 */
@Service
@Transactional
public class CategoryService implements ICategoryService {

  @Autowired
  private CategoryRepository categoryRepository;

  @Override
  public List<CategoryModel> getAll() {
    List<CategoryModel> categoryModels = new ArrayList<>();
    for (CategoryModel categories : categoryRepository.findAll()) {
      if (!categories.getSiDelete()) {
        categoryModels.add(categories);
      }
    }
    return categoryModels;
  }

  @Override
  public CategoryModel getById(Integer id) {
    return categoryRepository.findById(id).get();
  }

  public CategoryModel save(CategoryModel categoryModel) {
    return null;
  }

  public CategoryModel update(CategoryModel categoryModel) {
    return null;
  }

}