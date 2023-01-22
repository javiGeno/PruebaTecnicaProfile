package com.ejercicio.tecnico.service;


import java.util.List;

import com.ejercicio.tecnico.dto.PricesInDTO;
import com.ejercicio.tecnico.dto.PricesOutDTO;

public interface ProductService {
	
	public List<PricesOutDTO> getProductPrices(PricesInDTO prices);
}
