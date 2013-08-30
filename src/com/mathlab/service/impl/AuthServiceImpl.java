package com.mathlab.service.impl;

import java.util.List;

import com.mathlab.dao.AuthDao;
import com.mathlab.model.Authority;
import com.mathlab.service.AuthService;

public class AuthServiceImpl implements AuthService {
     
	private AuthDao authDao;

	public AuthDao getAuthDao() {
		return authDao;
	}

	public void setAuthDao(AuthDao authDao) {
		this.authDao = authDao;
	}

	public void addAuth(Authority auth) {
		authDao.insertAuth(auth);
	}
	
	public List<Authority> listAuth(){
		return authDao.listAuth();
	}

	public void deleteAuth(int id){
		authDao.deleteAuth(id);
	}
	
	public Authority queryAuth(int id){
		return authDao.getAuth(id);
	}
	
	public void updateAuth(Authority auth) {
		authDao.updateAuth(auth);
	}
}
