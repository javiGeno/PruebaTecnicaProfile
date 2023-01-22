package com.ejercicio.tecnico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ejercicio.tecnico.dto.PricesInDTO;
import com.ejercicio.tecnico.dto.PricesOutDTO;
import com.ejercicio.tecnico.service.ProductService;

@RestController
@RequestMapping("api")
@Component
public class ProductPricesController {
	
	@Autowired
	ProductService productService;
	
	@PostMapping("/product")
    @ResponseBody
    public ResponseEntity<List<PricesOutDTO>> getPoductPrice(@RequestBody PricesInDTO prices) {
        return new ResponseEntity<List<PricesOutDTO>>(productService.getProductPrices(prices), HttpStatus.OK);
    }
}
