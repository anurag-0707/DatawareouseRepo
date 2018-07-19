package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.command.ProductSearchCommand;
import com.nt.dto.ProductDTO;
import com.nt.dto.ProductResultDTO;
import com.nt.service.ProductSearchService;

@Controller
public class ProductSearchController {

	@Autowired
	private ProductSearchService service;

	@RequestMapping("/searchProduct.htm")
	public String search(ModelMap map, @ModelAttribute ProductSearchCommand pCMD) {
		System.out.println(pCMD.getProductId());
		ProductDTO dto = new ProductDTO(pCMD.getProductId(), pCMD.getProductName(), pCMD.getQuantity());
		List<ProductResultDTO> listDTO = service.getProduct(dto);
		System.out.println(listDTO.toString());
		map.addAttribute("products", listDTO);
		System.out.println("HELLO");
		System.out.println("HELLO");
		
		return "product_show";
	}

}
