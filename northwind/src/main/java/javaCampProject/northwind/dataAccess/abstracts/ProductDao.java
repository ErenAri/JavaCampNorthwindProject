package javaCampProject.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import javaCampProject.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product,Integer>{
	

}
