package mvcapp.AppV2.services.impl;

import java.util.List;

import mvcapp.AppV2.models.entity.CategoryModel;

/**
 * ICategoryService
 */
public interface ICategoryService {

  List<CategoryModel> getAll();

  CategoryModel getById(Integer id);

  CategoryModel save(CategoryModel categoryModel);

  CategoryModel update(CategoryModel categoryModel);

  // CategoryModel delete(Integer id);
}