package com.ccsw.tutorialcategory.category;

import org.springframework.data.repository.CrudRepository;

import com.ccsw.tutorialcategory.category.model.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {

}
