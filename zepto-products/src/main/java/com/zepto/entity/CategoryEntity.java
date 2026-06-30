package com.zepto.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "category") // parent
public class CategoryEntity
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long category_id;
	private String category;
	private String status;

	@OneToMany(mappedBy = "category", cascade = CascadeType.ALL, fetch = FetchType.EAGER) // one category will have multiple products
	private List<ProductEntity> product;

	public long getCategory_id()
	{
		return category_id;
	}

	public void setCategory_id(long category_id)
	{
		this.category_id = category_id;
	}

	public String getCategory()
	{
		return category;
	}

	public void setCategory(String category)
	{
		this.category = category;
	}

	public String getStatus()
	{
		return status;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}

	public List<ProductEntity> getProduct()
	{
		return product;
	}

	public void setProduct(List<ProductEntity> product)
	{
		this.product = product;
	}

}
