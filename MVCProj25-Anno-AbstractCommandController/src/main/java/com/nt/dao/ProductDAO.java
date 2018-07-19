package com.nt.dao;

import java.util.List;

import com.nt.bo.ProductBO;
import com.nt.bo.ProductResultBO;

public interface ProductDAO {
	
	public List<ProductResultBO> getProducts(ProductBO pBO);
	

}
