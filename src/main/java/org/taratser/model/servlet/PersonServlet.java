package org.taratser.model.servlet;

import org.taratser.model.database.PersonPersist;
import org.taratser.model.dto.LoanDTO;
import org.taratser.model.dto.PersonDTO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;
import java.util.Set;

/**
 * Created by taratser on 24.05.2016.
 */
public class PersonServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("PersonServlet doGet method");
        req.getRequestDispatcher("/WEB-INF/pages/person.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("PersonServlet doPost method.");
        Map<String, String[]> parameterMap = req.getParameterMap();
        System.out.println("parameterMap = " + parameterMap);
        Set<Map.Entry<String, String[]>> entrySet = parameterMap.entrySet();
        PersonDTO personDTO = new PersonDTO();
        personDTO.setValues(entrySet);
        System.out.println(personDTO);
        try {
            PersonPersist.save(personDTO);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
