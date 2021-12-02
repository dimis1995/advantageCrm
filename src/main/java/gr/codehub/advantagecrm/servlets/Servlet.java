package gr.codehub.advantagecrm.servlets;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Greeting", value = "/Greeting")
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.setContentType("text/html");
//
//        PrintWriter out = response.getWriter();
//        out.println("Url= " + request.getRequestURI() + "<br>");
//        out.println("Method= " + request.getMethod() + "<br>");
//        out.println("Header= " + request.getHeader("contentType") + "<br>");
//        out.println("Session= " + request.getSession() + "<br>");
//        out.println("RemoteUser= " + request.getRemoteUser() + "<br>");
//        out.println("<a href='index.jsp'>index</a>");

        double totalCost = 80;
        request.setAttribute("totalCost", totalCost);
        request.getRequestDispatcher("news.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
