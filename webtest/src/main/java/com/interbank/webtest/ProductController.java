package com.interbank.webtest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/product")
public class ProductController {
	
	
	@RequestMapping(value = "/listAll",method = RequestMethod.GET)
	List<String> listAll() {
			
		List<String> listado = new ArrayList<String>();
		
	
		for (int i = 0; i < 20; i++) {
			/*try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			listado.add(String.valueOf(i+1));
		}
		
		return listado;
	}
	

}
