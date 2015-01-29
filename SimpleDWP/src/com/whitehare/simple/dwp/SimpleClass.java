package com.whitehare.simple.dwp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

@WebServlet("/simpleTC")
public class SimpleClass extends HttpServlet
{

  private static Logger log = Logger.getLogger("Demo1");

  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
  {
    PrintWriter out = response.getWriter();
    out.println("Hello, World");
    log.debug("This is a Debug Message to the logger");
  }
}
