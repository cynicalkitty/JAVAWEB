package com.BookStore.DAO;
import com.BookStore.pojo.User;
public interface UserDAO {
  /**
   * 根据用户名查询用户信息
   * @param name  username用户名
   * @return 如果返回 null 说明没有这个用户
   */
  public User queryUserByUsername(String name);
  /**
   * 根据用户名和密码查询用户信息
   * @param name
   * @param password
   * @return  如果返回 null,说明 用户名和或密码错误。
   */
  public  User queryUserByUsernameAndPassword(String name,String password);
  /**
   * 保存用户信息
   * @param user
   * @return
   */

  public int  saveUser(User user);


}
