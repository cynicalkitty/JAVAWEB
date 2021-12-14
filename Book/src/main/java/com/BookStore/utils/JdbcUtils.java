package com.BookStore.utils;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Map;
import java.util.Properties;

public class JdbcUtils {
  private static DruidDataSource dataSource;
  static{

    try {
      //读取配置文件
      Properties properties=new Properties();
      InputStream inputStream = JdbcUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
      //从流中加载数据
      properties.load(inputStream);
      //创建数据库连接池
      dataSource= (DruidDataSource) DruidDataSourceFactory.createDataSource(properties);
      System.out.println(dataSource.getConnection());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }


  public static Connection getConnection(){
    Connection conn=null;
    try {
      conn=dataSource.getConnection();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return conn;
  }

  public static void close(Connection  conn){
 if(conn!=null){
   try {
     conn.close();
   } catch (SQLException e) {
     e.printStackTrace();
   }
 }
  }
}
