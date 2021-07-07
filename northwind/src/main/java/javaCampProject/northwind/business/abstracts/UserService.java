package javaCampProject.northwind.business.abstracts;

import javaCampProject.northwind.core.entities.User;
import javaCampProject.northwind.core.utilities.results.DataResult;
import javaCampProject.northwind.core.utilities.results.Result;

public interface UserService {
	Result add(User user);
	DataResult<User> findByEmail(String email);
}
