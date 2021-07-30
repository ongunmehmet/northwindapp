package workshopio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import workshopio.northwind.business.abstracts.ProductService;
import workshopio.northwind.entity.concretes.Products;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	
	private ProductService productService;
	@Autowired
	public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}

	@GetMapping("/getall")
	public List<Products> getAll(){
		return this.productService.getAll();
		
	}
	
}


