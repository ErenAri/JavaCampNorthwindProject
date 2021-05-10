package javaCampProject.northwind.business.abstracts;

import java.util.List;

import javaCampProject.northwind.entities.concretes.Product;

public interface ProductService {
	List<Product> getAll();
}
