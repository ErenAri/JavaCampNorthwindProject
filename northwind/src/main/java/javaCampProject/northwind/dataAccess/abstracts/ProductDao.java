package javaCampProject.northwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javaCampProject.northwind.entities.concretes.Product;
import javaCampProject.northwind.entities.dtos.ProductWithCategoryDto;

public interface ProductDao extends JpaRepository<Product,Integer>{
	Product getByProductName(String productName);
	
	Product getByProductNameAndCategory_CategoryId(String productName, int categoryId);
	
	List<Product> getByProductNameOrCategory(String productName, int categoryId);

	List<Product> getCategoryIn(List<Integer> categories);
	
	List<Product> getByProductNameContains(String productName);
	
	List<Product> getByProductNameStartsWith(String productName);

	@Query("From Product where productName=:productName and category. category_Id=:categoryId")
	List<Product> getNameAndCategory(String productName, int categoryId);
	
	@Query("Select new javaCampProject.northwind.entities.dtos.ProductWithCategoryDto(p.productId, p.productName, c.categoryName) From Category c Inner Join c.products p")
	List<ProductWithCategoryDto> getProductWithCategoryDetails();
}
