package javaCampProject.northwind.business.abstracts;

import java.util.List;

import javaCampProject.northwind.core.utilities.results.DataResult;
import javaCampProject.northwind.core.utilities.results.Result;
import javaCampProject.northwind.entities.concretes.Product;

public interface ProductService {
	DataResult<List<Product>> getAll();
	Result add(Product product);
}
