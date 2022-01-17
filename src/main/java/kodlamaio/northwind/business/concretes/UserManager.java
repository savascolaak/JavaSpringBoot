package kodlamaio.northwind.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;

import kodlamaio.northwind.business.abstracts.UserService;
import kodlamaio.northwind.core.dataAccess.UserDao;
import kodlamaio.northwind.core.utilities.entities.User;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.core.utilities.results.SuccessResult;

public class UserManager implements UserService{

	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public Result add(User user) {
		// TODO Auto-generated method stub
		return new SuccessResult("Kulanıcı Eklendi");
	}

	@Override
	public DataResult<User> findByEmail(String email) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<User>(this.userDao.findByEmail(email),"Kullanıcı Bulundu....");
	}
	
	

}
