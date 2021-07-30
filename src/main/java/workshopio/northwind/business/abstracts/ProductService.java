package workshopio.northwind.business.abstracts;

import java.util.List;

import workshopio.northwind.entity.concretes.Products;

public interface ProductService {
	List<Products> getAll();

}
