package com.mathlab.dao;

import java.util.List;

import com.mathlab.model.Authority;

public interface AuthDao {
  void insertAuth(Authority authority);
  void deleteAuth(int id);
  public List<Authority> listAuth();
  void updateAuth(Authority authority);
  public Authority getAuth(int id);
}
