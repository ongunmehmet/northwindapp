package workshopio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import workshopio.northwind.business.abstracts.ProductService;
import workshopio.northwind.dataAccess.abstracts.ProductDao;
import workshopio.northwind.entity.concretes.Products;
@Service
public class ProductManager implements ProductService {

	private ProductDao productDao;
	@Autowired
	public ProductManager(ProductDao productDao) {
		
		this.productDao = productDao;
	}
	@Override
	public List<Products> getAll() {
		// TODO Auto-generated method stub
		return this.productDao.findAll();
	}

}
