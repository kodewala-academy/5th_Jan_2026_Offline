package com.zepto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.zepto.entity.CategoryEntity;

@Repository
public interface CategoryRepository extends CrudRepository<CategoryEntity, Long>
{
 // for basic CURD operation keep this as empty only 
	
	public CategoryEntity findByCategory(String input);
	
	@Query("SELECT c FROM CategoryEntity c JOIN FETCH c.product")
	public List<CategoryEntity> findAllCategories();
	
	
}
