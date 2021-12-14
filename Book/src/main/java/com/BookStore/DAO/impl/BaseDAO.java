package com.BookStore.DAO.impl;

import com.BookStore.utils.JdbcUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public abstract class BaseDAO {
private QueryRunner queryRunner=new QueryRunner();

  /**
   * update()方法用来执行 ：insert update delete语句
   * @return 如果返回 -1执行失败，返回其他 表示影响的行数。
   */
  public int update(String sql,Object...args){
  Connection conn= JdbcUtils.getConnection();
    try {
      return queryRunner.update(conn,sql,args);
    } catch (SQLException e) {
      e.printStackTrace();
    }finally {
      JdbcUtils.close(conn);
    }
    return -1;
  }

  public <T> T queryForOne(Class<T>  type,String sql,Object...args){
    Connection conn=JdbcUtils.getConnection();
    try {
      return  queryRunner.query(conn,sql,new BeanHandler<T>(type),args);
    } catch (SQLException e) {
      e.printStackTrace();
    }finally {
      JdbcUtils.close(conn);
    }
    return null;
  }

  public <T> List<T> queryForList(Class<T>  type, String sql, Object...args){
    Connection conn=JdbcUtils.getConnection();
    try {
      return  queryRunner.query(conn,sql,new BeanListHandler<T>(type),args);
    } catch (SQLException e) {
      e.printStackTrace();
    }finally {
      JdbcUtils.close(conn);
    }
    return null;
  }

  public Object queryForSingleValue(String sql,Object...args){
    Connection conn = JdbcUtils.getConnection();
    try {
      return queryRunner.query(conn,sql,new ScalarHandler(),args);
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      JdbcUtils.close(conn);
    }
    return null;
  }

}
