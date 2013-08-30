package com.mathlab.service;

import java.util.List;

import com.mathlab.model.Authority;

public interface AuthService {
  
	void addAuth(Authority auth);
    public List<Authority> listAuth();
    void deleteAuth(int id);
    public Authority queryAuth(int id);
    void updateAuth(Authority auth);
    
}
