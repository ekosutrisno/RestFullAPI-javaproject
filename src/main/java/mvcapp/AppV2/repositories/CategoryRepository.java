package mvcapp.AppV2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mvcapp.AppV2.models.entity.CategoryModel;

/**
 * CategoryRepository
 */
@Repository
public interface CategoryRepository extends JpaRepository<CategoryModel, Integer> {

}