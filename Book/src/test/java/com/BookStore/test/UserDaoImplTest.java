package com.BookStore.test;

import com.BookStore.DAO.UserDAO;
import com.BookStore.DAO.impl.UserDaoImpl;
import com.BookStore.pojo.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserDaoImplTest {

  @Test
  public void queryUserByUsername() {
    UserDAO userdao=new UserDaoImpl();

    User user=userdao.queryUserByUsername("admin");
    System.out.println(user.toString());
  }

  @Test
  public void queryUserByUsernameAndPassword() {
    UserDAO userDAO=new UserDaoImpl();
    System.out.println(userDAO.queryUserByUsernameAndPassword("admin","admin").toString());
  }

  @Test
  public void saveUser() {
    UserDAO userDAO=new UserDaoImpl();
    User user=new User(2,"mary","123","mary@163.com");
    userDAO.saveUser(user);
  }
}
