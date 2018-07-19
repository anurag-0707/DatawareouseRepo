package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.nt.bo.ProductBO;
import com.nt.bo.ProductResultBO;
import com.nt.dao.ProductDAO;
import com.nt.dto.ProductDTO;
import com.nt.dto.ProductResultDTO;

@Service
public class ProductSearchServiceImpl implements ProductSearchService {

	@Autowired
	private ProductDAO dao;
	
	

	public ProductSearchServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public List<ProductResultDTO> getProduct(ProductDTO pDTO) {
		ProductBO pBO = new ProductBO();
		BeanUtils.copyProperties(pDTO, pBO);
		List<ProductResultBO> listBO = dao.getProducts(pBO);
		List<ProductResultDTO> listDTO = new ArrayList<>();
		ProductResultDTO dto = null;
		for (ProductResultBO bo : listBO) {
			dto = new ProductResultDTO();
			BeanUtils.copyProperties(bo, dto);
			listDTO.add(dto);
		}
		return listDTO;
	}

}
