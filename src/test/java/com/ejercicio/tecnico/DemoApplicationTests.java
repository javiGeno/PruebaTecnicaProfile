package com.ejercicio.tecnico;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import com.ejercicio.tecnico.dao.ProductDao;

@AutoConfigureMockMvc
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
@SpringBootTest
class DemoApplicationTests {

	 

	 @Autowired
	 private MockMvc mockMvc;
	 
	 private static final String URL = "/api/product";
	 
	 /*
	  * 
	  *  Test 1: petición a las 10:00 del día 14 del producto 35455   para la brand 1 (ZARA)
		 Test 2: petición a las 16:00 del día 14 del producto 35455   para la brand 1 (ZARA)
         Test 3: petición a las 21:00 del día 14 del producto 35455   para la brand 1 (ZARA)
         Test 4: petición a las 10:00 del día 15 del producto 35455   para la brand 1 (ZARA)
         Test 5: petición a las 21:00 del día 16 del producto 35455   para la brand 1 (ZARA)
	  */
	
	@Test
	void ControlerTest1() throws Exception {
		
		String request="{\"brand\": 1, \"dateAplication\":\"2020-06-14 10:00:00\",\"product\":35455}";
		Integer brand=1;
	    String datApp="2020-06-14 10:00:00";
	    Integer product=35455;
		runEndpoint(request,brand, datApp,product );
	}
	
	@Test
	void ControlerTest2() throws Exception {
		
		String request="{\"brand\": 1, \"dateAplication\":\"2020-06-14 16:00:00\",\"product\":35455}";
		Integer brand=1;
	    String datApp="2020-06-14 10:00:00";
	    Integer product=35455;
		runEndpoint(request,brand, datApp,product );
		
	}
	
	@Test
	void ControlerTest3() throws Exception {
		
		String request="{\"brand\": 1, \"dateAplication\":\"2020-06-14 21:00:00\",\"product\":35455}";
		Integer brand=1;
	    String datApp="2020-06-14 10:00:00";
	    Integer product=35455;
		runEndpoint(request,brand, datApp,product );
	}
	
	@Test
	void ControlerTest4() throws Exception {
		
		String request="{\"brand\": 1, \"dateAplication\":\"2020-06-15 10:00:00\",\"product\":35455}";
		Integer brand=1;
	    String datApp="2020-06-14 10:00:00";
	    Integer product=35455;
		runEndpoint(request,brand, datApp,product );
	}
	
	@Test
	void ControlerTest5() throws Exception {
		
		String request="{\"brand\": 1, \"dateAplication\":\"2020-06-16 16:00:00\",\"product\":35455}";
		Integer brand=1;
	    String datApp="2020-06-14 10:00:00";
	    Integer product=35455;
		runEndpoint(request,brand, datApp,product );
	}
	
	void runEndpoint(String jsonRequest, Integer brand, String dateApp, Integer product) throws Exception
	{
		 this.mockMvc.perform(MockMvcRequestBuilders.post(URL)
	                .contentType(MediaType.APPLICATION_JSON)
	                .content(jsonRequest)
	                .accept(MediaType.APPLICATION_JSON))
	                .andDo(print())
	                .andReturn();
	}

	

}
