package vn.projectLTW.service.Impl;

import java.util.List;

import vn.projectLTW.model.Users;
import vn.projectLTW.service.IUserService;

public class UserServiceImpl implements IUserService {

	@Override
	public List<Users> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users findOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Users user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Users user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean register(String email, String passWord, String userName, String fullName, String phone) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Users login(String userName, String passWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean checkExistEmail(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkExistUserName(String userName) {
		// TODO Auto-generated method stub
		return false;
	}

}
