package com.example._06servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
/*
* 1.接收客户端请求，响应数据。
*
*
* */

public class HelloServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    System.out.println("HelloServlet 的doGet方法");
    ServletContext  context = getServletConfig().getServletContext();
    String name=context.getInitParameter("name");

    context.getContextPath();

  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    System.out.println("HelloServlet 的doPost方法");

  }
}
