package com.ejercicio.tecnico.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ejercicio.tecnico.Model.Prices;
import com.ejercicio.tecnico.dao.ProductDao;
import com.ejercicio.tecnico.dto.PricesInDTO;
import com.ejercicio.tecnico.dto.PricesOutDTO;
import com.ejercicio.tecnico.service.ProductService;

@Component
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductDao productDao;
	private final Logger LOG = Logger.getLogger("ProductServiceImpl");
	
	@Override
	public List<PricesOutDTO> getProductPrices(PricesInDTO prices) {
		
		LOG.info("ProductService : getProductPrices: arg Prices "+ prices.toString());

		
		List<Prices> p= (ArrayList<Prices>) productDao.findByBrandIdAndproductIdBetweenDate(prices.getBrand(), prices.getProduct(), prices.getDateAplication());
		LOG.info("ProductService : bbdd: Prices "+ p.toString());
		
		
		
		return fillResponse(p) ;
	}
	
	private List<PricesOutDTO> fillResponse(List<Prices> p)
	{
		List<PricesOutDTO> out=new ArrayList<PricesOutDTO>();
		
		if(!(p.isEmpty()))
		{
			for (Prices price : p) {
				
				PricesOutDTO preciosOut=new PricesOutDTO();
				preciosOut.setBrandId(price.getBrandId());
				preciosOut.setEndDate(price.getEndDate());
				preciosOut.setStartDate(price.getStartDate());
				preciosOut.setProductId(price.getProductId());
				preciosOut.setPriceList(price.getPriceList());
				
				out.add(preciosOut);
				
			}
		}
		return out;
	}

}
