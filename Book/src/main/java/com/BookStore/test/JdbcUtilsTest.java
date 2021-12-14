package com.BookStore.test;
import com.BookStore.utils.JdbcUtils;
import org.junit.Test;
public class JdbcUtilsTest {
  @Test
  public void  testJdbcUtils(){
    System.out.println(JdbcUtils.getConnection());

  }
}
