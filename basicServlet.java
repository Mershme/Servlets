package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

// Sets the name and the URL to use on the server
@WebServlet(name="basicServlet",urlPatterns={"/basicServlet"})
public class basicServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Sets the content type to html and the encoding to UTF-8
    	response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        // This is used to be able to write to the page
        try (PrintWriter writer = response.getWriter()) {

        	// This is writing to the page using simple formats and commands in html
            writer.println("<!DOCTYPE html><html>");
            writer.println("<head>");
            writer.println("<meta charset=\"UTF-8\" />");
            writer.println("<title>ServletExample.java:doGet(): Servlet code!</title>");
            writer.println("</head>");
            writer.println("<body>");

            writer.println("<h1>This is a simple java servlet.</h1>");

            writer.println("</body>");
            writer.println("</html>");
        }
    }
}
