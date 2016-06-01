package org.taratser.model.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by taratser on 18.05.2016.
 */
@WebServlet(name = "MainServlet")
public class MainServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String country = getServletConfig().getInitParameter("country");
        System.out.println("MainServlet doGet method. Country is: " + country);
        request.setAttribute("country", country);
        request.getRequestDispatcher("/WEB-INF/pages/main.jsp").forward(request, response);
    }
}
