package workshopio.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import workshopio.northwind.entity.concretes.Products;

public interface ProductDao extends JpaRepository<Products, Integer>{

}
