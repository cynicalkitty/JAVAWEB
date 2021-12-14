package com.BookStore.DAO.impl;

import com.BookStore.DAO.UserDAO;
import com.BookStore.pojo.User;

public class UserDaoImpl extends BaseDAO implements UserDAO {

  @Override
  public User queryUserByUsername(String name) {
    String sql="select  `id`,`username`,`password`,`email` from  t_user where username=?";
    return queryForOne(User.class,sql,name);

  }

  @Override
  public User queryUserByUsernameAndPassword(String name, String password) {
    String sql="select  `id`,`username`,`password`,`email` from  t_user where username=?   and  password=?";
    return queryForOne(User.class,sql,name,password);
  }

  @Override
  public int saveUser(User user) {
    String sql="insert into t_user(`username`,`password`,`email`)  values(?,?,?)";
    return update(sql,user.getUsername(),user.getPassword(),user.getEmail());
  }
}
