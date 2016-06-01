package org.taratser.model.servlet;

import org.taratser.model.dto.LoanDTO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

/**
 * Created by taratser on 25.05.2016.
 */
public class LoanServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("LoanServlet doGet method");
        req.getRequestDispatcher("/WEB-INF/pages/loan.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("MainServlet doPost method.");
        Map<String, String[]> parameterMap = req.getParameterMap();
        System.out.println("parameterMap = " + parameterMap);
        Set<Map.Entry<String, String[]>> entrySet = parameterMap.entrySet();
        LoanDTO loanDTO = new LoanDTO();
        loanDTO.setValues(entrySet);
        System.out.println(loanDTO);
    }
}
