package com.nt.service;

import java.util.List;

import com.nt.dto.ProductDTO;
import com.nt.dto.ProductResultDTO;

public interface ProductSearchService {
	
	public List<ProductResultDTO> getProduct(ProductDTO pDTO);

}
