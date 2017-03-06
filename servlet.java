package servlet;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
// sets the name and URL to map to in the server
@WebServlet(name="hello",urlPatterns={"/hello"})
public class servlet extends HttpServlet {
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
      throws ServletException, IOException {
	  
	// Very simple way to just print out "Hello World" without using HTML
    PrintWriter out = response.getWriter();
    out.println("Hello World");
  }
}