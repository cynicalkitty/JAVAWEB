package com.BookStore.service.impl;

import com.BookStore.DAO.UserDAO;
import com.BookStore.DAO.impl.UserDaoImpl;
import com.BookStore.pojo.User;
import com.BookStore.service.UserService;

public class UserServiceImpl implements UserService {
   private UserDAO userDAO=new UserDaoImpl();
  @Override
  public void registerUser(User user) {
    userDAO.saveUser(user);
  }

  @Override
  public User login(User user) {
    return null;
  }

  @Override
  public boolean existUsername(String name) {
    return false;
  }
}
