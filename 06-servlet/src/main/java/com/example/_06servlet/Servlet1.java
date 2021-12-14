package com.example._06servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Servlet1 extends HttpServlet
{
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String username=req.getParameter("username");

    req.setAttribute("key","1已处理");

    RequestDispatcher requestdipatcher=req.getRequestDispatcher("/servlet2");

    requestdipatcher.forward(req,resp);
  }
}
