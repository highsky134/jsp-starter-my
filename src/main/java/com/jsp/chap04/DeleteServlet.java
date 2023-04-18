package com.jsp.chap04;


import com.jsp.repository.DancerRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/dancer/delete")
public class DeleteServlet extends HttpServlet {

    private final DancerRepository repository = new DancerRepository();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");

        repository.delete(name);

        resp.sendRedirect("/dancer/join");
    }
}
