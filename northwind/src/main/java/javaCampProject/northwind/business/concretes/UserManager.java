package javaCampProject.northwind.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javaCampProject.northwind.business.abstracts.UserService;
import javaCampProject.northwind.core.dataAccess.UserDao;
import javaCampProject.northwind.core.entities.User;
import javaCampProject.northwind.core.utilities.results.DataResult;
import javaCampProject.northwind.core.utilities.results.Result;
import javaCampProject.northwind.core.utilities.results.SuccessDataResult;
import javaCampProject.northwind.core.utilities.results.SuccessResult;

@Service
public class UserManager implements UserService{

	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return new SuccessResult("Kullanıcı eklendi");
	}

	@Override
	public DataResult<User> findByEmail(String email) {
		
		return new SuccessDataResult<User>(this.userDao.findByEmail(email),"Kullanıcı bulundu");
	}

}
