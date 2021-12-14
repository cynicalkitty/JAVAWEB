package com.BookStore.service;

import com.BookStore.pojo.User;

public interface UserService {
  /**
   * 注册 用户
   * @param user
   */
  public void registerUser(User user);

  /**
   * 用户登录
   * @param user
   * @return
   */
  public User login(User user);

  /**
   * 检查用户名是否可用
   * @param name
   * @return 返回True表示用户名已存在，返回False用户不存在。
   */
  public boolean existUsername(String name);
}
